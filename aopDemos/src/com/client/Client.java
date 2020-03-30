package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.advice.MyConfig;
import com.app.WelcomeApp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		      WelcomeApp obj = (WelcomeApp) context.getBean("WelcomeApp");
		      System.out.println(obj.sayWelcome("Meghna"));
		      System.out.println(obj.sayBye("Meghna"));
	}

	}


