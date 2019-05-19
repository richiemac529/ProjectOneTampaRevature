package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.PetDaoImpl;
import com.example.model.Pet;

public class LoginController {

	public static String Login(HttpServletRequest request) {
		
		

		String name = request.getParameter("name");
		String pass = request.getParameter("type");

		PetDaoImpl pdImpl = new PetDaoImpl();
		Pet p = new Pet();
		p = pdImpl.selectPetByName(name);
		
		String a = "Admin", b="1234";
		String c = "Alex" , d="0000";
		
		
		if (name.equals(a) & pass.equals(b) || name.equals(c) & pass.equals(d) ) {
	
			return "/html/AdminHome.html";
		}

		if (!(name.equals(p.getname()) || ! pass.equals(p.getpass()))) {

			return "/html/Login.html";
			}

		 if (name.equals(p.getname()) & pass.equals(p.getpass())) {

			return "/html/EmployeeHome.html";

		}
		 
		return "/html/Login.html";

	}

	// public static String Login1(HttpServletRequest request) {
	//
	// String username = request.getParameter("username");
	// String password = request.getParameter("password");
	//
	// PetDaoImpl pdImpl = new PetDaoImpl();
	// Pet p = new Pet();
	// p = pdImpl.selectPetByName1(username);
	//
	// if (username.equals(p.getUsername1()) & password.equals(p.getPassword1())) {
	//
	// return "/PetsFrontController/html/AdminHome.html";
	// }else
	//
	// return "/PetsFrontController/AdminHome.html";
	//
	// }

}
