layui.use(['jquery','element','layer'], function(){
    var $ = jQuery = layui.$;
	var element = layui.element;
	var layer = layui.layer;
	 
	
	$(function () {
		setTabTitleCss();
		function setTabTitleCss () {
			$('.layui-tab-title').css('background-color','#fffafa');
			$('.layui-icon').css('font-size','18px');
			$('.layui-icon').css('margin-right','12px');
			$('.layui-tab').css('margin','0px');
		}
		$('#navTree').on('click','.menu-active',function () {
			var $_this = $(this);
			
			$('.layui-tab-content').load($_this.attr('data-url'));
		});
		
		//设置左侧导航栏的隐藏和出现
		$('.layui-header').on('click','.icon-scroll',function () {
			//如果为0的时候
			if ($('.side-menu').css('left') == '0px') {
				$('.side-menu').animate({left:'-200px'},100);
				$('.layui-body').animate({left:'0px'},100);
				$('.layui-footer').animate({left:'0px'},100);
				$(this).removeClass('layui-icon-shrink-right');
				$(this).addClass('layui-icon-spread-left');
			} else {
				$('.side-menu').animate({left:'0px'},100);
				$('.layui-body').animate({left:'200px'},100);
				$('.layui-footer').animate({left:'200px'},100);
				$(this).addClass('layui-icon-shrink-right');
				$(this).removeClass('layui-icon-spread-left');
			}
			
		});
	});
	
	function frameWin () {
		var h = $(window).height()-165;
		var w = $(window).width()-$('.layui-layout-right').width();
        $("iframe").css("height",h+"px");
		$("iframe").css("width",w+"px");
	}
	
	$(window).resize(function(){frameWin ();});
	
});