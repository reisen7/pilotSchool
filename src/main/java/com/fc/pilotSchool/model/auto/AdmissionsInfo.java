package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class AdmissionsInfo implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "信息时间")
	private Date admissionsTime;
	
	@ApiModelProperty(value = "招生信息对象")
	private String admissionsObj;
	
	@ApiModelProperty(value = "招生规则")
	private String admissionsRule;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("admissionsTime")
	public Date getAdmissionsTime() {
		return admissionsTime;
	}

	public void setAdmissionsTime(Date admissionsTime) {
		this.admissionsTime =  admissionsTime;
	}
	@JsonProperty("admissionsObj")
	public String getAdmissionsObj() {
		return admissionsObj;
	}

	public void setAdmissionsObj(String admissionsObj) {
		this.admissionsObj =  admissionsObj;
	}
	@JsonProperty("admissionsRule")
	public String getAdmissionsRule() {
		return admissionsRule;
	}

	public void setAdmissionsRule(String admissionsRule) {
		this.admissionsRule =  admissionsRule;
	}


	public AdmissionsInfo(String id,Date admissionsTime,String admissionsObj,String admissionsRule) {
		
		this.id = id;
		
		this.admissionsTime = admissionsTime;
		
		this.admissionsObj = admissionsObj;
		
		this.admissionsRule = admissionsRule;
		
	}

	public AdmissionsInfo() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}