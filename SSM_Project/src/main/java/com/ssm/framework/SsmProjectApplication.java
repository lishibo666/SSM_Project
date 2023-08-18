package com.ssm.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssm.framework.team3.mapper")
public class SsmProjectApplication {

	//こんにちは
	public static void main(String[] args) {
		SpringApplication.run(SsmProjectApplication.class, args);
	}

}
