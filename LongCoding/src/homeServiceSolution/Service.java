package homeServiceSolution;

public class Service {
	static int id =0;
	int ServiceId;
	String ServiceName ;
	String ServiceAvailable;
	public Service( String serviceName, String serviceAvailable) {
		
		this.ServiceId = ++id;
		this.ServiceName = serviceName;
		this.ServiceAvailable = serviceAvailable;
	}

	public String toString() {
		return "ServiceId : " + ServiceId + "\nServiceName : " + ServiceName + "\nServiceAvailable : "
				+ ServiceAvailable ;
	}
	
	

}
