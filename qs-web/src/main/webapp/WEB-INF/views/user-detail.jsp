<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="updateDetail" class="itemForm" method="post">
	    <table>
	
	    
        <tr>
        <input type="hidden" name="userId" value="${userDetail.userId }">
	            您的籍贯:<input type="text" name="homeLoc">
        </tr>
        <tr>
	            您的体重:<select name="weight">
	            <option>请选择</option>
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
        </tr>
        <tr>
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
        </tr>
        <tr>
	            您的生肖:<select name="zodiac">
	            <option>请选择</option>
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
	            <option selected="selected">保密</option>
	            </select>
        </tr>
        <tr>
	           您的星座:<select name="sign">
	            <option>以后告诉你</option>
	           <!--  <option>白羊座(3.21-4.19)</option>
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
        </tr>
        <tr>
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
        </tr>
        <tr>
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
        </tr>
        <tr>
        	您的毕业院校:<input type="text" name="gradFrom" style="width: 280px" value="${userDetail.gradFrom}"></input>
        </tr>
        <tr>
        	自我描述:<input type="text" name="selfDesc" style="width: 280px" value="${userDetail.selfDesc}"></input>
        </tr>
	    </table>
	    <input type="hidden" name="itemParams"/>
	</form>
	<div style="padding:5px">
	    <a href="/page/user-status" onclick="submitForm()">保存并继续</a>
	    <a href="/page/user-status">跳过</a>
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
