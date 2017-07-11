<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<<<<<<< HEAD
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的琴瑟--个人中心</title>
<jsp:include page="/commons/common-js.jsp"></jsp:include>
<style type="text/css">
	.content {
		padding: 10px 10px 10px 10px;
	}
</style>
</head>
<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    	<ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
         	<li>
         		<span>基本资料</span>
         		<ul>
	         		<li data-options="attributes:{'url':'/page/user-regist'}">注册信息</li>
	         		<li data-options="attributes:{'url':'/page/user-spouse'}">择偶条件</li>
	         		<li data-options="attributes:{'url':'/page/user-desc'}">内心独白</li>
	         	</ul>
         	</li>
         	<li>
         		<span data-options="attributes:{'url':'/page/user-info'}">详细资料</span>
         	</li>
         	<li>
         		<span data-options="attributes:{'url':'/page/user-work-life'}">工作生活</span>
         	</li>
         	<li>
         		<span data-options="attributes:{'url':'/page/user-hobbies'}">兴趣爱好</span>
         	</li>
         	<li>
         		<span data-options="attributes:{'url':'/page/user-marryValues'}">婚姻观</span>
         	</li>
         	<li>
         		<span data-options="attributes:{'url':'/page/user-images'}">我的相册</span>
         	</li>
         	
         	
         </ul>
    </div>
    
<script type="text/javascript">
$(function(){
	$('#menu').tree({
		onClick: function(node){
			if($('#menu').tree("isLeaf",node.target)){
				var tabs = $("#tabs");
				var tab = tabs.tabs("getTab",node.text);
				if(tab){
					tabs.tabs("select",node.text);
				}else{
					tabs.tabs('add',{
					    title:node.text,
					    href: node.attributes.url,
					    closable:true,
					    bodyCls:"content"
					});
				}
			}
		}
	});
});
</script>
</body>
</html>
=======
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<body>
<h2>Hello World!</h2>
${sss}
</body>
</html>
>>>>>>> ab2aa842685dcfe090376ff8bff19a6bd8e6da98
