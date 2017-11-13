package com.ymeng.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
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
