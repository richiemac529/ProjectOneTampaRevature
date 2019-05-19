package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.PetDaoImpl;
import com.example.model.Pet;

public class RetrieveController {

	
	
public static String Retrieve(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		
		PetDaoImpl pdImpl = new PetDaoImpl();
		Pet p = new Pet();
		p = pdImpl.selectPetByName(name);
		
		if(name.equals(p.getname()) & type.equals(p.getpass())) {
			
			return "/html/EmployeeHome.html";
		}
		
		return "/html/AdminHome.html";
		
	}
}
