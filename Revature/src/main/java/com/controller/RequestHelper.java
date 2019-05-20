package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		switch (request.getRequestURI()) {
		case "/ProjectOne/html/Login.do":
			return LoginController.Login(request);
		case "/ProjectOne/html/Ticket.do":
			return TicketController.submitTicket(request);
		case "/ProjectOne/html/LoadTable.do":
			return TableController.loadTicket(request, response);
		default:
			return null;
		}
	}
}
