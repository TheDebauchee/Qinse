<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/genius.css" />
	<link rel="stylesheet" type="text/css" href="css/easyui.css" />
	<script type="text/javascript" charset="utf-8" src="js/jq_183.js"></script>

	<title>联系客服 - 客服中心 - 客服精灵</title>
</head>



<div class="cbox">
	<div id="header">
		
		<div class="head_title">
			<h1>琴瑟智能机器人</h1>
			<p>24小时竭诚为您服务</p>
		</div>
		

        <!--登出结束-->
        
		<a class="close" title="关闭" onclick="closePage()"></a>
	</div>
	<div class="content">
		<div id="left">
			<div id="chat">
				<!--头部公告-->
				
				<!--头部公告 结束-->

				<!--客服-->
				<div class="chat_server">
					<div class="face"></div>
					<span class="server_txt">尊敬的琴瑟用户，琴瑟智能小姐姐——霓裳，24小时为您服务！可以随意撩噢！<br/>
					
				</div>
				<!--客服 结束-->

				<!-- 公告 -->
				
			</div>
			<div id="sendbox">
				<!--联想框-->
				<div id="association">
				</div>
				<!--联想框 结束-->
				<textarea id="text">请输入您的问题</textarea>
			</div>
			<div id="bottom">
				<a class="great" onclick="isSatisfied()">满意度调查</a> <a id="btn_send"
					class="btn" onclick="sendMsg()">发送
					<p>Ctrl+Enter</p>
				</a> <a class="btn" onclick="closePage()">关闭</a>
			</div>
		</div>

	</div>
</div>
<div id="imgPreview" style="position: absolute; z-index:999;"><img/></div>


<script type="text/javascript" src="js/wm.js" top="false" bottom="false"></script>
<script type="text/javascript" src="js/jquery.boxy.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/gamenews.js"></script>
<script>


var isJudged = false;
var needClose = false;

var leftWidth = $(window).width()-380;
//初始化配置 
function init(){
	leftWidth = $(window).width()-380;
	if(leftWidth>=650){
		$('#left').width(leftWidth).height($(window).height()-90);
		$('#text').width(leftWidth-20);
		$('#top_gg').width(leftWidth*0.9).css({left:leftWidth*0.1/2});
		$('#sendbox,#bottom,#chat').width(leftWidth);
		$('#chat').height($(window).height()-90-260).scrollTop($('#chat').scrollHeight);
	}
}

init();

//窗口拉伸
$(window).resize(function(){
	init();
});


//输入框默认
$('#text').focus(function(){
	if($(this).val()=='请输入您的问题'){$(this).val('');}
})

$('#text').blur(function(){
	if($(this).val()==''){$(this).val('请输入您的问题');}
})


$('#chat, #btn_send').click(function(){$('#association').hide();})

//ctrl+enter组合键
$(document).keypress(function(e){ 
	if($('#text').val()!=null && $('#text').val()!='' && $('#text').val()!='请输入您的问题') {
		if(e.ctrlKey && e.which == 13 || e.which == 10) { 
		    sendMsg($('#text').val());
		    $('#text').val('');
			$('#association').hide();
		} else if (e.shiftKey && e.which==13 || e.which == 10) { 
			sendMsg($('#text').val());
			$('#text').val('');
			$('#association').hide();
		}
	}
})

//发送消息
function sendMsg(msg, type){

	if(!msg){msg=$('#text').val();}
	if(msg=='' || msg=='请输入您的问题') {return}
	
	//插入节点
	$("#chat").append('<div class="chat_user">'+
					  	  '<div class="face"></div>'+
						  '<span class="user_txt">'+msg+'</span>'+
					  '</div>');
	//控制滚动条
	$('#chat').animate({scrollTop:$('#chat')[0].scrollHeight}, 800);
	$('#text').val('请输入您的问题');
	
	if(!type) {
		var input = msg;
		$.ajax({
	       	url : "/service/service/NiShang",
	       	data : {
	       		word : input
	       	},
	       	type : "POST",
	       	success : function(data) {
	       		$('#association').html("");
	       		$('#association').hide();
	       		if(data!=null && data!='') {
/* 	       			data0 = eval(data);*/
	       			data1=data.text;
	       			data2=data.url; 
/* 	       			data1=$.parseJSON(data).text;
	       			data2=$.parseJSON(data).url; */
	       			var answer = "";
	       			answer += '<div class="chat_server">'+
						  	  '<div class="face"></div>'+
						  	  '<span class="server_txt">';
	       			
	       				answer += data1;
	       				if(data2){
	       					answer += '<br/>';
	       					answer += data2;
	       				}
	       			
					answer += '</span>';
					answer += '</div>';
					$("#chat").append(answer);
					
					//控制滚动条
					$('#chat').animate({scrollTop:$('#chat')[0].scrollHeight}, 800);
	       		}
	       	}
	    });
	}
}


function goIm() {
	saveContent("goIm");
}

//图片预览		
function imgPreview(obj, e){
	var evt = e||window.event;
	$('#imgPreview').html('');
	$('#imgPreview').append('<img/>');
	var img = $('#imgPreview').find('img');
	img.attr('src', obj.src);
	img.attr("width","600px")
	$('#imgPreview').css({
		top:evt.clientY,
		left:evt.clientX,
		width:"600px"
	}).show();
}
function hideImgPreview(){
	$('#imgPreview').hide();
	$('#imgPreview').html('');
}
</script>
</body>
</html>
