<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>琴瑟网--注册中心  </title>
<jsp:include page="/commons/common-js.jsp"></jsp:include>

</head>
<body class="easyui-layout">
  	<form action="/user/doRegister.html" method="post">
  		手机号:<input type="text" name="phone" />
  		密码:<input type="password" name="password">
  		昵称:<input type="text" name="nickname"/>
  		您的性别:<select name="gender">
  		<option>以后告诉你</option>
  		<option>男</option>
  		<option>女</option>
  		</select>
  		您的年龄:
  		<select name="age">
  		<option>18</option>
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
  		岁
  		您的真实姓名:<input type="text" name="relname"/>
  		 您的婚姻状况:<select name="maritalStatus">
		    <option>请选择</option>
		   <option>未婚</option>
		   <option>离异</option>
		   <option>丧偶</option>  
	            </select>
  		您的工作地点:<input type="text" name="workplace"/>
  		您的身高:
  				<select name="height">
	            <option>以后告诉你</option>
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
	            
  		您的学历:<select name="education">
  		 <option>请选择</option>
		 <option>初中</option>
		 <option>中专/职高/技校</option>
		 <option>高中</option>
		 <option>大专</option>
		 <option>本科</option>
		 <option>硕士</option>
		 <option>博士</option>
		 <option>博士后</option>
	            </select>
  		您的工资:
  			<select name="salary">
	              <option>2000以下</option>
                  <option>2000-3000</option>
                  <option>3000-4000</option>
                  <option>4000-5000</option>
                  <option>5000-7000</option>
                  <option>7000-10000</option>
                  <option>10000-15000</option>
                  <option>15000-20000</option>
                  <option>20000-25000</option>
                  <option>25000-30000</option>
                  <option>30000-50000</option>
                  <option>&gt;50000</option>
	            </select>
  			
  		您有无房子:<select name="hashouse">
	            <option>请选择</option>                                
<option>以后再告诉你</option>
<option>与父母同住</option>
<option>租房</option>
<option>已购房(有贷款)</option>
<option>已购房(无贷款)</option>
<option>住单位房</option>
<option>住亲朋家</option>
<option>需要时购置</option>

	            </select>
  		
  		您有无孩子:<select name="haskid">
	            <option>请选择</option>
<option>没有</option>
<option>有，和我住一起</option>
<option>有，有时和我住一起</option>
<option>有，不和我住一起</option>

	            </select>
  		
  		<h1>您的择偶条件:</h1>
  		Ta的性别:<select name="sGender">
  		<option>以后告诉你</option>
  		<option>男</option>
  		<option>女</option>
  		</select>
  		  您希望Ta的年龄:<select name="sMinAge" >
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
        在<select name="sMaxAge">
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
        之间
  		您希望Ta的工作地点:<input type="text" name="sWorkplace">
  		    您希望Ta的 籍贯:<input type="text" name="sHomeLoc">
  		
  		   您希望Ta的婚姻状况:<select name="sMaritalStatus">
	            <option>不限</option>
	            <option>未婚</option>
	            <option>离异</option>
	            <option>丧偶</option>
	            </select>
  		您希望Ta的学历:<select name="sEducation">
	             <option>请选择</option>
		 <option>初中</option>
		 <option>中专/职高/技校</option>
		 <option>高中</option>
		 <option>大专</option>
		 <option>本科</option>
		 <option>硕士</option>
		 <option>博士</option>
		 <option>博士后</option>
	            </select>
	    您希望Ta的月收入:<select name="sMinSalary">
	           <option>2000以下</option>
                  <option>2000-3000</option>
                  <option>3000-4000</option>
                  <option>4000-5000</option>
                  <option>5000-7000</option>
                  <option>7000-10000</option>
                  <option>10000-15000</option>
                  <option>15000-20000</option>
                  <option>20000-25000</option>
                  <option>25000-30000</option>
                  <option>30000-50000</option>
                  <option>&gt;50000</option>
	            </select>
	          <!--  至<select name="sMaxSalary">
	            <option selected="selected">不限</option>
	            <option>3000</option>
	            <option>5000</option>
	            <option>8000</option>
	            <option>12000</option>
	            <option>20000</option>
	            <option>50000</option>
	            </select> -->
	            
	        您希望Ta的身高:<select name="sMinHeight">
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
	            
	   您希望Ta有无孩子:<select name="sHaschild">
	            <option>不限</option>
	           <option>没有</option>
<option>有，和我住一起</option>
<option>有，有时和我住一起</option>
<option>有，不和我住一起</option>
	            </select>
	      
	   您希望Ta有无房子:<select name="sHashouse">
            <option>以后再告诉你</option>
