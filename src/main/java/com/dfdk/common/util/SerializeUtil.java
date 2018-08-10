package com.dfdk.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.sf.json.JSONObject;
/**
 * 搴忓垪鍖�
 * @Company:www.dfdk.com.cn 
 * @author Lanna 
 * @date 2018骞��鏃�  
 * @version 1.0
 */
public class SerializeUtil {
	
	private final static Logger logger = LogManager.getLogger(SerializeUtil.class);
	
	/**
	 * 搴忓垪鍖�
	 * @param value
	 * @return
	 */
	public static byte[] serialize(Object value) {
		if (value == null) {
			throw new NullPointerException("搴忓垪鍖栫殑瀵硅薄涓嶈兘涓虹┖鍊�!");
		}
		byte[] val = null;
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(value);
			oos.close();
			bos.close();
			val = bos.toByteArray();
		} catch (Exception e) {
			logger.error(e.toString(),"serialize error %s",JSONObject.fromObject(value));
		} finally {
			close(bos);
			close(oos);
		}
		return val;
	}
	
	/**
	 * 鏍规嵁鍊�,绫昏繘琛屽弽搴忓垪鍖�
	 * @param value
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T>T deserialize(byte[] value,Class<T>...clazz){
		Object obj = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			if (value != null) {
				bis = new ByteArrayInputStream(value);
				ois = new ObjectInputStream(bis);
				obj = ois.readObject();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),"Serialize Error %s",value);
		} finally {
			close(bis);
			close(ois);
		}
		return (T)obj;
	}
	
	@SuppressWarnings("unchecked")
	public static Object deserialize(byte[] val) {
		return deserialize(val,Object.class);
	}
	
	/**
	 * 鍏抽棴娴�
	 * @param closeable
	 */
	public static void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
	}
	
}
