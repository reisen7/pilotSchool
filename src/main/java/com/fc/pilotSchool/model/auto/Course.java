package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "id辨识")
	private String cId;
	
	@ApiModelProperty(value = "课程名称")
	private String courseName;
	
	@ApiModelProperty(value = "教师id")
	private String tId;
	
	@ApiModelProperty(value = "配套设施id")
	private String amenitiesId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "课程开始时间")
	private Date courseStarttime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "课程开始时间")
	private Date courseEndtime;
	
	@ApiModelProperty(value = "课程状态")
	private String status;
	
	@ApiModelProperty(value = "培训id")
	private String trainId;
	
	@JsonProperty("cId")
	public String getCId() {
		return cId;
	}

	public void setCId(String cId) {
		this.cId =  cId;
	}
	@JsonProperty("courseName")
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName =  courseName;
	}
	@JsonProperty("tId")
	public String getTId() {
		return tId;
	}

	public void setTId(String tId) {
		this.tId =  tId;
	}
	@JsonProperty("amenitiesId")
	public String getAmenitiesId() {
		return amenitiesId;
	}

	public void setAmenitiesId(String amenitiesId) {
		this.amenitiesId =  amenitiesId;
	}
	@JsonProperty("courseStarttime")
	public Date getCourseStarttime() {
		return courseStarttime;
	}

	public void setCourseStarttime(Date courseStarttime) {
		this.courseStarttime =  courseStarttime;
	}
	@JsonProperty("courseEndtime")
	public Date getCourseEndtime() {
		return courseEndtime;
	}

	public void setCourseEndtime(Date courseEndtime) {
		this.courseEndtime =  courseEndtime;
	}
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status =  status;
	}
	@JsonProperty("trainId")
	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId =  trainId;
	}


	public Course(String cId,String courseName,String tId,String amenitiesId,Date courseStarttime,Date courseEndtime,String status,String trainId) {
		
		this.cId = cId;
		
		this.courseName = courseName;
		
		this.tId = tId;
		
		this.amenitiesId = amenitiesId;
		
		this.courseStarttime = courseStarttime;
		
		this.courseEndtime = courseEndtime;
		
		this.status = status;
		
		this.trainId = trainId;
		
	}

	public Course() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}