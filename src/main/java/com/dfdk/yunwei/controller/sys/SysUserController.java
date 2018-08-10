package com.dfdk.yunwei.controller.sys;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dfdk.common.ex.InsertRuntimeException;
import com.dfdk.common.util.Const;
import com.dfdk.common.util.MD5;
import com.dfdk.common.web.JsonResult;
import com.dfdk.yunwei.controller.base.BaseController;
import com.dfdk.yunwei.model.sys.SysUser;
import com.dfdk.yunwei.service.sys.SysUserManager;
@Controller
@Scope(value="prototype")
@RequestMapping("/view")
public class SysUserController extends BaseController{
	private static final String VIEW_NAME = "sys/user";
	@Autowired
	private SysUserManager sysUserService;
	
	@RequestMapping("/user")
	public ModelAndView viewUser() {
		return this.getModelAndView(VIEW_NAME);
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public JsonResult addUser(SysUser sysUser) {
		sysUser.setUserid(this.get32UUID());
		sysUser.setCreateby("admin");
		sysUser.setUpdateby("admin");
		sysUser.setOnduty(Const.ONDUTY);
		sysUser.setStatus(Const.STATUS_USE);
		sysUser.setPassword(MD5.getOriginPwdMD5String());
		try {
			int num =sysUserService.insert(sysUser);
			return new JsonResult(num);
		} catch (InsertRuntimeException e) {
			return new JsonResult(e);
		} catch (SQLException e) {
			e.printStackTrace();
			return new JsonResult();
		} catch (Exception e) {
			e.printStackTrace();
			return new JsonResult();
		} 
	}
}
