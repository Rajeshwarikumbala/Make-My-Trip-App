package in.ashokit.response;

import lombok.Data;

@Data
public class Ticket {
	
	private Integer ticketNumber;
	private String status;
	private Double ticketcost;
	private String name;
	private String form;
	private String to;
	private String doj;
	private String trainNumber;
	

}
