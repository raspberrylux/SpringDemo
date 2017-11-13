package com.ymeng.annotation;

public class LuxFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Here is Luxembourg";
	}

}
