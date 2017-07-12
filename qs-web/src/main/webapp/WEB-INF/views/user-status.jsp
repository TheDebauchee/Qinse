<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="updateStatus" class="itemForm" method="post">
	    <table>
	    <input type="hidden" name="userId" value="${userStatus.userId}"/>
        <tr>
	            您的职业:<select name="occupation">
	            <option>以后告诉你</option>
	            <option>销售</option>
	            <option>计算机/互联网</option>
	            <option>通信/电子</option>
	            <option>生产/制造</option>
	            <option>物流/仓储</option>
	            <option>商贸/采购</option>
	            <option>人事/行政</option>
	            <option>广告/市场</option>
	            <option>高级管理</option>
	            <option>传媒/艺术</option>
	            <option>生物/制药</option>
	            <option>医疗/护理</option>
	            <option>金融/银行/保险</option>
	            <option>建筑/房地产</option>
	            <option>咨询/顾问</option>
	            <option>法律</option>
	            <option>财会/审计</option>
	            <option>教育/科研</option>
	            <option>服务业</option>
	            <option>交通运输</option>
	            <option>政府机构</option>
	            <option>农林牧渔</option>
	            <option>自由职业</option>
	            <option>军人/经常</option>
	            <option>在校学生</option>
	            <option>待业</option>
	            <option>其他</option>
	            </select>
        </tr>
        
        <tr>
	           您的公司类别:<select name="firm">
	            <option>请选择</option>
<option>政府机关</option>
<option>事业单位</option>
<option>外企企业</option>
<option>世界500强</option>
<option>上市公司</option>
<option>国有企业</option>
<option>私营企业</option>
<option>自有公司</option>
	            </select>
        </tr>
        <tr>
	          您是否吸烟:<select name="smoke">
	             <option>请选择</option>
 <option>不吸，很反感</option>
 <option>不吸烟，但不反感</option>
 <option>社交时偶尔吸烟</option>
 <option>烟不离手</option>

	            </select>
  		
        </tr>
        <tr>
	             您是否喝酒:<select name="drink">
	              <option >请选择</option>
  <option>不喝酒</option>
  <option>社交需要喝</option>
  <option>兴致时小酌</option>
  <option>酒不离口</option>
	            </select>
        </tr>
        <tr>
	        您是否已购车:<select name="hascar">
	            <option >请选择</option>
<option>未购车</option>
<option>已购车</option>
<option>单位用车</option>
<option>需要时购置</option>
	            </select>
        </tr>
        <tr>
	        您对家务的看法:<select name="housework">
	            <option >请选择</option>
<option>任劳任怨</option>
<option>希望对方承担家务</option>
<option>一起分工合作</option>
<option>看各自闲忙，协商分担</option>
	            </select>  		
        </tr>
        <tr>
您的厨艺水平:<select name="cooking">
 <option >请选择</option>
<option>色香味俱全</option>
<option>能做几样可口的小菜</option>
<option>不太会，但愿为心爱的人学习</option>
	            </select>
        </tr>
     
	    </table>
	    <input type="hidden" name="itemParams"/>
	</form>
	<div style="padding:5px">
	    <a href="/page/user-values" onclick="submitForm()">保存并继续</a>
	    <a href="/page/user-values">跳过</a>
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
