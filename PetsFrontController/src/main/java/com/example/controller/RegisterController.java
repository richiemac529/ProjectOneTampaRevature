package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.PetDaoImpl;
import com.example.model.Pet;

public class RegisterController {
	
	public static String Register(HttpServletRequest request) {
		
		String type = request.getParameter("type");
		double Amount =  Double.parseDouble(request.getParameter("Amount"));
		String Description = request.getParameter("Description");
		
		
		
		
		Pet pet = new Pet();
		pet.setname(type);
		pet.setUserid(Amount);
		pet.setpass(Description);
		
		PetDaoImpl pdImpl = new PetDaoImpl();
		pdImpl.insertPet(pet);
		
		return "/html/Login.html";
		
	}

}
