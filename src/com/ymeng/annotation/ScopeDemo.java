package com.ymeng.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {
	
	public static void main(String[] args){
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
	
	TennisCoach coach1 = context.getBean("tennisCoach", TennisCoach.class);
	TennisCoach coach2 = context.getBean("tennisCoach", TennisCoach.class);
	
	System.out.println(coach1.toString());
	System.out.println(coach2.toString());
	System.out.println("coach1 == coach2: " + (coach1 == coach2));
	
	}
	
	
}
