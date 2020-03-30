package com.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect implements Ordered{
@Before("execution(* com.app.WelcomeAppImpl.*(..))")
public void callBefore() {
	System.out.println("Called before ");

}

@Override
public int getOrder() {
	// TODO Auto-generated method stub
	return 1;
}
}
