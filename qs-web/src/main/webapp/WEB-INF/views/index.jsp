<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的琴瑟--个人中心</title>
<jsp:include page="/commons/common-js.jsp"></jsp:include>

</head>
<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    	<ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
         	<li>
         		<!-- <span>基本资料</span> -->
         		<a href="user/user-regist.html">注册信息</a>
         		
         		<!-- <ul>
	         		<li data-options="attributes:{'url':'/page/user-regist'}">注册信息</li>
	         		<li data-options="attributes:{'url':'/page/user-spouse'}">择偶条件</li>
	         		<li data-options="attributes:{'url':'/page/user-desc'}">内心独白</li>
	         	</ul> -->
         	</li>
         	<li>
         	<a href="user/user-spouse.html">择偶条件</a>
         	</li>
         	<li>
         	
         	<a href="user/user-detail.html">详细信息</a>
         		<!-- <span data-options="attributes:{'url':'/page/user-info'}">详细资料</span> -->
         	</li>
         	<li>
         		<!-- <span data-options="attributes:{'url':'/page/user-work-life'}">工作生活</span> -->
         		<a href="user/user-status.html">工作生活</a>
         	</li>
         	<li>
         		<!-- <span data-options="attributes:{'url':'/page/user-hobbies'}">兴趣爱好</span> -->
         		<a href="user/user-values.html">婚姻观</a>
         	</li>
         	<!-- <li>
         		<span data-options="attributes:{'url':'/page/user-marryValues'}">婚姻观</span>
         	</li>
         	<li>
         		<span data-options="attributes:{'url':'/page/user-images'}">我的相册</span>
         	</li> -->
         	
         	
         </ul>
    </div>
    

</body>
</html>