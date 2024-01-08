package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "id辨识")
	private String id;
	
	@ApiModelProperty(value = "系统用户名")
	private String username;
	
	@ApiModelProperty(value = "真实姓名")
	private String trueName;
	
	@ApiModelProperty(value = "身份证")
	private String idCard;
	
	@ApiModelProperty(value = "电话")
	private String phone;
	
	@ApiModelProperty(value = "密码")
	private String pwd;
	
	@ApiModelProperty(value = "0代表是管理员，1代表是教练，2代表是学生，3代表工作人员")
	private Character flag;
	
	@ApiModelProperty(value = "0代表女，1代表男")
	private Character sex;
	
	@ApiModelProperty(value = "家庭住址")
	private String address;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "登录时间")
	private Date loginDate;
	
	@ApiModelProperty(value = "教练证")
	private String tCard;
	
	@ApiModelProperty(value = "工资")
	private String wages;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username =  username;
	}
	@JsonProperty("trueName")
	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName =  trueName;
	}
	@JsonProperty("idCard")
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard =  idCard;
	}
	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone =  phone;
	}
	@JsonProperty("pwd")
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd =  pwd;
	}
	@JsonProperty("flag")
	public Character getFlag() {
		return flag;
	}

	public void setFlag(Character flag) {
		this.flag =  flag;
	}
	@JsonProperty("sex")
	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex =  sex;
	}
	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address =  address;
	}
	@JsonProperty("loginDate")
	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate =  loginDate;
	}
	@JsonProperty("tCard")
	public String getTCard() {
		return tCard;
	}

	public void setTCard(String tCard) {
		this.tCard =  tCard;
	}
	@JsonProperty("wages")
	public String getWages() {
		return wages;
	}

	public void setWages(String wages) {
		this.wages =  wages;
	}


	public Teacher(String id,String username,String trueName,String idCard,String phone,String pwd,Character flag,Character sex,String address,Date loginDate,String tCard,String wages) {
		
		this.id = id;
		
		this.username = username;
		
		this.trueName = trueName;
		
		this.idCard = idCard;
		
		this.phone = phone;
		
		this.pwd = pwd;
		
		this.flag = flag;
		
		this.sex = sex;
		
		this.address = address;
		
		this.loginDate = loginDate;
		
		this.tCard = tCard;
		
		this.wages = wages;
		
	}

	public Teacher() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}