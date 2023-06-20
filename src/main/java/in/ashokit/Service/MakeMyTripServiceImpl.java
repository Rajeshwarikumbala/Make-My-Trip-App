package in.ashokit.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {
	

	private String BOOK_TICKET_URL="http://13.232.253.164:8080/ticket";
	
	private String GET_TICKET_URL="http://13.232.253.164:8080/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		

		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> responseEntity=
		                                                
		rt.postForEntity(BOOK_TICKET_URL, passenger,     Ticket.class);
     	Ticket ticket = responseEntity.getBody();
		
		return ticket;
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		RestTemplate rt = new  RestTemplate();
		
		ResponseEntity<Ticket> responseEntity=
		                                      
		rt.getForEntity(GET_TICKET_URL,Ticket.class, ticketNumber);
		Ticket ticket = responseEntity.getBody();
		return ticket;
	}

} 
