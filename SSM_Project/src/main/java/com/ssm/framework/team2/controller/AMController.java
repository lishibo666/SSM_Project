package com.ssm.framework.team2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.entity.AmData;

//Author Chin

@Controller
public class AMController {
	@GetMapping("/attendance_month")
	public String getAttendance(Model model) {

		List<AmData> attendanceList = getAttendanceDataFromDatabase();

		model.addAttribute("attendanceList", attendanceList);
		return "attendance_month";
	}

	private List<AmData> getAttendanceDataFromDatabase() {

		List<AmData> attendanceList = new ArrayList<>();
		attendanceList.add(new AmData());
		attendanceList.add(new AmData());

		return attendanceList;
	}
}