<option>与父母同住</option>
<option>租房</option>
<option>已购房(有贷款)</option>
<option>已购房(无贷款)</option>
<option>住单位房</option>
<option>住亲朋家</option>
<option>需要时购置</option>
            </select>      
	     您在意Ta吸烟吗:<select name="sSmoke">
	            <option selected="selected">不限</option>
	            <option>都可以</option>
	            <option>在意</option>
	            </select>
	   您在意Ta喝酒吗:<select name="sDrink">
	            <option selected="selected">不限</option>
	            <option>都可以</option>
	            <option>在意</option>
	            </select>
	            
	 <h1>详细信息</h1>
	     您的籍贯:<input type="text" name="homeLoc">
	 您的体重:<select name="weight">
	            <option>以后告诉你</option>
	            <option>40及以下</option>
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
	            <option>71</option>
	            <option>72</option>
	            <option>73</option>
	            <option>74</option>
	            <option>75</option>
	            <option>76</option>
	            <option>77</option>
	            <option>78</option>
	            <option>79</option>
	            <option>80</option>
	            <option>81</option>
	            <option>82</option>
	            <option>83</option>
	            <option>84</option>
	            <option>85</option>
	            <option>86</option>
	            <option>87</option>
	            <option>88</option>
	            <option>89</option>
	            <option>90</option>
	            <option>91</option>
	            <option>92</option>
	            <option>93</option>
	            <option>94</option>
	            <option>95</option>
	            <option>96</option>
	            <option>97</option>
	            <option>98</option>
	            <option>99</option>
	            <option>100</option>
	            <option>101</option>
	            <option>102</option>
	            <option>103</option>
	            <option>104</option>
	            <option>105</option>
	            <option>106</option>
	            <option>107</option>
	            <option>108</option>
	            <option>109</option>
	            <option>110</option>
	            <option>111</option>
	            <option>112</option>
	            <option>113</option>
	            <option>114</option>
	            <option>115</option>
	            <option>116</option>
	            <option>117</option>
	            <option>118</option>
	            <option>119</option>
	            <option>120</option>
	            <option>121</option>
	            <option>122</option>
	            <option>123</option>
	            <option>124</option>
	            <option>125</option>
	            <option>126</option>
	            <option>127</option>
	            <option>128</option>
	            <option>129</option>
	            <option>130</option>
	            <option>130以上</option>
	            </select>
	 			公斤
	 			<br/>
	  您的体型:<select name="shape">
	              <option>请选择</option>
	              <option>很瘦</option>
 <option>较瘦</option>
<option>苗条</option>
 <option>匀称</option>
 <option>高挑</option>
 <option>丰满</option>
 <option>健壮</option>
 <option>较胖</option>
 <option>胖</option>

	            </select>
  		
  		  您的生肖:<select name="zodiac">
	            <option>以后告诉你</option>
	            <option>鼠</option>
	            <option>牛</option>
	            <option>虎</option>
	            <option>兔</option>
	            <option>龙</option>
	            <option>蛇</option>
	            <option>马</option>
	            <option>羊</option>
	            <option>猴</option>
	            <option>鸡</option>
	            <option>狗</option>
	            <option>猪</option>
	            </select>
  		 您的星座:<select name="sign">
	            <option>以后告诉你</option>
	            <!-- <option>白羊座(3.21-4.19)</option>
	            <option>金牛座(4.20-5.20)</option>
	            <option>双子座(5.21-6.21)</option>
	            <option>巨蟹座(6.22-7.22)</option>
	            <option>狮子座(7.23-8.22)</option>
	            <option>处女座(8.23-9.22)</option>
	            <option>天秤座(9.23-10.23)</option>
	            <option>天蝎座(10.24-11.22)</option>
	            <option>射手座(11.23-12.21)</option>
	            <option>摩羯座(12.22-1.19)</option>
	            <option>水瓶座(1.20-2.18)</option>
	            <option>双鱼座(2.19-3.20)</option> -->
	            <option>白羊座</option>
	            <option>金牛座</option>
	            <option>双子座</option>
	            <option>巨蟹座</option>
	            <option>狮子座</option>
	            <option>处女座</option>
	            <option>天秤座</option>
	            <option>天蝎座</option>
	            <option>射手座</option>
	            <option>摩羯座</option>
	            <option>水瓶座</option>
	            <option>双鱼座</option>
	            </select>
  		您的民族:<select name="race">
	            <option>以后告诉你</option>
	            <option>汉族</option>
	            <option>回族</option>
	            <option>满族</option>
	            <option>苗族</option>
	            <option>白族</option>
	            <option>蒙古族</option>
	            <option>阿昌族</option>
	            <option>保安族</option>
	            <option>布朗族</option>
	            <option>布依族</option>
	            <option>朝鲜族</option>
	            <option>达斡尔族</option>
	            <option>傣族</option>
	            <option>德昂族</option>
	            <option>侗族</option>
	            <option>东乡族</option>
	            <option>独龙族</option>
	            <option>鄂伦春族 </option>
	            <option>俄罗斯族</option>
	            <option>鄂温克族</option>
	            <option>高山族</option>
	            <option>仡佬族</option>
	            <option>哈尼族</option>
	            <option>哈萨克族</option>
	            <option>赫哲族</option>
	            <option>基诺族</option>
	            <option>基诺族</option>
	            <option>景颇族</option>
	            <option>柯尔克孜族</option>
	            <option>拉祜族</option>
	            <option>黎族</option>
	            <option>傈僳族</option>
	            <option>珞巴族</option>
	            <option>毛南族</option>
	            <option>门巴族</option>
	            <option>傈僳族</option>
	            <option>仫佬族</option>
	            <option>纳西族</option>
	            <option>怒族</option>
	            <option>普米族</option>
	            <option>羌族</option>
	            <option>撒拉族</option>
	            <option>畲族</option>
	            <option>水族</option>
	            <option>撒拉族</option>
	            <option>塔吉克族</option>
	            <option>塔塔尔族</option>
	            <option>土族</option>
	            <option>土家族</option>
	            <option>佤族</option>
	            <option>维吾尔族</option>
	            <option>乌兹别克族</option>
	            <option>瑶族</option>
	            <option>锡伯族</option>
	            <option>彝族</option>
	            <option>裕固族</option>
	            <option>藏族</option>
	            <option>壮族</option>
	            </select>
  		您的宗教信仰:<select name="religion">
	            <option selected="selected">请选择</option>
	           <option >请选择</option>
 <option>无神论</option>
 <option>佛教</option>
 <option>道教</option>
 <option>基督教</option>
 <option>天主教</option>
