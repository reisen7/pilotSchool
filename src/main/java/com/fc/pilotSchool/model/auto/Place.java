package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Place implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "场地名称")
	private String placeName;
	
	@ApiModelProperty(value = "场地地址")
	private String placeAddress;
	
	@ApiModelProperty(value = "场地管理员")
	private String placeMaster;
	
	@ApiModelProperty(value = "管理员电话")
	private String masterPhone;
	
	@ApiModelProperty(value = "场地使用情况")
	private String placeStatus;
	
	@ApiModelProperty(value = "费用")
	private String cost;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("placeName")
	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName =  placeName;
	}
	@JsonProperty("placeAddress")
	public String getPlaceAddress() {
		return placeAddress;
	}

	public void setPlaceAddress(String placeAddress) {
		this.placeAddress =  placeAddress;
	}
	@JsonProperty("placeMaster")
	public String getPlaceMaster() {
		return placeMaster;
	}

	public void setPlaceMaster(String placeMaster) {
		this.placeMaster =  placeMaster;
	}
	@JsonProperty("masterPhone")
	public String getMasterPhone() {
		return masterPhone;
	}

	public void setMasterPhone(String masterPhone) {
		this.masterPhone =  masterPhone;
	}
	@JsonProperty("placeStatus")
	public String getPlaceStatus() {
		return placeStatus;
	}

	public void setPlaceStatus(String placeStatus) {
		this.placeStatus =  placeStatus;
	}
	@JsonProperty("cost")
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost =  cost;
	}


	public Place(String id,String placeName,String placeAddress,String placeMaster,String masterPhone,String placeStatus,String cost) {
		
		this.id = id;
		
		this.placeName = placeName;
		
		this.placeAddress = placeAddress;
		
		this.placeMaster = placeMaster;
		
		this.masterPhone = masterPhone;
		
		this.placeStatus = placeStatus;
		
		this.cost = cost;
		
	}

	public Place() {
	    super();
	}

	

}