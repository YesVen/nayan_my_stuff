package com.nayan.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class HelloWord implements InitializingBean,DisposableBean  
{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello ! " + name);
	}

	public void destroy() throws Exception {
		System.out.println("destroy of DisposableBean");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet of InitializingBean");
		
	}
}