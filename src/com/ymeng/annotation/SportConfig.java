package com.ymeng.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ymeng.annotation")
public class SportConfig {
	
	@Bean
	public LuxFortuneService getLuxFortuneService(){
		LuxFortuneService fs = new LuxFortuneService();
		return fs;
	}
	
	@Bean
	public SwimCoach getSwimCoach(){
		SwimCoach coach = new SwimCoach(getLuxFortuneService());
		return coach;
	}

}
