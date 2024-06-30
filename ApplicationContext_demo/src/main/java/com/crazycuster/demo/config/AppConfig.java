package com.crazycuster.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crazycuster.demo.domain.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student student() 
	{
		
		return new Student(101,"Crazy");
	}
	
}
