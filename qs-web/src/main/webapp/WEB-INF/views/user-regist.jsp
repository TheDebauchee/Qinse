<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="updateRegist" class="itemForm" method="post">
	    <table cellpadding="5">
       <tr>
	           您的昵称:<input type="hidden" name="userId" style="width: 280px"/>
	    <input type="text" name="nickname" style="width: 280px" value="${info.nickname}"></input>
        </tr>
        <tr>
	            您的 真实姓名:<input type="text" name="relname" style="width: 280px" value="${info.relname}"></input>
        </tr>
        <tr>
       	 您的性别:<select name="gender">
       	 
  		<option <c:if test="${info.gender}=='以后告诉你'">selected="selected"</c:if>>以后告诉你</option>
  		<option <c:if test="${info.gender}=='男'">selected="selected"</c:if>>男</option>
  		<option <c:if test="${info.gender}=='女'">selected="selected"</c:if>>女</option>
  		</select>
        </tr>
        <tr>
	             您的年龄:<input type="text" name="age" style="width: 280px" value="${info.age}"></input>
	          您的年龄:
  		<select name="age" >
  		<option <c:if test="${info.age}=='18'">selected="selected"</c:if>>18</option>
        <option <c:if test="${info.age}=='19'">selected="selected"</c:if>>19</option>
        <option <c:if test="${info.age}=='20'">selected="selected"</c:if>>20</option>
        <option <c:if test="${info.age}=='21'">selected="selected"</c:if>>21</option>
        <option <c:if test="${info.age}=='22'">selected="selected"</c:if>>22</option>
        <option <c:if test="${info.age}=='23'">selected="selected"</c:if>>23</option>
        <option <c:if test="${info.age}=='24'">selected="selected"</c:if>>24</option>
        <option <c:if test="${info.age}=='25'">selected="selected"</c:if>>25</option>
        <option <c:if test="${info.age}=='26'">selected="selected"</c:if>>26</option>
        <option <c:if test="${info.age}=='27'">selected="selected"</c:if>>27</option>
        <option <c:if test="${info.age}=='28'">selected="selected"</c:if>>28</option>
        <option <c:if test="${info.age}=='29'">selected="selected"</c:if>>29</option>
        <option <c:if test="${info.age}=='30'">selected="selected"</c:if>>30</option>
        <option <c:if test="${info.age}=='31'">selected="selected"</c:if>>31</option>
        <option <c:if test="${info.age}=='32'">selected="selected"</c:if>>32</option>
        <option <c:if test="${info.age}=='33'">selected="selected"</c:if>>33</option>
        <option <c:if test="${info.age}=='34'">selected="selected"</c:if>>34</option>
        <option <c:if test="${info.age}=='35'">selected="selected"</c:if>>35</option>
        <option <c:if test="${info.age}=='36'">selected="selected"</c:if>>36</option>
        <option <c:if test="${info.age}=='37'">selected="selected"</c:if>>37</option>
        <option <c:if test="${info.age}=='38'">selected="selected"</c:if>>38</option>
        <option <c:if test="${info.age}=='39'">selected="selected"</c:if>>39</option>
        <option <c:if test="${info.age}=='40'">selected="selected"</c:if>>40</option>
        <option <c:if test="${info.age}=='41'">selected="selected"</c:if>>41</option>
        <option <c:if test="${info.age}=='42'">selected="selected"</c:if>>42</option>
        <option <c:if test="${info.age}=='43'">selected="selected"</c:if>>43</option>
        <option <c:if test="${info.age}=='44'">selected="selected"</c:if>>44</option>
        <option <c:if test="${info.age}=='45'">selected="selected"</c:if>>45</option>
        <option <c:if test="${info.age}=='46'">selected="selected"</c:if>>46</option>
        <option <c:if test="${info.age}=='47'">selected="selected"</c:if>>47</option>
        <option <c:if test="${info.age}=='48'">selected="selected"</c:if>>48</option>
        <option <c:if test="${info.age}=='49'">selected="selected"</c:if>>49</option>
        <option <c:if test="${info.age}=='50'">selected="selected"</c:if>>50</option>
        <option <c:if test="${info.age}=='51'">selected="selected"</c:if>>51</option>
        <option <c:if test="${info.age}=='52'">selected="selected"</c:if>>52</option>
        <option <c:if test="${info.age}=='53'">selected="selected"</c:if>>53</option>
        <option <c:if test="${info.age}=='54'">selected="selected"</c:if>>54</option>
        <option <c:if test="${info.age}=='55'">selected="selected"</c:if>>55</option>
        <option <c:if test="${info.age}=='56'">selected="selected"</c:if>>56</option>
        <option <c:if test="${info.age}=='57'">selected="selected"</c:if>>57</option>
        <option <c:if test="${info.age}=='58'">selected="selected"</c:if>>58</option>
        <option <c:if test="${info.age}=='59'">selected="selected"</c:if>>59</option>
        <option <c:if test="${info.age}=='60'">selected="selected"</c:if>>60</option>
        <option <c:if test="${info.age}=='61'">selected="selected"</c:if>>61</option>
        <option <c:if test="${info.age}=='62'">selected="selected"</c:if>>62</option>
        <option <c:if test="${info.age}=='63'">selected="selected"</c:if>>63</option>
        <option <c:if test="${info.age}=='64'">selected="selected"</c:if>>64</option>
        <option <c:if test="${info.age}=='65'">selected="selected"</c:if>>65</option>
        <option <c:if test="${info.age}=='66'">selected="selected"</c:if>>66</option>
        <option <c:if test="${info.age}=='67'">selected="selected"</c:if>>67</option>
        <option <c:if test="${info.age}=='68'">selected="selected"</c:if>>68</option>
        <option <c:if test="${info.age}=='69'">selected="selected"</c:if>>69</option>
        <option <c:if test="${info.age}=='70及以上'">selected="selected"</c:if>>70及以上</option>
  		</select>   
	             
        </tr>
        <tr>
	             您的婚姻状态:<input type="text" name="maritalStatus" style="width: 280px" value="${info.maritalStatus}"></input>
        </tr>                                        
                                     
        
        <tr>
	             您的工作地点:<input name="workplace" style="height:60px;width: 280px;">${info.workplace}</input>
        </tr>
        <tr>
	             您的月收入:
	             <select name="salary">
	                <option <c:if test="${info.age}=='2000以下'">selected="selected"</c:if>>2000以下</option>
                    <option <c:if test="${info.age}=='2000-3000'">selected="selected"</c:if>>2000-3000</option>
                    <option <c:if test="${info.age}=='3000-4000'">selected="selected"</c:if>>3000-4000</option>
                    <option <c:if test="${info.age}=='4000-5000'">selected="selected"</c:if>>4000-5000</option>
                    <option <c:if test="${info.age}=='5000-7000'">selected="selected"</c:if>>5000-7000</option>
                    <option <c:if test="${info.age}=='7000-10000'">selected="selected"</c:if>>7000-10000</option>
                    <option <c:if test="${info.age}=='10000-15000'">selected="selected"</c:if>>10000-15000</option>
                    <option <c:if test="${info.age}=='15000-20000'">selected="selected"</c:if>>15000-20000</option>
                    <option <c:if test="${info.age}=='20000-25000'">selected="selected"</c:if>>20000-25000</option>
                    <option <c:if test="${info.age}=='25000-30000'">selected="selected"</c:if>>25000-30000</option>
                    <option <c:if test="${info.age}=='30000-50000'">selected="selected"</c:if>>30000-50000</option>
                    <option <c:if test="${info.age}=='>50000'">selected="selected"</c:if>>&gt;50000</option>
	             </select>
        </tr>
        <tr>
	             您的身高:<input type="text" name="height">${info.height}</input>
        </tr>
        <tr>
	             您的学历:<input type="text" name="height">${info.education}</input>
        </tr>
        <tr>
	             您的住房条件:<input type="text" name="hashouse">${info.hashouse}</input>
        </tr>
        <tr>
	             您有无孩子:<input type="text" name=haskid>${info.haskid}</input>
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
