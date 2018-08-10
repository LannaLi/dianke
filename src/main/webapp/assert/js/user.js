layui.use(['layer','form'],function () {
	var $ = jQuery = layui.$;
	var layer = layui.layer;
	
	
	$(document).ready(function(){
		$('.layui-card-body').on('click','.layuiadmin-btn-role',operateObject);
	});
	
	//添加删除
	function operateObject () {
		if ($(this).hasClass('del-user')) {
			layer.msg('点击了删除按钮!');
		}
		if ($(this).hasClass('add-user')) {
			layer.open({
				title: '创建用户',
				type: 1,
				area: ['320px', '240px'],
				shadeClose: true, //点击遮罩关闭
				content: '<div class="layui-form-item">'+
							'<div class="layui-inline">用户名:</div>'+
							'<div class="layui-inline">'+
								'<input type="text" class="layui-input" placeholder="请输入用户名" id="username">'+
							'</div>'+
							'<i class="layui-icon layui-icon-help help" style="cursor:pointer;"></i>'+
						 '</div>'+
						 '<div class="layui-form-item">'+
						 	'<div class="layui-inline">区域名:</div>'+
						 	'<div class="layui-inline">'+
						 		'<input type="text" class="layui-input" placeholder="请输入区域" id="belarea">'+
						 	'</div>'+
						 '</div>',
				success : function (index, layero) {
					$('.layui-layer-title').css('background-color','#2F4056').css('color','#fff');
					$('.layui-layer-setwin').css('display','none');
					$('.layui-layer-btn-').css('border-top','1px solid #2F4056');
					$('.layui-form-item').css('margin','15px');
					//填写提示
					$('.help').on('click',function(){
						layer.tips('1.不能是数字开头;</br>2.不能是汉字开头;</br>3.不能是特殊符号;',$(this));
					});
				},
				btn : ['submit','cancel'],
				yes : function (index, layero) {
					var uname = $('#username').val();
					if (uname == '' || uname.length == 0) {
						layer.tips('用户名不能空',$('#username'));
						return false;
					}
				
					var url = '/dianke/view/addUser';
					var param = {'username':uname,'belarea':$('#belarea').val()};
					$.post(url,param,function(result){
						if (result.state == 1) {
							$('#username').val("");
							$('#belarea').val("");
							layer.msg("成功创建"+result.data+"个用户",{
								time : 0,
								btn : ['确定'],
								yes : function (ind){
									layer.close(ind);
								}
							});
						} else {
							if (result.msg == null || result.msg == '') {
								result.msg = "服务器繁忙,请稍后再试!";
							} 
							layer.msg(result.msg,{
								time : 0,
								btn : ['确定'],
								yes : function (ind){
									layer.close(ind);
								}
							});
						}
					});
				},
				cancel : function (index, layero) {
					if (comfirm('确定要关闭')) {
						layer.close(index);
					}
					return true;
				}
			});
		}
	}
});