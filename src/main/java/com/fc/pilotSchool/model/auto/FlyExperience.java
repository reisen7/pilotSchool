package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class FlyExperience implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "活动时间")
	private Date planTime;
	
	@ApiModelProperty(value = "活动地点")
	private String planPlace;
	
	@ApiModelProperty(value = "活动内容")
	private String planContent;
	
	@ApiModelProperty(value = "活动计划")
	private String plan;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("planTime")
	public Date getPlanTime() {
		return planTime;
	}

	public void setPlanTime(Date planTime) {
		this.planTime =  planTime;
	}
	@JsonProperty("planPlace")
	public String getPlanPlace() {
		return planPlace;
	}

	public void setPlanPlace(String planPlace) {
		this.planPlace =  planPlace;
	}
	@JsonProperty("planContent")
	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent =  planContent;
	}
	@JsonProperty("plan")
	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan =  plan;
	}


	public FlyExperience(String id,Date planTime,String planPlace,String planContent,String plan) {
		
		this.id = id;
		
		this.planTime = planTime;
		
		this.planPlace = planPlace;
		
		this.planContent = planContent;
		
		this.plan = plan;
		
	}

	public FlyExperience() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}