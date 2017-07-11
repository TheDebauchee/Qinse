<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="updateRegist" class="itemForm" method="post">
	    <table cellpadding="5">
       <tr>
	           昵称:<input type="hidden" name="userId" style="width: 280px"/>
	    <input type="text" name="nickname" style="width: 280px" value="${info.nickname}"></input>
        </tr>
        <tr>
	            真实姓名:<input type="text" name="phone" style="width: 280px" value="${user.relname}"></input>
        </tr>
        <tr>
	            性别:<input type="text" name="phone" style="width: 280px" value="${user.gender}"></input>
        </tr>
        <tr>
	            年龄:<input type="text" name="phone" style="width: 280px" value="${user.age}"></input>
        </tr>
        <tr>
	            婚姻状态:<input type="text" name="phone" style="width: 280px" value="${user.maritalStatus}"></input>
        </tr>
        <tr>
	            工作地点:<input name="workplace" style="height:60px;width: 280px;">${userInfo.workplace}</input>
        </tr>
        <tr>
	            月收入:<input type="text" name="salary">${userInfo.salary}</input>
        </tr>
        <tr>
	            身高:<input type="text" name="height">${userInfo.height}</input>
        </tr>
        <tr>
	            学历:<input type="text" name="height">${userInfo.education}</input>
        </tr>
        <tr>
	            住房条件:<input type="text" name="hashouse">${userInfo.hashouse}</input>
        </tr>
        <tr>
	            住房条件:<input type="text" name=haskid>${userInfo.haskid}</input>
        </tr>
        
	    </table>
	    <input type="hidden" name="itemParams"/>
	</form>
	<div style="padding:5px">
	    <a href="/page/user-spouse" onclick="submitForm()">保存并继续</a>
	    <a href="/page/user-spouse">跳过</a>
	</div>
</div>
<script type="text/javascript">
	
	function submitForm(){
		
		var paramJson = [];
		$("#userUpdate .params li").each(function(i,e){
			var trs = $(e).find("tr");
			var group = trs.eq(0).text();
			var ps = [];
			for(var i = 1;i<trs.length;i++){
				var tr = trs.eq(i);
				ps.push({
					"k" : $.trim(tr.find("td").eq(0).find("span").text()),
					"v" : $.trim(tr.find("input").val())
				});
			}
			paramJson.push({
				"group" : group,
				"params": ps
			});
		});
		paramJson = JSON.stringify(paramJson);//将对象转化为json字符串
		
		$("#userUpdate [name=itemParams]").val(paramJson);
		
		$.post("/user/update",$("#userUpdate").serialize(), function(data){
			/* if(data.status == 200){
				$.messager.alert('提示','新增商品成功!');
			}else {
				$.messager.alert('提示','新增商品失败!');
			} */
		});
	}
</script>
