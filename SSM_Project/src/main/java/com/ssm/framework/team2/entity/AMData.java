package com.ssm.framework.team2.entity;

import java.io.Serializable;

import lombok.Data;

//Author Chin

@SuppressWarnings("serial")
@Data
public class AMData implements Serializable {

	private String month;
	private String workingDays;
	private String attendanceDays;
	private String absenceHours;
	private String workingHours;
	private String overtimeHours;
}
