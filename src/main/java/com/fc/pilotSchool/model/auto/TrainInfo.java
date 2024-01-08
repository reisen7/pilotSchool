package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TrainInfo implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "id辨识")
	private String trainingId;
	
	@ApiModelProperty(value = "培训场地号")
	private String placeId;
	
	@ApiModelProperty(value = "培训设备号")
	private String machineId;
	
	@ApiModelProperty(value = "培训地点")
	private String trainingPlace;
	
	@ApiModelProperty(value = "培训内容")
	private String trainingDetails;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "开始时间")
	private Date startDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "结束时间")
	private Date endDate;
	
	@ApiModelProperty(value = "培训类别")
	private String trainCategory;
	
	@ApiModelProperty(value = "培训状态")
	private String status;
	
	@JsonProperty("trainingId")
	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId =  trainingId;
	}
	@JsonProperty("placeId")
	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId =  placeId;
	}
	@JsonProperty("machineId")
	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId =  machineId;
	}
	@JsonProperty("trainingPlace")
	public String getTrainingPlace() {
		return trainingPlace;
	}

	public void setTrainingPlace(String trainingPlace) {
		this.trainingPlace =  trainingPlace;
	}
	@JsonProperty("trainingDetails")
	public String getTrainingDetails() {
		return trainingDetails;
	}

	public void setTrainingDetails(String trainingDetails) {
		this.trainingDetails =  trainingDetails;
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
	@JsonProperty("trainCategory")
	public String getTrainCategory() {
		return trainCategory;
	}

	public void setTrainCategory(String trainCategory) {
		this.trainCategory =  trainCategory;
	}
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status =  status;
	}


	public TrainInfo(String trainingId,String placeId,String machineId,String trainingPlace,String trainingDetails,Date startDate,Date endDate,String trainCategory,String status) {
		
		this.trainingId = trainingId;
		
		this.placeId = placeId;
		
		this.machineId = machineId;
		
		this.trainingPlace = trainingPlace;
		
		this.trainingDetails = trainingDetails;
		
		this.startDate = startDate;
		
		this.endDate = endDate;
		
		this.trainCategory = trainCategory;
		
		this.status = status;
		
	}

	public TrainInfo() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}