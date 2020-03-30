package com.app;

import org.springframework.stereotype.Component;

@Component
public interface WelcomeApp {

	public String sayWelcome(String name); 
	public String sayStay(String name);
	public String sayBye(String name);
}
