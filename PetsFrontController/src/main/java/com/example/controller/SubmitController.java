package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.ExpDaoImpl;
import com.example.model.Expanses;



public class SubmitController {
	
//public static String Submit(HttpServletRequest request) 
		
	
public static String Register(HttpServletRequest request) {
		
		String type = request.getParameter("type");
		double Amount =  Double.parseDouble(request.getParameter("Amount"));
		String Description = request.getParameter("Description");
		
		
		Expanses exp = new Expanses();
		exp.setAmount(Amount);
		exp.setType(type);
		exp.setDescription(Description);
		
		ExpDaoImpl pdImpl = new ExpDaoImpl();
		pdImpl.submitExp(exp);
		
		return "/html/EmployeeHome.html";
		
		
	}

}
