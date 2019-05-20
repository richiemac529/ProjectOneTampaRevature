package com.dao;

import java.util.List;

import com.data.Ticket;

public interface TicketDao {

	int insertTicket(Ticket x);

	List<Ticket> selectAllTickets();

}
