package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Examination implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "考试名称")
	private String eName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "考试时间")
	private Date eStarttime;
	
	@ApiModelProperty(value = "考试地点")
	private String ePlace;
	
	@ApiModelProperty(value = "考试内容")
	private String eContent;
	
	@ApiModelProperty(value = "考试科目id")
	private String subjectId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "考试结束时间")
	private Date eEndtime;
	
	@ApiModelProperty(value = "课程id")
	private String coueseId;
	
	@ApiModelProperty(value = "训练id")
	private String trainingId;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("eName")
	public String getEName() {
		return eName;
	}

	public void setEName(String eName) {
		this.eName =  eName;
	}
	@JsonProperty("eStarttime")
	public Date getEStarttime() {
		return eStarttime;
	}

	public void setEStarttime(Date eStarttime) {
		this.eStarttime =  eStarttime;
	}
	@JsonProperty("ePlace")
	public String getEPlace() {
		return ePlace;
	}

	public void setEPlace(String ePlace) {
		this.ePlace =  ePlace;
	}
	@JsonProperty("eContent")
	public String getEContent() {
		return eContent;
	}

	public void setEContent(String eContent) {
		this.eContent =  eContent;
	}
	@JsonProperty("subjectId")
	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId =  subjectId;
	}
	@JsonProperty("eEndtime")
	public Date getEEndtime() {
		return eEndtime;
	}

	public void setEEndtime(Date eEndtime) {
		this.eEndtime =  eEndtime;
	}
	@JsonProperty("coueseId")
	public String getCoueseId() {
		return coueseId;
	}

	public void setCoueseId(String coueseId) {
		this.coueseId =  coueseId;
	}
	@JsonProperty("trainingId")
	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId =  trainingId;
	}


	public Examination(String id,String eName,Date eStarttime,String ePlace,String eContent,String subjectId,Date eEndtime,String coueseId,String trainingId) {
		
		this.id = id;
		
		this.eName = eName;
		
		this.eStarttime = eStarttime;
		
		this.ePlace = ePlace;
		
		this.eContent = eContent;
		
		this.subjectId = subjectId;
		
		this.eEndtime = eEndtime;
		
		this.coueseId = coueseId;
		
		this.trainingId = trainingId;
		
	}

	public Examination() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}