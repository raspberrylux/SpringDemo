package com.ymeng.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		
		System.out.println("Get bean");
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println("Bean is here");
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		context.close();
		
	}
}
