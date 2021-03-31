package com.bochtec.mysql;

import com.bht.jni.MaskJni;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.Base64;


@Slf4j
public class Test {

    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }


    public static void main(String[] args) throws UnsupportedEncodingException {

        MaskJni.VerifyPin(parseHexStr2Byte("D8FF9FC9691F33CB3286E51BC013DD70"));
        System.out.println(new String(MaskJni.GetJNIVersion()));
        byte[] b = MaskJni.AlphanumEncrypt("123333456dfgfd".getBytes());
        System.out.println("原文：123333456dfgfd");
        System.out.println("加密后：" + new String(b));
        byte[] b1 = MaskJni.AlphanumDecrypt(b);
        System.out.println("解密后：" + new String(b1));


        byte[] a = MaskJni.NumEncrypt("123456789".getBytes());
        System.out.println("原文：123456789");
        System.out.println("加密后：" + new String(a));
        byte[] a1 = MaskJni.NumDecrypt(a);
        System.out.println("解密后：" + new String(a1));
        try {
            byte[] b2 = MaskJni.UTF3BEncrypt(Base64.getEncoder().encode("阿萨德".getBytes("UTF-8")));
            System.out.println("-------------=" + new String(b2));
            byte[] b3 = MaskJni.UTF3BDecrypt(b2);
            System.out.println(new String(Base64.getDecoder().decode(b3), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("------");
        String en = new String(MaskJni.UTF3BEncrypt(Base64.getEncoder().encode("公司".getBytes())));
        System.out.println("加密后：" + en);
        //汉字解密
        System.out.println(new String(Base64.getDecoder().decode(MaskJni.UTF3BDecrypt("726v80CD9L6m0LqrKOWkquWOnynmsb5ovabnp0/otYHmnInpmZDlhazlj9g=".getBytes())), "UTF-8"));
        //tb_businessInfo
        System.out.println(new String(MaskJni.AlphanumDecrypt("19473602MA8L99NA2D".getBytes())));
        System.out.println(new String(Base64.getDecoder().decode(MaskJni.UTF3BDecrypt("7piM8ZCJ8biC0piM9aG49JSs0I+c2om37Y+R8bqX".getBytes()))));
        //tb_seller
        System.out.println("===");
    }
}
