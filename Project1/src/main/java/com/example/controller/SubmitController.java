package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.ExpDaoImpl;
import com.example.model.Expenses;


public class SubmitController {
	
public static String Submit(HttpServletRequest request) {
		
		String extype = request.getParameter("extype");
		String comments = request.getParameter("comments");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		
		
//		int amount = request.getParameter();
		
		Expenses expense = new Expenses();
		expense.setAmount(amount);
		expense.setExtype(extype);
		expense.setComments(comments);
		
		
		ExpDaoImpl pdImpl = new ExpDaoImpl();
		pdImpl.submitExp(expense);
		
		return "/html/EmployeeHome.html";
		
	}

}
