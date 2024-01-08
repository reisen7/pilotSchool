package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class AdmissionsPublicity implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "宣传日期")
	private Date publicityTime;
	
	@ApiModelProperty(value = "宣传内容")
	private String publicityContext;
	
	@ApiModelProperty(value = "招生规则")
	private String admissionsRule;
	
	@ApiModelProperty(value = "宣传渠道")
	private String publicityWay;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("publicityTime")
	public Date getPublicityTime() {
		return publicityTime;
	}

	public void setPublicityTime(Date publicityTime) {
		this.publicityTime =  publicityTime;
	}
	@JsonProperty("publicityContext")
	public String getPublicityContext() {
		return publicityContext;
	}

	public void setPublicityContext(String publicityContext) {
		this.publicityContext =  publicityContext;
	}
	@JsonProperty("admissionsRule")
	public String getAdmissionsRule() {
		return admissionsRule;
	}

	public void setAdmissionsRule(String admissionsRule) {
		this.admissionsRule =  admissionsRule;
	}
	@JsonProperty("publicityWay")
	public String getPublicityWay() {
		return publicityWay;
	}

	public void setPublicityWay(String publicityWay) {
		this.publicityWay =  publicityWay;
	}


	public AdmissionsPublicity(String id,Date publicityTime,String publicityContext,String admissionsRule,String publicityWay) {
		
		this.id = id;
		
		this.publicityTime = publicityTime;
		
		this.publicityContext = publicityContext;
		
		this.admissionsRule = admissionsRule;
		
		this.publicityWay = publicityWay;
		
	}

	public AdmissionsPublicity() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}