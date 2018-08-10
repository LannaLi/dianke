package com.dfdk.yunwei.controller.login;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dfdk.yunwei.controller.base.BaseController;

@Controller
@Scope(value="prototype")
public class LoginController extends BaseController{
	
	private static final String VIEW_NAME = "login/login";
	
	@RequestMapping("view/sign")
	public ModelAndView signIn() {
		return this.getModelAndView(VIEW_NAME);
	}
	
}
