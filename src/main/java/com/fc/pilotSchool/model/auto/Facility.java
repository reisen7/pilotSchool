package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Facility implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "设施名称")
	private String facilityName;
	
	@ApiModelProperty(value = "设施位置")
	private String facilityAddress;
	
	@ApiModelProperty(value = "设施维护人")
	private String facilityMaster;
	
	@ApiModelProperty(value = "管理员电话")
	private String masterPhone;
	
	@ApiModelProperty(value = "设施使用情况")
	private String facilityStatus;
	
	@ApiModelProperty(value = "")
	private String cost;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("facilityName")
	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName =  facilityName;
	}
	@JsonProperty("facilityAddress")
	public String getFacilityAddress() {
		return facilityAddress;
	}

	public void setFacilityAddress(String facilityAddress) {
		this.facilityAddress =  facilityAddress;
	}
	@JsonProperty("facilityMaster")
	public String getFacilityMaster() {
		return facilityMaster;
	}

	public void setFacilityMaster(String facilityMaster) {
		this.facilityMaster =  facilityMaster;
	}
	@JsonProperty("masterPhone")
	public String getMasterPhone() {
		return masterPhone;
	}

	public void setMasterPhone(String masterPhone) {
		this.masterPhone =  masterPhone;
	}
	@JsonProperty("facilityStatus")
	public String getFacilityStatus() {
		return facilityStatus;
	}

	public void setFacilityStatus(String facilityStatus) {
		this.facilityStatus =  facilityStatus;
	}
	@JsonProperty("cost")
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost =  cost;
	}


	public Facility(String id,String facilityName,String facilityAddress,String facilityMaster,String masterPhone,String facilityStatus,String cost) {
		
		this.id = id;
		
		this.facilityName = facilityName;
		
		this.facilityAddress = facilityAddress;
		
		this.facilityMaster = facilityMaster;
		
		this.masterPhone = masterPhone;
		
		this.facilityStatus = facilityStatus;
		
		this.cost = cost;
		
	}

	public Facility() {
	    super();
	}

	

}