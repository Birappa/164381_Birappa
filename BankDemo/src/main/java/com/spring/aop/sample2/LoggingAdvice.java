package com.spring.aop.sample2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


public class LoggingAdvice {

	public LoggingAdvice() {
		// TODO Auto-generated constructor stub
	}

	/*@Before("execution(public String getName())")
	public void log(JoinPoint joinPoint){
		System.out.println("log method is called. The Value is: "+ joinPoint.getTarget());
	}
	
	@AfterReturning(pointcut="allMethods()",returning="returnString")
	public void log2(String returnString){
		System.out.println("After method is called "+returnString);
	}
	
	@AfterThrowing(pointcut="allMethods()", throwing="ex")
	public void log3(RuntimeException ex){
		System.out.println("AfterThrowing method is called ");
		ex.printStackTrace();
	}
*/	
	/*@Around("allMethods()")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		//System.out.println("Around advice is called");
		
		try {
			System.out.println("Around advice Before is called");
			proceedingJoinPoint.proceed();
			System.out.println("Around advice After is called");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Pointcut("execution(public String getName())")
	public void allMethods(){}*/
	
	public void beforeAdvice(){
		System.out.println("before advice is called");
	}
}
