package com.ymeng.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private static String FORTUNE_ONE = "fortuneOne";
	private static String FORTUNE_TWO = "fortuneTwo";
	private static String FORTUNE_THREE = "fortuneThree";
	
	private String[] fortuneArrays = {FORTUNE_ONE, FORTUNE_TWO, FORTUNE_THREE};
	
 	@Override
	public String getFortune() {
 		int min = 0;
 		int max = 2;
 		
 		Random rand = new Random();
 		int index = rand.nextInt((max-min) + 1) + min;
 		System.out.println("what is the index " + index);
		return "Today is your lucky day! " + fortuneArrays[index];
	}

}
