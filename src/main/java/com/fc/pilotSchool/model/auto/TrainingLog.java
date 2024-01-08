package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TrainingLog implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "学生id")
	private String sId;
	
	@ApiModelProperty(value = "训练地点")
	private String trainingPlace;
	
	@ApiModelProperty(value = "训练内容")
	private String trainingContent;
	
	@ApiModelProperty(value = "教练id")
	private Integer tId;
	
	@ApiModelProperty(value = "训练记录")
	private String trainingRecord;
	
	@ApiModelProperty(value = "训练id")
	private Integer trainId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "训练开始时间")
	private Date trainStarttime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "训练结束时间")
	private Date trainEndtime;
	
	@ApiModelProperty(value = "")
	private String trainingTask;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("sId")
	public String getSId() {
		return sId;
	}

	public void setSId(String sId) {
		this.sId =  sId;
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
	public Integer getTId() {
		return tId;
	}

	public void setTId(Integer tId) {
		this.tId =  tId;
	}
	@JsonProperty("trainingRecord")
	public String getTrainingRecord() {
		return trainingRecord;
	}

	public void setTrainingRecord(String trainingRecord) {
		this.trainingRecord =  trainingRecord;
	}
	@JsonProperty("trainId")
	public Integer getTrainId() {
		return trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId =  trainId;
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
	@JsonProperty("trainingTask")
	public String getTrainingTask() {
		return trainingTask;
	}

	public void setTrainingTask(String trainingTask) {
		this.trainingTask =  trainingTask;
	}


	public TrainingLog(String id,String sId,String trainingPlace,String trainingContent,Integer tId,String trainingRecord,Integer trainId,Date trainStarttime,Date trainEndtime,String trainingTask) {
		
		this.id = id;
		
		this.sId = sId;
		
		this.trainingPlace = trainingPlace;
		
		this.trainingContent = trainingContent;
		
		this.tId = tId;
		
		this.trainingRecord = trainingRecord;
		
		this.trainId = trainId;
		
		this.trainStarttime = trainStarttime;
		
		this.trainEndtime = trainEndtime;
		
		this.trainingTask = trainingTask;
		
	}

	public TrainingLog() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}