package com.nayan.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Address {
	
	String address;
	
	Address(){
		System.out.println("add constr "+this);
	}
	
	
}
