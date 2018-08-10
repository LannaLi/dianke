<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<div class="layui-fluid">   
	<div class="layui-card">
		<div class="layui-card-body">
			<div style="padding-bottom: 10px;">
				<button class="layui-btn layuiadmin-btn-role del-role">删除</button>
				<button class="layui-btn layuiadmin-btn-role add-role">添加</button>
			</div>      
			<table class="layui-hide" id="sysRole" lay-filter="roleTable"></table>
			<script type="text/html" id="test-table-operate-barDemo">
				<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
				<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
				<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
			</script>
		</div>
	</div>
</div>
<script src="${basePath}/assert/js/role.js"></script>