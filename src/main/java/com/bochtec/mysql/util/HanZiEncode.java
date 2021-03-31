package com.bochtec.mysql.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author: zhangyuhang
 * @modified By：
 * @date ：Created in 2020/11/23 15:51
 **/
public class HanZiEncode {

    private static final Base64.Encoder ENCODER = Base64.getEncoder();
    private static final String IGNORE_STR = "+/=";
    private static final String KEY = "boch";

    public static String encode(String str) {

        byte[] utf8Bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] keyBytes = KEY.getBytes();
        byte[] cipherBytes = ENCODER.encode(utf8Bytes);
        byte[] result = new byte[cipherBytes.length];
        for (int i = 0; i < cipherBytes.length; i++) {

            //如果是 = + \，原样输出
            byte ciperByte = cipherBytes[i];
            String ciperChar = String.valueOf(ciperByte);
            if (IGNORE_STR.contains(ciperChar)) {
                result[i] = ciperByte;
                continue;
            }
            //加密
            byte i1;

            //加密前是大写字母
            if (highCase(ciperByte)) {
                i1 = (byte) ((cipherBytes[i] + keyBytes[i % 4] % 26));
                //加密后依然是大写字母，写回
                if (highCase(i1)) {
                    ciperByte = i1;
                } else {
                    //取获得新的大写字母
                    ciperByte = (byte) (i1 - 26);
                }
            }
            if (lowCase(ciperByte)) {
                i1 = (byte) ((cipherBytes[i] + keyBytes[i % 4] % 26));
                if (lowCase(i1)) {
                    ciperByte = i1;
                } else {
                    ciperByte = (byte) (i1 - 26);
                }
            }
            if (numCase(ciperByte)) {
                i1 = (byte) ((cipherBytes[i] + keyBytes[i % 4] % 10));
                if (numCase(i1)) {
                    ciperByte = i1;
                } else {
                    ciperByte = (byte) (i1 - 10);
                }
            }
            result[i] = ciperByte;
        }
        return new String(result);
    }

    private static Boolean lowCase(Byte b) {
        return b >= 'a' && b <= 'z';
    }

    private static Boolean highCase(Byte b) {
        return b >= 'A' && b <= 'Z';
    }

    private static Boolean numCase(Byte b) {
        return b >= '0' && b <= '9';
    }

    private static String byteArrToHexString(byte[] b) {
        String result = "";
        for (byte aB : b) {
            result += Integer.toString((aB & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    private static String toHexString1(byte[] b) {
        StringBuffer buffer = new StringBuffer();
        for (byte aB : b) {
            buffer.append(toHexString1(aB));
        }
        return buffer.toString();
    }

    private static String toHexString1(byte b) {
        String s = Integer.toHexString(b & 0xFF);
        if (s.length() == 1) {
            return "0" + s;
        } else {
            return s;
        }
    }
}