<option>其它</option>
 <option>信神但未定教</option>
 <option>儒教</option>
 <option>犹太教</option>
<option >回教</option>
 <option >伊斯兰教</option>
 <option >印度教</option>
	            </select>
  		您的毕业院校:<input type="text" name="gradFrom"></input>
  		自我描述:<input type="text" name="selfDesc"></input>
  		
	 <h1>工作生活</h1>
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
  		您是否吸烟:<select name="smoke">
	             <option>请选择</option>
 <option>不吸，很反感</option>
 <option>不吸烟，但不反感</option>
 <option>社交时偶尔吸烟</option>
 <option>烟不离手</option>

	            </select>
  		 您是否喝酒:<select name="drink">
	              <option >请选择</option>
  <option>不喝酒</option>
  <option>社交需要喝</option>
  <option>兴致时小酌</option>
  <option>酒不离口</option>
	            </select>
  		   您是否已购车:<select name="hascar">
	            <option >请选择</option>
<option>未购车</option>
<option>已购车</option>
<option>单位用车</option>
<option>需要时购置</option>

	            </select>
 您对家务的看法:<select name="housework">
	            <option >请选择</option>
<option>任劳任怨</option>
<option>希望对方承担家务</option>
<option>一起分工合作</option>
<option>看各自闲忙，协商分担</option>
	            </select>  		
  		您的厨艺水平:<select name="cooking">
	            <option >请选择</option>
<option>色香味俱全</option>
<option>能做几样可口的小菜</option>
<option>不太会，但愿为心爱的人学习</option>

	            </select>
  		
  		<h1>婚姻观</h1>
  		
	     您想何时结婚:<select name="whenToMarry">
	            <option selected="selected">请选择</option>
	            <option>及时闪婚</option>
	            <option>一年内</option>
	            <option>两年内</option>
	            <option>三年内</option>
	            <option>时机成熟就结婚</option>
	            </select>
	      您是否想要孩子:<select name="wantKid">
	            <option selected="selected">请选择</option>
	            <option>想</option>
	            <option>不想</option>
	            <option>还没想好</option>
	            <option>视情况而定</option>
	            </select>       
  		
  	 您是否愿意婚后与父母同住:<select name=wantParent>
	            <option selected="selected">请选择</option>
	            <option>愿意</option>
	            <option>不愿意</option>
	            <option>视具体情况而定</option>
	            </select>
  您是否接受异地恋:<select name=wantSeperation>
	            <option selected="selected">以后告诉你</option>
	            <option>接受</option>
	            <option>不接受</option>
	            <option>视具体情况而定</option>
	            </select>  		
  您喜欢什么样的约会:<input type="checkbox" name="desiredDate">		
  		
  		<input type="submit" value="立即注册" >
  	</form>

</body>
</html>
