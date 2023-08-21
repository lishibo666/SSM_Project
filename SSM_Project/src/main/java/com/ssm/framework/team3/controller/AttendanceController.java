package com.ssm.framework.team3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.framework.team3.bean.Attendance;
import com.ssm.framework.team3.service.AttendanceService;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
	
	@RequestMapping("/info")
    public String findAll(Model model){
		List<Attendance> aList = attendanceService.getAll();
		System.out.println("******"+aList);
		model.addAttribute("Attendances",aList);
        return "AttendanceInfo";
    }
}
