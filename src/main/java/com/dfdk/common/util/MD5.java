package com.dfdk.common.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5 {
	
	private static final String  ENCRYP_MD5 = "MD5";
	/**
	 * MD5鍔犲瘑鐨勫��
	 * @param pwd 鍘熷瀵嗙爜
	 * @return 杩斿洖鍔犲瘑鐨勫��
	 */
	public static String getMD5String(String pwd) {
		ByteSource salt = ByteSource.Util.bytes(Const.SALT_VALUE);
		String MD5Pwd = new SimpleHash(ENCRYP_MD5,pwd,salt).toString();
		return MD5Pwd;
	}
	
	/**
	 * 璁剧疆鍘熷瀵嗙爜鐨勭洂鍊�
	 * @return 鍘熷瀵嗙爜鐨勫姞瀵嗗��
	 */
	public static String getOriginPwdMD5String() {
		ByteSource salt = ByteSource.Util.bytes(Const.SALT_VALUE);
		String MD5Pwd = new SimpleHash(ENCRYP_MD5,Const.ORIGIN_PASSWORD,salt).toString();
		return MD5Pwd;
	}
	
	public static void main(String[] args) {
		System.out.println(getOriginPwdMD5String());
	}
}
