package com.dfdk.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	
	/**
	 * 获取map中的key(map的长度为1)
	 * @param map
	 * @return
	 * @author Lanna
	 * @date 2018幄1�7�1�7�1�7
	 */
	public static String getVal(Map<String,Object> map) {
		String result = "";
		for (Map.Entry<String,Object> entry:map.entrySet()) {
			String val = (String) entry.getValue();
			result = val.split("_")[0];
		}
		return result;
	}
	
	/**
	 * map的长度大亄1�7�获取map的key
	 * @param map
	 * @return
	 * @author Lanna
	 * @date 2018幄1�7�1�7�1�7
	 */
	public static Set<String> getKeys(Map<String,Object> map){
		return map.keySet();
	}
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("key","sys_user");
		System.out.println(getVal(map));
	}
	
}
