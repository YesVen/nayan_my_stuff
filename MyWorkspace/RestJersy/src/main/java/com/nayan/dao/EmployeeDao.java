package com.nayan.dao;

import java.util.*;

import com.nayan.pojo.Employee;

public class EmployeeDao {
	
	public List<Employee> getListOfEmployees(){
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "Rohit", "Engineer"));
		list.add(new Employee(1, "Manoj", "Doctor"));
		list.add(new Employee(1, "Prabakar", "Tester"));
		list.add(new Employee(1, "Mahesh", "CA"));
		list.add(new Employee(1, "Rakesh", "Politician"));
		
		return list;
		
	}

}
