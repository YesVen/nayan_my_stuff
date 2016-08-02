package com.nayan.SpringStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Hello world!
 *
 */
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.nayan.components.Employee;
@Configuration
@ComponentScan(basePackages="com.nayan")
@Component
public class App 
{
	@Autowired
	Employee employee;
    public static void main( String[] args )
    {
    
    	/*ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWord obj = (HelloWord) context.getBean("helloBean");
        obj.printHello();
        
        Employee e1 = (Employee) context.getBean("employee");
        System.out.println(e1);*/
    	
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    	/*System.out.println(context.getBean("employee"));
    	App a = (App)context.getBean("app");
    	System.out.println(a.employee);*/
    	
    	System.out.println(context.getBean("helloWord"));
    	System.out.println("Shutting Down");
    	context.registerShutdownHook();
    	
    	
    }
}
