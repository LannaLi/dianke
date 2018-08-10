<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>东方电科运维系统</title>
	<link rel="stylesheet" href="${basePath}/assert/layui/css/layui.css">
	<link rel="stylesheet" href="${basePath}/assert/layui/css/admin.css">
	<link rel="stylesheet" href="${basePath}/assert/layui/css/login.css">
	<script src="${basePath}/assert/layui/layui.js"></script>
	<!--[if lt IE 9]>
  		<script src="${basePath}/assert/ie/html5.min.js"></script>
  		<script src="${basePath}/assert/ie/respond.min.js"></script>
  	<![endif]-->
</head>
<body>
	<div class="layadmin-user-login layadmin-user-display-show" id="userLogin" style="display: none;">
		<div class="layadmin-user-login-main">
			<div class="layadmin-user-login-box layadmin-user-login-header">
				<h2>东方电科运维系统</h2>
			</div>
			<div class="layadmin-user-login-box layadmin-user-login-body layui-form">
				<div class="layui-form-item">
					<label class="layadmin-user-login-icon layui-icon layui-icon-username" for="username"></label>
					<input type="text" name="username" id="username" lay-verify="usename" placeholder="请输入用户名" class="layui-input">
					<i class="layui-icon layui-icon-help uHelp" style="float:right;margin-top:-28px;margin-right:15px;"></i>
				</div>
				<div class="layui-form-item">
					<label class="layadmin-user-login-icon layui-icon layui-icon-password" for="password"></label>
					<input type="password" name="password" id="password" lay-verify="password" placeholder="请输入密码" class="layui-input">
					<i class="layui-icon layui-icon-help pHelp" style="float:right;margin-top:-28px;margin-right:15px;"></i>
				</div>
				<div class="layui-form-item u-Login" style="display:none;">
				  <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="loginSubmit">登录</button>
				</div>
			</div>
		</div>
	</div>
	<script src="${basePath}/assert/js/login.js"></script>
</body>
</html>