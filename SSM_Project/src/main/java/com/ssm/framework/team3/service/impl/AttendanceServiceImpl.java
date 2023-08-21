package com.ssm.framework.team3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team3.bean.Attendance;
import com.ssm.framework.team3.mapper.AttendanceMapper;
import com.ssm.framework.team3.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceMapper attendanceMapper;
	
	@Override
	public List<Attendance> getAll() {
		return attendanceMapper.getAll();
	}

}
