package com.fc.pilotSchool.model.auto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Machine implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "标识id")
	private String id;
	
	@ApiModelProperty(value = "设备名称")
	private String machineName;
	
	@ApiModelProperty(value = "设备位置")
	private String machineAddress;
	
	@ApiModelProperty(value = "设备维护人")
	private String machineMaster;
	
	@ApiModelProperty(value = "管理员电话")
	private String masterPhone;
	
	@ApiModelProperty(value = "设备使用情况")
	private String machineStatus;
	
	@ApiModelProperty(value = "费用")
	private String cost;
	
	@ApiModelProperty(value = "状态")
	private String status;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}


	public Machine() {
	    super();
	}

	

}