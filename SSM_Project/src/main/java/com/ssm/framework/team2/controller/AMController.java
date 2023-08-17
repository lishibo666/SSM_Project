package com.ssm.framework.team2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.entity.AMData;

//Author Chin

@Controller
public class AMController {
	@GetMapping("/attendance_month")
	public String getAttendance(Model model) {

		List<AMData> attendanceList = getAttendanceDataFromDatabase();

		model.addAttribute("attendanceList", attendanceList);
		return "attendance_month";
	}

	private List<AMData> getAttendanceDataFromDatabase() {

		List<AMData> attendanceList = new ArrayList<>();
		attendanceList.add(new AMData());
		attendanceList.add(new AMData());

		return attendanceList;
	}
}
