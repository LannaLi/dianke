package com.dfdk.common.util;

import java.util.Arrays;

/**
 * 闅忔満宸ュ叿绫�
 * @author Lanna
 *
 */
public class RangeUtil {
	
	private static final char[] CHAR_CODE = { '1', '2', '3', '4', '5', '6',
			 '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
			 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
			 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	
	/**
	 * @param Simple  鍙寘鍚暟瀛�
	 * @param Medium  Medium鍖呭惈鏁板瓧鍜屽皬鍐欒嫳鏂�
	 * @param Hard    Hard鍖呭惈鏁板瓧鍜屽ぇ灏忓啓鑻辨枃
	 * @author Lanna
	 *
	 */
	public enum Level{Simple,Medium,Hard};
	
	
	public static char[] getSecurityCode(int length,Level level,boolean isRepeat) {
		//闅忔満鐢熸垚鐨勫瓧绗﹂暱搴�
		int len = length;
		char[] code;
		switch (level) {
		case Simple:
			code = Arrays.copyOfRange(CHAR_CODE,0,9);
			break;
		case Medium:	
			code = Arrays.copyOfRange(CHAR_CODE,0,33);
			break;
		case Hard:
			code = Arrays.copyOfRange(CHAR_CODE,0,CHAR_CODE.length);
			break;
		default:
			code = Arrays.copyOfRange(CHAR_CODE,0,CHAR_CODE.length);
			break;
		}
		// 瀛楃闆嗗悎闀垮害
		 int n = code.length;
		 // 鎶涘嚭杩愯鏃跺紓甯�
		 if (len > n && isRepeat == false) {
			 throw new RuntimeException(
				String.format(
						"璋冪敤getSecurityCode(%1$s,%2$s,%3$s)鍑虹幇寮傚父,"
						+ "褰搃sRepeat涓�%3$s鏃�,浼犲叆鍙傛暟%1$s涓嶈兘澶т簬%4$s", len,level, isRepeat, n
						)
				);
		 }
		 // 瀛樻斁鎶藉彇鍑烘潵鐨勫瓧绗�
		 char[] result = new char[len];
		 // 鍒ゆ柇鑳藉惁鍑虹幇閲嶅鐨勫瓧绗�
		 if (isRepeat) {
			 for (int i = 0; i < result.length; i++) {
				 // 绱㈠紩 0 and n-1
				 int r = (int) (Math.random() * n);
				 // 灏唕esult涓殑绗琲涓厓绱犺缃负codes[r]瀛樻斁鐨勬暟鍊�
				 result[i] = code[r];
			 }
		 } else {
			 for (int i = 0; i < result.length; i++) {
				 // 绱㈠紩 0 and n-1
				 int r = (int) (Math.random() * n);
				 // 灏唕esult涓殑绗琲涓厓绱犺缃负codes[r]瀛樻斁鐨勬暟鍊�
				 result[i] = code[r];
				 // 蹇呴』纭繚涓嶄細鍐嶆鎶藉彇鍒伴偅涓瓧绗︼紝鍥犱负鎵�鏈夋娊鍙栫殑瀛楃蹇呴』涓嶇浉鍚屻��
				 // 鍥犳锛岃繖閲岀敤鏁扮粍涓殑鏈�鍚庝竴涓瓧绗︽敼鍐檆odes[r]锛屽苟灏唍鍑�
				 code[r] = code[n - 1];
				 n--;
			 }
		 }
		 return result;
	}
	
	
	public static String rangeIdent() {
		StringBuilder sb = new StringBuilder();
		sb.append("R68706875");
		char[] code = getSecurityCode(6,Level.Medium,false);
		sb.append(String.valueOf(code));
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(rangeIdent());
	}
}
