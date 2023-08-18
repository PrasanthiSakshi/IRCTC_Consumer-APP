package in.sakshi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.sakshi.request.Passenger;
import in.sakshi.response.Ticket;


@Service
public class ConsumerServiceImpl implements ConsumerService {
	
	private String BOOK_TICKET_URL="http://18.191.37.78:8080/ticket";
	
	private String GET_TICKET_URL="http://18.191.37.78:8080/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		/*RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respEntity = 
				rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		
		Ticket ticket = respEntity.getBody();
		*/
		
		WebClient webclient = WebClient.create();
		
		webClient.post()
	             .uri()	
		
		return null;
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		
		
		WebClient webClient = WebClient. create();
		 
		Ticket ticket = webClient.get()
		                         .uri(GET_TICKET_URL, ticketNumber)
		                         .retrieve()
		                         .bodyToMono(Ticket.class)
		                         .block();
		
		return ticket;
		
		
		
		
		
		/*RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> respEntity = 
				rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
		
		Ticket ticket = respEntity.getBody();
		*/
	
	}

}
