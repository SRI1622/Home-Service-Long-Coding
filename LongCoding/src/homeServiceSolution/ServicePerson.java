package homeServiceSolution;

public class ServicePerson {
	

	int PersonId=0;
	String PersonName;
	String Number;
	String CityName;
	int ServiceId;
	public ServicePerson( String personName, String number, String cityName, int serviceId) {
		this.PersonId = PersonId++;
		this.PersonName = personName;
		this.Number = number;
		this.CityName = cityName;
		this.ServiceId = serviceId;
	}
	
	public String toString() {
		return "PersonId : " + PersonId + "\nPersonName : " + PersonName + "\nNumber : " + Number
				+ "\nCityName : " + CityName + "\nServiceId : " + ServiceId;
	}
	

}
