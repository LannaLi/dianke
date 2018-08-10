package com.dfdk.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	
	/**
	 * 鑾峰彇map涓殑key(map鐨勯暱搴︿负1)
	 * @param map
	 * @return
	 * @author Lanna
	 * @date 2018骞���
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
	 * map鐨勯暱搴﹀ぇ浜�惰幏鍙杕ap鐨刱ey
	 * @param map
	 * @return
	 * @author Lanna
	 * @date 2018骞���
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
