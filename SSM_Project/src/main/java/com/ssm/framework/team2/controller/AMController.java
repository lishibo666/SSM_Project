package com.ssm.framework.team2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.adata.AttendanceData;
//dev:chin
@Controller
public class AMController {
	@GetMapping("/attendance_month")
	public String getAttendance(Model model) {
		// データベースから勤怠情報を取得する処理を行う（仮にダミーデータを使用）
		List<AttendanceData> attendanceList = getAttendanceDataFromDatabase();

		model.addAttribute("attendanceList", attendanceList);
		return "attendance_month";
	}

	private List<AttendanceData> getAttendanceDataFromDatabase() {
		// データベースから勤怠情報を取得する処理を実装する（ダミーデータを使用）
		List<AttendanceData> attendanceList = new ArrayList<>();
		attendanceList.add(new AttendanceData("2023-01", 22, 20, 2, "160時間", "10時間"));
		attendanceList.add(new AttendanceData("2023-02", 20, 18, 2, "155時間", "8時間"));
		// ... 他のデータも追加

		return attendanceList;
	}
}
