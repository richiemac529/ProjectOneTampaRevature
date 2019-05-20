package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.dao.TicketDaoImpl;
import com.data.Ticket;
//import com.data.User;

public class TicketController {

	public static String submitTicket(HttpServletRequest request) {
		//User user = (User) request.getSession().getAttribute("user");
		int type = Integer.parseInt(request.getParameter("type"));
		double amount = Double.parseDouble(request.getParameter("Amount"));
		String desc = request.getParameter("Description");
		TicketDaoImpl tickImpl = new TicketDaoImpl();
		Ticket tick = new Ticket(type, amount, desc);
		tickImpl.insertTicket(tick);
		return "/html/EmployeeHome.html";
	}

}
