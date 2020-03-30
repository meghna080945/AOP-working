package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect2 implements Ordered {
@After("execution(* com.app.WelcomeAppImpl.*(..))")
public void callAfter() {
	System.out.println("Called after ");
}

@Override
public int getOrder() {
	// TODO Auto-generated method stub
	return 2;
}

}
