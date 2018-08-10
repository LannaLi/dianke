package com.dfdk.yunwei.controller.index;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dfdk.yunwei.controller.base.BaseController;

@Controller
@Scope(value="prototype")
@RequestMapping("/view")
public class IndexController extends BaseController{
	
	private static final String VIEW_NAME = "index/index";
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return this.getModelAndView(VIEW_NAME);
	}
	
}
