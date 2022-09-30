package homeServiceSolution;

public class Customer {
	static int id = 0;
	int CustomerId;
	String Name;
	String CityName;
	String Number;
	String EmailId;
	String Password;
	
	public Customer( String name, String cityName, String number, String emailId, String password) {
	
		this.CustomerId = ++id;
		this.Name = name;
		this.CityName = cityName;
		this.Number = number;
		this.EmailId = emailId;
		this.Password = password;
	}

	
	public String toString() {
		return "CustomerId : " + CustomerId + "\nName : " + Name + "\nCityId : " + CityName + "\nNumber : " + Number
				+ "\nEmailId : " + EmailId + "\nPassword : " + Password ;
	}
	
	
	

}
