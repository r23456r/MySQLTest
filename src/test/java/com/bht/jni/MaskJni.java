package com.bht.jni;

/**
 * 数据脱敏及数据简单加密类
 * @author Weigang Lee
 * @version 1.0
 * @since 2020-11-26
 */
public class MaskJni {
	/**
	 * 得到JNI库的版本
	 * 
	 * @return JNI版本信息
	 */
	public native static byte[] GetJNIVersion();
	
	/**
	 * 验证是否有合法授权
	 * @param pin	授权密钥
	 * @return 成功返回0，否则返回非0
	 */
	public native static int VerifyPin(byte[] pin);
	
	/**
	 * 数字类型数据加密
	 * @param plaintext	待加密的数字型数据
	 * @return	返回加密后的密文数据
	 */
	public native static byte[] NumEncrypt(byte[] plaintext);
	
	/**
	 * 数字类型数据解密
	 * @param ciphertext	待解密的数字型数据密文
	 * @return	解密后的数字型数据明文
	 */
	public native static byte[] NumDecrypt(byte[] ciphertext);
	
	/**
	 * 数字字母类型数据加密
	 * @param plaintext	待加密的数字字母型数据
	 * @return	返回加密后的密文数据
	 */
	public native static byte[] AlphanumEncrypt(byte[] plaintext);
	
	/**
	 * 数字字母类型数据解密
	 * @param ciphertext	待解密的数字字母型数据密文
	 * @return	解密后的数字字母型数据明文
	 */
	public native static byte[] AlphanumDecrypt(byte[] ciphertext);
	
	/**
	 * UTF-8编码长度为3字节(中文等)数据加密
	 * @param plaintext 数据明文，需先将源数据采用Base64编码
	 * @return 加密后的密文Base64
	 */
	public native static byte[] UTF3BEncrypt(byte[] plaintext);
	
	/**
	 * UTF-8编码长度3字节(中文等)的Base64加密密文解密
	 * @param ciphertext Base64密文
	 * @return 明文的Base64
	 */
	public native static byte[] UTF3BDecrypt(byte[] ciphertext);
	
	static {
		System.loadLibrary("DataMask");
	}
}
