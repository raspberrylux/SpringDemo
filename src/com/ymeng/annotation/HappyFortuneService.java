package com.ymeng.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService(){
		
		System.out.println("inside HappyFortuneService no-arg constructor");
	}
	@Override
	public String getFortune() {

		return "Tomorrow is holiday";
	}

}
