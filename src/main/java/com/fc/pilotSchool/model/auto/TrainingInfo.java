package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TrainingInfo implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "训练地点")
	private String trainingPlace;
	
	@ApiModelProperty(value = "训练内容")
	private String trainingContent;
	
	@ApiModelProperty(value = "教练id")
	private String tId;
	
	@ApiModelProperty(value = "设备id")
	private String machineId;
	
	@ApiModelProperty(value = "状态")
	private String status;
	
	@ApiModelProperty(value = "学员id")
	private String sId;
	
	@ApiModelProperty(value = "训练编号")
	private String trainNumber;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "训练开始时间")
	private Date trainStarttime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "训练结束时间")
	private Date trainEndtime;
	
	@ApiModelProperty(value = "培训id")
	private String trainId;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("trainingPlace")
	public String getTrainingPlace() {
		return trainingPlace;
	}

	public void setTrainingPlace(String trainingPlace) {
		this.trainingPlace =  trainingPlace;
	}
	@JsonProperty("trainingContent")
	public String getTrainingContent() {
		return trainingContent;
	}

	public void setTrainingContent(String trainingContent) {
		this.trainingContent =  trainingContent;
	}
	@JsonProperty("tId")
	public String getTId() {
		return tId;
	}

	public void setTId(String tId) {
		this.tId =  tId;
	}
	@JsonProperty("machineId")
	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId =  machineId;
	}
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status =  status;
	}
	@JsonProperty("sId")
	public String getSId() {
		return sId;
	}

	public void setSId(String sId) {
		this.sId =  sId;
	}
	@JsonProperty("trainNumber")
	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber =  trainNumber;
	}
	@JsonProperty("trainStarttime")
	public Date getTrainStarttime() {
		return trainStarttime;
	}

	public void setTrainStarttime(Date trainStarttime) {
		this.trainStarttime =  trainStarttime;
	}
	@JsonProperty("trainEndtime")
	public Date getTrainEndtime() {
		return trainEndtime;
	}

	public void setTrainEndtime(Date trainEndtime) {
		this.trainEndtime =  trainEndtime;
	}
	@JsonProperty("trainId")
	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId =  trainId;
	}


	public TrainingInfo(String id,String trainingPlace,String trainingContent,String tId,String machineId,String status,String sId,String trainNumber,Date trainStarttime,Date trainEndtime,String trainId) {
		
		this.id = id;
		
		this.trainingPlace = trainingPlace;
		
		this.trainingContent = trainingContent;
		
		this.tId = tId;
		
		this.machineId = machineId;
		
		this.status = status;
		
		this.sId = sId;
		
		this.trainNumber = trainNumber;
		
		this.trainStarttime = trainStarttime;
		
		this.trainEndtime = trainEndtime;
		
		this.trainId = trainId;
		
	}

	public TrainingInfo() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}