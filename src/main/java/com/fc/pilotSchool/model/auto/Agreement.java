package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Agreement implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "")
	private String id;
	
	@ApiModelProperty(value = "")
	private String agreementName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "")
	private Date agreementDate;
	
	@ApiModelProperty(value = "")
	private String agreementPath;
	
	@ApiModelProperty(value = "")
	private String studentId;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("agreementName")
	public String getAgreementName() {
		return agreementName;
	}

	public void setAgreementName(String agreementName) {
		this.agreementName =  agreementName;
	}
	@JsonProperty("agreementDate")
	public Date getAgreementDate() {
		return agreementDate;
	}

	public void setAgreementDate(Date agreementDate) {
		this.agreementDate =  agreementDate;
	}
	@JsonProperty("agreementPath")
	public String getAgreementPath() {
		return agreementPath;
	}

	public void setAgreementPath(String agreementPath) {
		this.agreementPath =  agreementPath;
	}
	@JsonProperty("studentId")
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId =  studentId;
	}


	public Agreement(String id,String agreementName,Date agreementDate,String agreementPath,String studentId) {
		
		this.id = id;
		
		this.agreementName = agreementName;
		
		this.agreementDate = agreementDate;
		
		this.agreementPath = agreementPath;
		
		this.studentId = studentId;
		
	}

	public Agreement() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}