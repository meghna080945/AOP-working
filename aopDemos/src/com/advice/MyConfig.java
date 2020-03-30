package com.advice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com")
@EnableAspectJAutoProxy
public class MyConfig {
	/*@Bean
	public WelcomeApp WelcomeApp() {
		return new WelcomeAppImpl();
	}*/
}
