package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Studenfees implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "学生id")
	private String sId;
	
	@ApiModelProperty(value = "是否支付学费")
	private String isPay;
	
	@ApiModelProperty(value = "费用")
	private String cost;
	
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
	@JsonProperty("isPay")
	public String getIsPay() {
		return isPay;
	}

	public void setIsPay(String isPay) {
		this.isPay =  isPay;
	}
	@JsonProperty("cost")
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost =  cost;
	}


	public Studenfees(String id,String sId,String isPay,String cost) {
		
		this.id = id;
		
		this.sId = sId;
		
		this.isPay = isPay;
		
		this.cost = cost;
		
	}

	public Studenfees() {
	    super();
	}

	

}