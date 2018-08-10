package com.dfdk.common.web;

public class JsonResult {
	
	/**存放返回的数捄1�7*/
	private Object data;
	
	private final int SUCCESS = 1;
	private final int ERROR = 0;
	/**状�1�7�1�7*/
	private int state;
	private String msg;
	
	public JsonResult() {
		this.state = ERROR;
	}
	
	public JsonResult(Object data) {
		this.state = SUCCESS;
		this.data = data;
	}
	
	public JsonResult(Throwable e) {
		this.state = ERROR;
		this.msg = e.getMessage();
	}
	
	public int getState() {
		return state;
	}
	
	public Object getData() {
		return data;
	}
	
	public String getMsg() {
		return msg;
	}
	
	
}
