layui.use(['layer','form','table'],function () {
	var $ = jQuery = layui.$;
	var layer = layui.layer;
	var table = layui.table;
	
	
	
	$(document).ready(function(){
		$('.layui-card-body').on('click','.layuiadmin-btn-role',operateObject);
	});
	
	
	//添加删除
	function operateObject () {
		if ($(this).hasClass('del-role')) {
			layer.msg('点击了删除按钮!');
		}
		if ($(this).hasClass('add-role')) {
			layer.open({
				title: '添加角色',
				type: 1,
				area: ['360px', '300px'],
				shadeClose: true, //点击遮罩关闭
				content: '<ul style="padding:20px;" id="permTree"></ul>',
				success : function (index, layero) {
					$('.layui-layer-title').css('background-color','#2F4056').css('color','#fff');
					$('.layui-layer-setwin').css('display','none');
					$('.layui-layer-btn-').css('border-top','1px solid #2F4056')
				},
				btn : ['submit','cancel'],
				yes : function (index, layero) {
					console.log(index);
					console.log(layero);
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