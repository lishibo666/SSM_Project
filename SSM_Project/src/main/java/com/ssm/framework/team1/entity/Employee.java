package com.ssm.framework.team1.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Employee implements Serializable {
	private String employeeId;
	private String entryDateFrom;
	private String entryDateTo;
	private String entryDate;
	private String employeeName;
	private String genderId;
	private String age;
	private String deptId;
	private String mailAddress;
}
