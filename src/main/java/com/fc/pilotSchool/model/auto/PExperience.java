package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class PExperience implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "人员电话")
	private String pPhone;
	
	@ApiModelProperty(value = "人员姓名")
	private String pName;
	
	@ApiModelProperty(value = "活动id")
	private String experienceId;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("pPhone")
	public String getPPhone() {
		return pPhone;
	}

	public void setPPhone(String pPhone) {
		this.pPhone =  pPhone;
	}
	@JsonProperty("pName")
	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName =  pName;
	}
	@JsonProperty("experienceId")
	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId =  experienceId;
	}


	public PExperience(String id,String pPhone,String pName,String experienceId) {
		
		this.id = id;
		
		this.pPhone = pPhone;
		
		this.pName = pName;
		
		this.experienceId = experienceId;
		
	}

	public PExperience() {
	    super();
	}

	

}