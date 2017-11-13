package com.ymeng.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

	//@Autowired
	private FortuneService fortuneService = null;


	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public TennisCoach(){
		System.out.println("inside TennisCoach constructor");
	}
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService")FortuneService fs){
		fortuneService = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice squach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getTeam(){
		return team;
	}

	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setFortuneService: " + fortuneService.toString());
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomeCrazyStuff(FortuneService fortuneService){
		System.out.println("doSomeCrazyStuff: " + fortuneService.toString());
	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("inside doMyCleanupStuff");
	}

}
