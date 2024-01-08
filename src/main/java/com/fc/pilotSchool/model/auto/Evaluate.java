package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Evaluate implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "用户id")
	private String userId;
	
	@ApiModelProperty(value = "被评价对象id")
	private String targetId;
	
	@ApiModelProperty(value = "评价内容")
	private String evaluateContext;
	
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
	@JsonProperty("targetId")
	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId =  targetId;
	}
	@JsonProperty("evaluateContext")
	public String getEvaluateContext() {
		return evaluateContext;
	}

	public void setEvaluateContext(String evaluateContext) {
		this.evaluateContext =  evaluateContext;
	}


	public Evaluate(String id,String userId,String targetId,String evaluateContext) {
		
		this.id = id;
		
		this.userId = userId;
		
		this.targetId = targetId;
		
		this.evaluateContext = evaluateContext;
		
	}

	public Evaluate() {
	    super();
	}

	

}