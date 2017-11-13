package com.ymeng.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
