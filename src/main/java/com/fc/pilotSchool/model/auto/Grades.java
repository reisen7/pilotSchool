package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Grades implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "学生id")
	private String sId;
	
	@ApiModelProperty(value = "科目id")
	private String subjectId;
	
	@ApiModelProperty(value = "科目分数")
	private String g;
	
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
	@JsonProperty("subjectId")
	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId =  subjectId;
	}
	@JsonProperty("g")
	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g =  g;
	}


	public Grades(String id,String sId,String subjectId,String g) {
		
		this.id = id;
		
		this.sId = sId;
		
		this.subjectId = subjectId;
		
		this.g = g;
		
	}

	public Grades() {
	    super();
	}

	

}