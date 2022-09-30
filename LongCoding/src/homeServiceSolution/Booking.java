package homeServiceSolution;

import java.time.LocalDateTime;
public class Booking {
	static int bId= 0;
	int BookingId;
	int ServiceId;
	LocalDateTime DateOfBooking;
	int PersonId;
	String ActiveStatus;
	
	public Booking(int serviceId,int personId ,String activeStatus) {
		this.BookingId = ++bId;
		this.ServiceId = serviceId;
		LocalDateTime myObj = LocalDateTime.now();
		this.DateOfBooking = myObj;
		this.PersonId = personId;
		this.ActiveStatus = activeStatus; 
	}
	
	
	public String toString() {
		return "BookingId : " + BookingId + "\nServiceId : " + ServiceId + "\nDateOfBooking : " + DateOfBooking +"\nPersonId : "+PersonId +"\nActive Status : "+ActiveStatus ;
	}
	
	

}
