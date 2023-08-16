package com.ssm.framework.team2.adata;

public class AttendanceData {
	private String month;
	private int workingDays;
	private int attendanceDays;
	private int absentDays;
	private String actualWorkingHours;
	private String overtimeHours;

	public AttendanceData(String month, int workingDays, int attendanceDays, int absentDays, String actualWorkingHours,
			String overtimeHours) {
		this.month = month;
		this.workingDays = workingDays;
		this.attendanceDays = attendanceDays;
		this.absentDays = absentDays;
		this.actualWorkingHours = actualWorkingHours;
		this.overtimeHours = overtimeHours;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public int getAttendanceDays() {
		return attendanceDays;
	}

	public void setAttendanceDays(int attendanceDays) {
		this.attendanceDays = attendanceDays;
	}

	public int getAbsentDays() {
		return absentDays;
	}

	public void setAbsentDays(int absentDays) {
		this.absentDays = absentDays;
	}

	public String getActualWorkingHours() {
		return actualWorkingHours;
	}

	public void setActualWorkingHours(String actualWorkingHours) {
		this.actualWorkingHours = actualWorkingHours;
	}

	public String getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(String overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

}
