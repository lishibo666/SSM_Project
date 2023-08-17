package com.ssm.framework.team2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team2.entity.AMData;

//Author Chin

@Mapper
public interface InfoMapper {

	
	List<AMData> findWorkDays();
	
	List<AMData> findAinfo();

}
