package com.dfdk.yunwei.controller.sys;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dfdk.yunwei.controller.base.BaseController;

@Controller
@Scope(value="prototype")
@RequestMapping("/view")
public class SysRoleController extends BaseController{
	
	private static final String VIEW_NAME = "sys/role";
	
	@RequestMapping("/role")
	public ModelAndView viewRole() {
		return this.getModelAndView(VIEW_NAME);
	}
}
