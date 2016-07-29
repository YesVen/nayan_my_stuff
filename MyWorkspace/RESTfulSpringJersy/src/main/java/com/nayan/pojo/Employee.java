package com.nayan.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name = "employee")
public class Employee {
	
	
	Integer id;
	String name;
	String profession;
	
	public Employee(){
	}
	
	public Employee(Integer id,String name, String profession){
		this.id=id;
		this.name=name;
		this.profession=profession;
	}
	
	public Integer getId() {
		return id;
	}
	
	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProfession() {
		return profession;
	}
	
	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}
	

}
