package com.nayan.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	Address add;
	Project project;

	 @Autowired	
	Employee(Project m3){
		this.project=m3;
	}
	
    @Autowired	
	Employee(Address add,Project m3){
		this.add=add;
		this.project=m3;
	}
	
	
	
	

}