layui.use(['layer','form'],function(){
	var $ = jQuery = layui.$;
	var layer = layui.layer;
	var form = layui.form;
	//页面加载完成
	$(document).ready(function(){
		$('.layui-icon-help').on('click',function(){
			if ($(this).hasClass('uHelp')) {
				var $this = $(this);
				layer.tips('不用以数字或者特殊符号开头!',$this);
			}
			if ($(this).hasClass('pHelp')) {
				var $this = $(this);
				layer.tips('长度为6-16位！',$this);
			}
		});
		$('#username').on('blur',function(event){
			//用户的合法性
			var val = $('#username').val().trim().substring(0,1);			
			var regNun = /^[-+]?\d*$/;
			//汉字正则
			var regHan = /^[\u0391-\uFFE5]+$/;
			//特殊符号正则
			var regTeS = new RegExp("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]");
			switch (true) {
			case regNun.test(val):
			case regHan.test(val):
			case regTeS.test(val):
				layer.tips('请输入正确的用户名',$(this));
				$(this).focus();
				$(this).empty();
				event.stopPropagation();
				return false;
			default:
				break;
			}
			//用户名的唯一性
		});
		$('#password').keyup(function(){
			if ($('#password').val().length >= 6 && $('#password').val().length <= 16) {
				$('.u-Login').css('display','block');
			} else {
				$('.u-Login').css('display','none');
			}
		});
	});
	
	form.on('submit(loginSubmit)',function(data){
		console.log(data.field)
	});
});