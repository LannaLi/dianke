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
  <script src="${basePath}/assert/layui/layui.js"></script>
  <!--[if lt IE 9]>
  	<script src="${basePath}/assert/ie/html5.min.js"></script>
  	<script src="${basePath}/assert/ie/respond.min.js"></script>
  <![endif]-->
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">东方电科运维系统</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item">
					<a href="javacript:void(0);">
						<i class="layui-icon layui-icon-shrink-right icon-scroll"></i>
					</a>
				</li>
				<li class="layui-nav-item">
					<a href="javacript:void(0);">
						<i class="layui-icon layui-icon-notice"></i>
					</a>
				</li>
			</ul>
			<ul class="layui-nav layui-layout-right">
			  <li class="layui-nav-item">
				<a href="javacript:void(0);">
				  <i class="layui-icon layui-icon-user"></i><Strong>Lanna</Strong>
				</a>
				<dl class="layui-nav-child">
				  <dd><a href="javacript:void(0);">基本资料</a></dd>
				  <dd><a href="javacript:void(0);">系统设置</a></dd>
				  <dd><a href="javacript:void(0);">安全退出</a></dd>
				</dl>
			  </li>
			</ul>
		</div>
		<!--左侧导航区-->
		<div class="layui-side layui-bg-cyan side-menu">
			<div class="layui-side-scroll">
				<!-- 左侧导航菜单（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree"  lay-filter="menuList" id="navTree">
					<li class="layui-nav-item layui-nav-itemed">
						<a class="" href="javascript:;"><i class="layui-icon layui-icon-set-fill"></i>系统管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javacript:void(0);" data-url="/dianke/view/user"  data-id="11" class="menu-active">
									用户管理
								</a>
							</dd>
							<dd>
								<a href="javacript:void(0);" data-url="/dianke/view/menu"  data-id="22" class="menu-active">
									菜单管理
								</a>
							</dd>
							<dd>
								<a href="javacript:void(0);" data-url="/dianke/view/role"  data-id="33" class="menu-active">
									权限管理
								</a>
							</dd>
						</dl>
					</li>
				</ul>
			</div>
		</div>
		<!--主要内容区域-->
		<div class="layui-body">
		<!-- 内容主体区域 -->
			<div class="layui-tab" lay-filter="contentArea" lay-allowclose="true">
				<div class="layui-tab-title"></div>
				<div class="layui-tab-content"></div>
			</div>
		</div>
		<div class="layui-footer" style="text-align:center;"><Strong>Wellcome Lanna</Strong></div>
	</div>
	<script src="${basePath}/assert/js/index.js"></script>
</body>
</html>