package com.dfdk.yunwei.controller.common;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.InternalResourceView;
/**
 * 增加一个视图解析器
 * @Company:www.dfdk.com.cn 
 * @author Lanna 
 * @date 2018年8月9日  
 * @version 1.0
 */
public class HtmlResourceView extends InternalResourceView{
	
	
	@Override
	public boolean checkResource(Locale locale) throws Exception {
		File file = new File (this.getServletContext().getRealPath("/") + getUrl());
		return file.exists();
	}
	
}
