<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="updateSpouse" class="itemForm" method="post">
	    <table>
	
	    <input type="hidden" name="userId" value="${spouse.userId}"/>
       <tr>
	           性别:<input type="hidden" name="userId" style="width: 280px"/>
	    <input type="text" name="sGender" style="width: 280px" value="${info.sGender}"></input>
        </tr>
        <tr>
        年龄:<select name="sMinAge" >
        <option selected="selected">18</option>
        <option>19</option>
        <option>21</option>
        <option>22</option>
        <option>23</option>
        <option>24</option>
        <option>25</option>
        <option>26</option>
        <option>27</option>
        <option>28</option>
        <option>29</option>
        <option>30</option>
        <option>31</option>
        <option>32</option>
        <option>33</option>
        <option>34</option>
        <option>35</option>
        <option>36</option>
        <option>37</option>
        <option>38</option>
        <option>39</option>
        <option>40</option>
        <option>41</option>
        <option>42</option>
        <option>43</option>
        <option>44</option>
        <option>45</option>
        <option>46</option>
        <option>47</option>
        <option>48</option>
        <option>49</option>
        <option>50</option>
        <option>51</option>
        <option>52</option>
        <option>53</option>
        <option>54</option>
        <option>55</option>
        <option>56</option>
        <option>57</option>
        <option>58</option>
        <option>59</option>
        <option>60</option>
        <option>61</option>
        <option>62</option>
        <option>63</option>
        <option>64</option>
        <option>65</option>
        <option>66</option>
        <option>67</option>
        <option>68</option>
        <option>69</option>
        <option>70</option>
        </select>
        至<select name="sMaxAge">
        <option>18</option>
        <option>19</option>
        <option>21</option>
        <option>22</option>
        <option>23</option>
        <option>24</option>
        <option selected="selected">25</option>
        <option>26</option>
        <option>27</option>
        <option>28</option>
        <option>29</option>
        <option>30</option>
        <option>31</option>
        <option>32</option>
        <option>33</option>
        <option>34</option>
        <option>35</option>
        <option>36</option>
        <option>37</option>
        <option>38</option>
        <option>39</option>
        <option>40</option>
        <option>41</option>
        <option>42</option>
        <option>43</option>
        <option>44</option>
        <option>45</option>
        <option>46</option>
        <option>47</option>
        <option>48</option>
        <option>49</option>
        <option>50</option>
        <option>51</option>
        <option>52</option>
        <option>53</option>
        <option>54</option>
        <option>55</option>
        <option>56</option>
        <option>57</option>
        <option>58</option>
        <option>59</option>
        <option>60</option>
        <option>61</option>
        <option>62</option>
        <option>63</option>
        <option>64</option>
        <option>65</option>
        <option>66</option>
        <option>67</option>
        <option>68</option>
        <option>69</option>
        <option>70</option>
        </select>
        </tr>
         <tr>
	           	工作地点:<input type="text" name="sWorkplace">
        </tr>
        <tr>
	            籍贯:<input type="text" name="sHomeLoc">
	            
        </tr>
        <tr>
	            婚姻状况:<select name="sMaritalStatus">
	            <option selected="selected">不限</option>
	            <option>未婚</option>
	            <option>离异</option>
	            <option>丧偶</option>
	            </select>
        </tr>
        <tr>
	            学历:<select name="sEducation">
	            <option selected="selected">不限</option>
	            <option>高中及以下</option>
	            <option>中专</option>
	            <option>大专</option>
	            <option>本科</option>
	            <option>硕士</option>
	            <option>博士及以上</option>
	            </select>
        </tr>
        <tr>
	            月收入:<select name="sMinSalary">
	            <option selected="selected">不限</option>
	            <option>3000</option>
	            <option>5000</option>
	            <option>8000</option>
	            <option>12000</option>
	            <option>20000</option>
	            <option>50000</option>
	            </select>
	           至<select name="sMaxSalary">
	            <option selected="selected">不限</option>
	            <option>3000</option>
	            <option>5000</option>
	            <option>8000</option>
	            <option>12000</option>
	            <option>20000</option>
	            <option>50000</option>
	            </select>
        </tr>
        <tr>
	            身高:<select name="sMinHeight">
	            <option selected="selected">不限</option>
	            <option>150及以下</option>
	            <option>151</option>
	            <option>152</option>
	            <option>153</option>
	            <option>154</option>
	            <option>155</option>
	            <option>156</option>
	            <option>157</option>
	            <option>158</option>
	            <option>159</option>
	            <option>160</option>
	            <option>161</option>
	            <option>162</option>
	            <option>163</option>
	            <option>164</option>
	            <option>165</option>
	            <option>166</option>
	            <option>167</option>
	            <option>168</option>
	            <option>169</option>
	            <option>170</option>
	            <option>171</option>
	            <option>172</option>
	            <option>173</option>
	            <option>174</option>
	            <option>175</option>
	            <option>176</option>
	            <option>177</option>
	            <option>178</option>
	            <option>179</option>
	            <option>180</option>
	            <option>181</option>
	            <option>182</option>
	            <option>183</option>
	            <option>184</option>
	            <option>185</option>
	            <option>186</option>
	            <option>187</option>
	            <option>188</option>
	            <option>189</option>
	            <option>190</option>
	            <option>191</option>
	            <option>192</option>
	            <option>193</option>
	            <option>194</option>
	            <option>195</option>
	            <option>196</option>
	            <option>197</option>
	            <option>198</option>
	            <option>199</option>
	            <option>200或以上</option>
	            </select>
	           至<select name="sMaxHeight">
	            <option selected="selected">不限</option>
	            <option>150及以下</option>
	            <option>151</option>
	            <option>152</option>
	            <option>153</option>
	            <option>154</option>
	            <option>155</option>
	            <option>156</option>
	            <option>157</option>
	            <option>158</option>
	            <option>159</option>
	            <option>160</option>
	            <option>161</option>
	            <option>162</option>
	            <option>163</option>
	            <option>164</option>
	            <option>165</option>
	            <option>166</option>
	            <option>167</option>
	            <option>168</option>
	            <option>169</option>
	            <option>170</option>
	            <option>171</option>
	            <option>172</option>
	            <option>173</option>
	            <option>174</option>
	            <option>175</option>
	            <option>176</option>
	            <option>177</option>
	            <option>178</option>
	            <option>179</option>
	            <option>180</option>
	            <option>181</option>
	            <option>182</option>
	            <option>183</option>
	            <option>184</option>
	            <option>185</option>
	            <option>186</option>
	            <option>187</option>
	            <option>188</option>
	            <option>189</option>
	            <option>190</option>
	            <option>191</option>
	            <option>192</option>
	            <option>193</option>
	            <option>194</option>
	            <option>195</option>
	            <option>196</option>
	            <option>197</option>
	            <option>198</option>
	            <option>199</option>
	            <option>200或以上</option>
	            </select>
        </tr>
        
         <tr>
	            有无孩子:<select name="sHaschild">
	            <option selected="selected">请选择</option>
	            <option>没有</option>
	            <option>有，我们住一起</option>
	            <option>有，我们偶尔住一起</option>
	            <option>有，但不在身边</option>
	            </select>
        </tr>
         <tr>
	            有无房子:<select name="sHashouse">
	            <option selected="selected">请选择</option>
	            <option>没有</option>
	            <option>有，无贷款</option>
	            <option>有，有贷款</option>
	            </select>
        </tr>
         <tr>
	            你在意Ta吸烟吗:<select name="sSmoke">
	            <option selected="selected">请选择</option>
	            <option>都可以</option>
	            <option>在意</option>
	            </select>
        </tr>
         <tr>
	            你在意Ta喝酒吗:<select name="sDrink">
	            <option selected="selected">请选择</option>
	            <option>都可以</option>
	            <option>在意</option>
	            </select>
        </tr>
        
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="/page/user-detail" onclick="submitForm()">保存并继续</a>
	    <a href="/page/user-detail">跳过</a>
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
