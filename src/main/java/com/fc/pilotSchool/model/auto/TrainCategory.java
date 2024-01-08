package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TrainCategory implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "id辨识")
	private String id;
	
	@ApiModelProperty(value = "培训名称名称")
	private String trainingName;
	
	@ApiModelProperty(value = "培训费用")
	private String pay;
	
	@ApiModelProperty(value = "培训内容")
	private String trainingContent;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "开始时间")
	private Date startDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "结束时间")
	private Date endDate;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("trainingName")
	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName =  trainingName;
	}
	@JsonProperty("pay")
	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay =  pay;
	}
	@JsonProperty("trainingContent")
	public String getTrainingContent() {
		return trainingContent;
	}

	public void setTrainingContent(String trainingContent) {
		this.trainingContent =  trainingContent;
	}
	@JsonProperty("startDate")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate =  startDate;
	}
	@JsonProperty("endDate")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate =  endDate;
	}


	public TrainCategory(String id,String trainingName,String pay,String trainingContent,Date startDate,Date endDate) {
		
		this.id = id;
		
		this.trainingName = trainingName;
		
		this.pay = pay;
		
		this.trainingContent = trainingContent;
		
		this.startDate = startDate;
		
		this.endDate = endDate;
		
	}

	public TrainCategory() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}