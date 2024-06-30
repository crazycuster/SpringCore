package com.crazycuster.demo.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.crazycuster.demo.config.AppConfig;
import com.crazycuster.demo.domain.Student;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Student student=context.getBean(Student.class);
		
		System.out.println(student);
	}

}
