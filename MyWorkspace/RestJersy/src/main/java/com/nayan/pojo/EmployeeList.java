package com.nayan.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employeeList")
public class EmployeeList {
	
	List<Employee> list;
	
	public EmployeeList(){
	}
	
	public EmployeeList(List<Employee> list){
		this.list = list;
	}

	public List<Employee> getList() {
		return list;
	}

	@XmlElement
	public void setList(List<Employee> list) {
		this.list = list;
	}
	

}
