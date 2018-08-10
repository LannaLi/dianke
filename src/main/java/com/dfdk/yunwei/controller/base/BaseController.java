package com.dfdk.yunwei.controller.base;

import java.util.UUID;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	
	/**
	 * 根据视图名获取视图
	 * @param viewName
	 * @return
	 * @author Lanna
	 * @date 2018年8月9日
	 */
	public ModelAndView getModelAndView(String viewName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName(viewName);
		return mv;
	}
	
	/**
	 * 获取32位随机数
	 * @return
	 * @author Lanna
	 * @date 2018年8月9日
	 */
	public String get32UUID() {
		return UUID.randomUUID().toString().trim().replaceAll("-", "");
	}
}
