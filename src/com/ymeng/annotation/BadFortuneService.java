package com.ymeng.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
	
	private String[] data = {"no respect", "no value", "unhappy"};
	
	private Random myRandom = new Random();
			
	public BadFortuneService(){
		
		System.out.println("inside BadFortuneService no-arg constructor");
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		System.out.println("index:" + index);
		String theFortune = data[index];
		return "Tomorrow is work again: " + theFortune;
	}


}
