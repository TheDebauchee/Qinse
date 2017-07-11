package com.qs.web.pojo;

import com.qs.common.po.BasePojo;

public class BigUser extends BasePojo{
	private Long userId;
	private String password;
	private String phone;
	private UserInfo info;	//基本信息
	private Spouse spouse;	//择偶意向
	private UserDetail detail;	//用户详细信息
	private UserLike userLike;	//用户的爱好
	private UserPhoto userphoto;	//用户的图片
	private UserStatus userStatus;	//用户的状态
	private UserValues userValues;	//用户的价值观婚姻观
	
	private String sGender;
	private String sMinAge;
	private String sMaxAge;
	private String sMaritalStatus;
	private String sWorkplace;
	private String sHomeLoc;
	private String sEducation;
	private String sMinHeight;
	private String sMaxHeight;
	private String sMinSalary;
	private String sMaxSalary;
	private String sHaschild;
	private String sHashouse;
	private String sDrink; 
	private String sSmoke;
	
	private String relname;
	private String gender;
	private String age;
	private String maritalStatus;
	private String workplace;
	private String height;
	private String education;
	private String nickname;
	private String salary;
	private String hashouse;
	private String haskid;
	
	private String homeLoc;
	private String weight;
	private String shape;	//体型
	private String zodiac;	//生肖
	private String sign;	//星座
	private String race;	//民族 
	private String religion;  //宗教信仰
	private String gradFrom;	//毕业院校
	private String major;		//专业
	private String selfDesc;	//自我描述
	
	private String hobbies;
	
	private String pic1;
	private String pic2;
	private String pic3;
	
	private String occupation;	//用户的职业
	private String firm;	//用户的公司
	private String smoke;	//是否抽烟
	private String drink;	//是否喝酒
	private String hascar;	//是否有车
	private String cooking;	//是否会做饭
	private String housework;	//家务
	
	private String whenToMarry; 
	private String wantKid;
	private String wantParent; 
	private String wantSeperation;
	private String desiredDate;
	
	
	
	
	
	public Spouse getSpouse() {
		return spouse;
	}
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}
	public UserDetail getDetail() {
		return detail;
	}
	public void setDetail(UserDetail detail) {
		this.detail = detail;
	}
	public UserLike getUserLike() {
		return userLike;
	}
	public void setUserLike(UserLike userLike) {
		this.userLike = userLike;
	}
	public UserPhoto getUserphoto() {
		return userphoto;
	}
	public void setUserphoto(UserPhoto userphoto) {
		this.userphoto = userphoto;
	}
	public UserStatus getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
	public UserValues getUserValues() {
		return userValues;
	}
	public void setUserValues(UserValues userValues) {
		this.userValues = userValues;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public String getsMinAge() {
		return sMinAge;
	}
	public void setsMinAge(String sMinAge) {
		this.sMinAge = sMinAge;
	}
	public String getsMaxAge() {
		return sMaxAge;
	}
	public void setsMaxAge(String sMaxAge) {
		this.sMaxAge = sMaxAge;
	}
	public String getsMaritalStatus() {
		return sMaritalStatus;
	}
	public void setsMaritalStatus(String sMaritalStatus) {
		this.sMaritalStatus = sMaritalStatus;
	}
	public String getsWorkplace() {
		return sWorkplace;
	}
	public void setsWorkplace(String sWorkplace) {
		this.sWorkplace = sWorkplace;
	}
	public String getsHomeLoc() {
		return sHomeLoc;
	}
	public void setsHomeLoc(String sHomeLoc) {
		this.sHomeLoc = sHomeLoc;
	}
	public String getsEducation() {
		return sEducation;
	}
	public void setsEducation(String sEducation) {
		this.sEducation = sEducation;
	}
	public String getsMinHeight() {
		return sMinHeight;
	}
	public void setsMinHeight(String sMinHeight) {
		this.sMinHeight = sMinHeight;
	}
	public String getsMaxHeight() {
		return sMaxHeight;
	}
	public void setsMaxHeight(String sMaxHeight) {
		this.sMaxHeight = sMaxHeight;
	}
	public String getsMinSalary() {
		return sMinSalary;
	}
	public void setsMinSalary(String sMinSalary) {
		this.sMinSalary = sMinSalary;
	}
	public String getsMaxSalary() {
		return sMaxSalary;
	}
	public void setsMaxSalary(String sMaxSalary) {
		this.sMaxSalary = sMaxSalary;
	}
	public String getsHaschild() {
		return sHaschild;
	}
	public void setsHaschild(String sHaschild) {
		this.sHaschild = sHaschild;
	}
	public String getsHashouse() {
		return sHashouse;
	}
	public void setsHashouse(String sHashouse) {
		this.sHashouse = sHashouse;
	}
	public String getsDrink() {
		return sDrink;
	}
	public void setsDrink(String sDrink) {
		this.sDrink = sDrink;
	}
	public String getsSmoke() {
		return sSmoke;
	}
	public void setsSmoke(String sSmoke) {
		this.sSmoke = sSmoke;
	}
	public String getRelname() {
		return relname;
	}
	public void setRelname(String relname) {
		this.relname = relname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHashouse() {
		return hashouse;
	}
	public void setHashouse(String hashouse) {
		this.hashouse = hashouse;
	}
	public String getHaskid() {
		return haskid;
	}
	public void setHaskid(String haskid) {
		this.haskid = haskid;
	}
	public String getHomeLoc() {
		return homeLoc;
	}
	public void setHomeLoc(String homeLoc) {
		this.homeLoc = homeLoc;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getZodiac() {
		return zodiac;
	}
	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getGradFrom() {
		return gradFrom;
	}
	public void setGradFrom(String gradFrom) {
		this.gradFrom = gradFrom;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSelfDesc() {
		return selfDesc;
	}
	public void setSelfDesc(String selfDesc) {
		this.selfDesc = selfDesc;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getFirm() {
		return firm;
	}
	public void setFirm(String firm) {
		this.firm = firm;
	}
	public String getSmoke() {
		return smoke;
	}
	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getHascar() {
		return hascar;
	}
	public void setHascar(String hascar) {
		this.hascar = hascar;
	}
	public String getCooking() {
		return cooking;
	}
	public void setCooking(String cooking) {
		this.cooking = cooking;
	}
	public String getHousework() {
		return housework;
	}
	public void setHousework(String housework) {
		this.housework = housework;
	}
	public String getWhenToMarry() {
		return whenToMarry;
	}
	public void setWhenToMarry(String whenToMarry) {
		this.whenToMarry = whenToMarry;
	}
	public String getWantKid() {
		return wantKid;
	}
	public void setWantKid(String wantKid) {
		this.wantKid = wantKid;
	}
	public String getWantParent() {
		return wantParent;
	}
	public void setWantParent(String wantParent) {
		this.wantParent = wantParent;
	}
	public String getWantSeperation() {
		return wantSeperation;
	}
	public void setWantSeperation(String wantSeperation) {
		this.wantSeperation = wantSeperation;
	}
	public String getDesiredDate() {
		return desiredDate;
	}
	public void setDesiredDate(String desiredDate) {
		this.desiredDate = desiredDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public UserInfo getInfo() {
		return info;
	}
	public void setInfo(UserInfo info) {
		this.info = info;
	}
	
	
}
