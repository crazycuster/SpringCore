package com.crazycuster.practice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

	// this will run before any method
	@Before(value="execution(* com.crazycuster..*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("before userservice Aspect>>>>>>");
	}
	
	@After(value="execution(* com.javadoubts.practice..*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("after userservice Aspect>>>>>>");
	}
	
	@AfterReturning(value="execution(* com.javadoubts.practice..*(..))")
	public void afterReturn(JoinPoint joinPoint) {
		System.out.println("after returning userservice Aspect>>>>>>");
	}
	
	@Around(value="execution(* com.javadoubts.practice..*(..))")
	public void aroundAdvice(JoinPoint joinPoint) {
		System.out.println("Around userservice Aspect>>>>>>");
	}

}
