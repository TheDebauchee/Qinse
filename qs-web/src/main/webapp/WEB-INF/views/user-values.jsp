<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="updateValues" class="itemForm" method="post">
	    <table>
        <tr>
	            婚姻状况:<select name="maritalStatus">
	            <option selected="selected">请选择</option>
	            <option>未婚</option>
	            <option>离异</option>
	            <option>丧偶</option>
	            </select>
		</tr>
        <tr>
	           想何时结婚:<select name="whenToMarry">
	            <option selected="selected">请选择</option>
	            <option>认同闪婚</option>
	            <option>一年内</option>
	            <option>两年内</option>
	            <option>三年内</option>
	            <option>时机成熟就结婚</option>
	            </select>
		</tr>
        <tr>
	           是否想要孩子:<select name="wantKid">
	            <option selected="selected">请选择</option>
	            <option>想要孩子</option>
	            <option>不想要孩子</option>
	            <option>视情况而定</option>
	            </select>
		</tr>
        <tr>
	           是否愿意婚后与父母同住:<select name=wantParent>
	            <option selected="selected">请选择</option>
	            <option>愿意</option>
	            <option>不愿意</option>
	            <option>视具体情况而定</option>
	            </select>
		</tr>
        <tr>
	           是否接受异地恋:<select name=wantSeperation>
	            <option selected="selected">请选择</option>
	            <option>接受</option>
	            <option>不接受</option>
	            <option>视具体情况而定</option>
	            </select>
		</tr>
		<tr>
		喜欢什么样的约会:<input type="checkbox" name="desiredDate">
		</tr>
        <tr>
        	毕业院校:<input type="text" name="gradFrom" style="width: 280px" value="${userDetail.gradFrom}"></input>
        </tr>
        <tr>
        	自我描述:<input type="text" name="selfDesc" style="width: 280px" value="${userDetail.selfDesc}"></input>
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
