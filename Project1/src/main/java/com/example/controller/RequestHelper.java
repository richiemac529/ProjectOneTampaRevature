package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RequestHelper {
	
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		switch(request.getRequestURI()) {
		
		case "/PetsFrontController/html/Login.do":
			return LoginController.Login(request);
			
//		case "/PetsFrontController/html/Register.do":
//			return RegisterController.Register(request);
//			
		case "/PetsFrontController/html/EmployeeHome.do":
			return SubmitController.Submit(request);
		
//		case "/PetsFrontController/html/AdminHome.do" :
//				return RetrieveController.Retrieve(request);
				
		default:
			return "/html/Login.html";
		}
		
	}

}
