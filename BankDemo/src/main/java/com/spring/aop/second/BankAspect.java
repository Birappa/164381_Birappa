package com.spring.aop.second;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;





public class BankAspect {

	ApplicationContext context=new AnnotationConfigApplicationContext(BankConfig.class);
			
	public BankAspect() {
		
	}

	public void mainMethod(){
		
	}
	
	public Object getBean(String className){
		if(className.equals("BankAccount")) return context.getBean(BankAccount.class);
		if(className.equals("BankAccountRepositoryImpl")) return context.getBean(BankAccountRepositoryImpl.class);
		if(className.equals("BankAccountServiceImpl")) return context.getBean(BankAccountServiceImpl.class);
		if(className.equals("BankAccountController")) return context.getBean(BankAccountController.class);
		//if(className.equals("BankAspect")) return context.getBean(BankAspect.class);
		return null;
	}
	
	/*public static void main(String[] args) {
		System.out.println("hii"+BankAspect.getBean("BankAspect"));
	}*/
}
