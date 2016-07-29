package com.nayan.service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nayan.dao.EmployeeDao;
import com.nayan.pojo.Employee;
import com.nayan.pojo.EmployeeList;

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
		try {
			return Response.status(200).entity(new ObjectMapper().writeValueAsString(new EmployeeDao().getListOfEmployees())).build();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@GET
	@Path("/getList4")
	@Produces("application/json")
	public Response getListOfUser4(){
		
		try {
			return Response.status(200).entity(new ObjectMapper().writeValueAsString(new EmployeeList(new EmployeeDao().getListOfEmployees()))).build();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	@GET
	@Path("/getList1")
	@Produces(MediaType.TEXT_PLAIN)
	public String getListOfUser1(){
		String writeValueAsString="";
		try {
			writeValueAsString = new ObjectMapper().writeValueAsString(new EmployeeDao().getListOfEmployees());
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writeValueAsString; 
	}
	

}
