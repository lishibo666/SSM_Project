package com.ssm.framework.team2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team2.dao.AmInfoMapper;
import com.ssm.framework.team2.entity.AmData;

//Author Chin

@Service
public class AmService {
	@Autowired
	private AmInfoMapper mapper;

	public List<AmData> getAmInfo() {
		return mapper.findAinfo();
	}

}
