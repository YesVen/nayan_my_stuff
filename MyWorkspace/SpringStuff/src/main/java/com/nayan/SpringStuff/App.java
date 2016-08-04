package com.nayan.SpringStuff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nayan.beans.HelloWord;
import com.nayan.components.Employee;

public class App {

	public static void main(String a[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWord obj = (HelloWord) context.getBean("helloBean");
        obj.printHello();
        
        Employee e1 = (Employee) context.getBean("employee");
        System.out.println(e1);
		
	}
	
}
