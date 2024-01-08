package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class License implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "学生id")
	private String userId;
	
	@ApiModelProperty(value = "执照")
	private String licenseContext;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId =  userId;
	}
	@JsonProperty("licenseContext")
	public String getLicenseContext() {
		return licenseContext;
	}

	public void setLicenseContext(String licenseContext) {
		this.licenseContext =  licenseContext;
	}


	public License(String id,String userId,String licenseContext) {
		
		this.id = id;
		
		this.userId = userId;
		
		this.licenseContext = licenseContext;
		
	}

	public License() {
	    super();
	}

	

}