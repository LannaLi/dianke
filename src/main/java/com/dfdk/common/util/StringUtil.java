package com.dfdk.common.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("deprecation")
public class StringUtil {
	
	/**
	 * 灏嗗瓧绗︿覆鏁扮粍鍙樻垚瀛楃闆嗗悎
	 * @param strs
	 * @return
	 */
	public static List<String> string2List(String[] strs){
		List<String> list = new ArrayList<String>();
		if(strs.length == 1) {
			list.add(strs[0]);
			return list;
		} else if (strs.length > 1) {
			for (int i=0;i<strs.length;i++) {
				list.add(strs[i]);
			}
			return list;
		}
		return null;
	}
	
	/**
	 * 鎴彇鍊掓暟绗簩浣嶅悗闈㈢殑瀛楃
	 * @param str
	 * @return
	 * @author Lanna
	 * @date 2018骞���
	 */
	public static String getSubString(String str) {
		if (str == null || str.length() == 0 || "".equals(str)) {
			return null;
		}
		return str.substring(str.length()-2,str.length());
	}
	
	/**
	 * 缂╃暐瀛楃涓诧紙涓嶅尯鍒嗕腑鑻辨枃瀛楃锛�
	 * @param str 鐩爣瀛楃涓�
	 * @param length 鎴彇闀垮害
	 * @return
	 */
	public static String abbr(String str,int len) {
		if (str == null) {
			return "";
		}
		try {
			StringBuilder sb = new StringBuilder();
			int currentLength = 0;
			for (char c : replaceHtml(StringEscapeUtils.unescapeHtml4(str)).toCharArray()) {
				currentLength += String.valueOf(c).getBytes("GBK").length;
				if (currentLength <= len - 3) {
					sb.append(c);
				} else {
					sb.append("...");
					break;
				}
			}
			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 鏇挎崲鎺塇TML鏍囩鏂规硶
	 */
	public static String replaceHtml(String html) {
		if (StringUtils.isBlank(html)){
			return "";
		}
		String regEx = "<.+?>";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(html);
		String s = m.replaceAll("");
		return s;
	}
	
	public static String getPre() {
		return "涓婁竴椤�";
	}
	
	public static String getFirst() {
		return "棣栭〉";
	}
	
	public static String getNext() {
		return "涓嬩竴椤�";
	}
	
	public static String getLast() {
		return "灏鹃〉";
	}
}
