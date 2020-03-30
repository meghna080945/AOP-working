package com.app;

import org.springframework.stereotype.Component;

@Component(value="WelcomeApp")
public class WelcomeAppImpl implements WelcomeApp {

	public String sayWelcome(String name) {
		return "welcome "+name;
	}

	@Override
	public String sayBye(String name) {
		// TODO Auto-generated method stub
		return "bye "+name;
	}
	@Override
	public String sayStay(String name) {
		// TODO Auto-generated method stub
		return "Stay "+name;
	}
	
}
