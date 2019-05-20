package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TicketDaoImpl;
import com.data.Ticket;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TableController {
	
	public static String loadTicket(HttpServletRequest request, HttpServletResponse response) {
		TicketDaoImpl tickImpl = new TicketDaoImpl();
		List<Ticket> l = new ArrayList<Ticket>();
		l = tickImpl.selectAllTickets();
		try {
			response.getWriter().write(new ObjectMapper().writeValueAsString(l));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "/html/AdminHome.html";
	}

}
