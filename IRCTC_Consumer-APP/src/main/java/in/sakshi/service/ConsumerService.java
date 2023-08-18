package in.sakshi.service;

import in.sakshi.request.Passenger;
import in.sakshi.response.Ticket;

public interface ConsumerService {
	
	public Ticket bookTicket(Passenger passenger);
	
	
	public Ticket getTicketByNum(Integer ticketNumber);
	

}
