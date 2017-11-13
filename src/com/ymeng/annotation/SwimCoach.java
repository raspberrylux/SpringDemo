package com.ymeng.annotation;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fs){
		this.fortuneService = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim twice per week";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
