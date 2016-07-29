package com.mkyong.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.nayan.dao.EmployeeDao;
import com.nayan.pojo.Employee;
import com.nayan.pojo.EmployeeList;

@Component
@Path("/EmployeeService")
public class EmployeeService {
	
	@GET
	@Path("/getList")
	 @Produces(MediaType.APPLICATION_XML)
	public List<Employee> getListOfUser(){
		return new EmployeeDao().getListOfEmployees();
	}
	
	@GET
	@Path("/getList3")
	 @Produces(MediaType.APPLICATION_XML)
	public EmployeeList getListOfUser3(){
		return new EmployeeList(new EmployeeDao().getListOfEmployees());
	}
	
	@GET
	@Path("/getList2")
	@Produces("application/json")
	public Response getListOfUser2(){
		return Response.status(200).entity(new EmployeeList(new EmployeeDao().getListOfEmployees())).build();
	}
	
	@GET
	@Path("/getList4")
	@Produces("application/json")
	public List<Employee> getListOfUser4(){
		return new EmployeeDao().getListOfEmployees();
	}
	
	
}
