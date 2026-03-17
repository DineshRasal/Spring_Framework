package com.example.springboot_aop_demo.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
	
	@Before("execution(* com.example.springboot_aop_demo.service.*.*(..))")
	public void beforeMethod(Joinpoint joinpoint)
	{
		System.out.println("Before execution of Method");
	}
	
	@After("execution(* com.example.springboot_aop_demo.service.*.*(..))")

	public void afterMethod(Joinpoint joinpoint)
	{
		System.out.println("After execution of Method");

	}
}
