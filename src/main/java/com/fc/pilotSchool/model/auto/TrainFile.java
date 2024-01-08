package com.fc.pilotSchool.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TrainFile implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "id辨识")
	private String id;
	
	@ApiModelProperty(value = "资料详情")
	private String details;
	
	@ApiModelProperty(value = "上传人姓名")
	private String uploadName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "上传时间")
	private Date uploadDate;
	
	@ApiModelProperty(value = "文件名")
	private String fileName;
	
	@ApiModelProperty(value = "文件地址")
	private String filePath;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =  id;
	}
	@JsonProperty("details")
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details =  details;
	}
	@JsonProperty("uploadName")
	public String getUploadName() {
		return uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName =  uploadName;
	}
	@JsonProperty("uploadDate")
	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate =  uploadDate;
	}
	@JsonProperty("fileName")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName =  fileName;
	}
	@JsonProperty("filePath")
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath =  filePath;
	}


	public TrainFile(String id,String details,String uploadName,Date uploadDate,String fileName,String filePath) {
		
		this.id = id;
		
		this.details = details;
		
		this.uploadName = uploadName;
		
		this.uploadDate = uploadDate;
		
		this.fileName = fileName;
		
		this.filePath = filePath;
		
	}

	public TrainFile() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}