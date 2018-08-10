package com.dfdk.yunwei.controller.sys;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dfdk.yunwei.controller.base.BaseController;

@Controller
@Scope(value="prototype")
@RequestMapping("/view")
public class SysMenuController extends BaseController{
	
	private static final String VIEW_NAME = "sys/menu";
	
	@RequestMapping("/menu")
	public ModelAndView viewMenu() {
		return this.getModelAndView(VIEW_NAME);
	}
}
