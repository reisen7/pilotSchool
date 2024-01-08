package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Studenjob implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "工作内容")
	private String jobName;
	
	@ApiModelProperty(value = "雇主名字")
	private String employersName;
	
	@ApiModelProperty(value = "雇主电话")
	private String employersPhone;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("jobName")
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName =  jobName;
	}
	@JsonProperty("employersName")
	public String getEmployersName() {
		return employersName;
	}

	public void setEmployersName(String employersName) {
		this.employersName =  employersName;
	}
	@JsonProperty("employersPhone")
	public String getEmployersPhone() {
		return employersPhone;
	}

	public void setEmployersPhone(String employersPhone) {
		this.employersPhone =  employersPhone;
	}


	public Studenjob(String id,String jobName,String employersName,String employersPhone) {
		
		this.id = id;
		
		this.jobName = jobName;
		
		this.employersName = employersName;
		
		this.employersPhone = employersPhone;
		
	}

	public Studenjob() {
	    super();
	}

	

}