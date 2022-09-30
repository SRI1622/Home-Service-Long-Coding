package homeServiceSolution;

import java.util.*;

 class ServiceClass {
	 	Scanner sc = new Scanner(System.in);
	 	List<Service> li = new ArrayList<>();
	 	
	 	List<Booking> lio = new ArrayList<>();
	 	
		public void serviceClass(List<Customer> e) {
			System.out.println("#################################################");
			for(Customer i: e) {
			System.out.println("###########"+ i.CityName +"##########");
			}
		Service obj = new Service("HouseCleaning","Available");
		li.add(obj);
		Service obj1 = new Service("Appliance Repair","Available");
		li.add(obj1);
		Service obj2 = new Service("Plumbers","Available");
		li.add(obj2);
		Service obj3 = new Service("Electricians","Available");
		li.add(obj3);
		Service obj4 = new Service("Carpenters","Available");
		li.add(obj4);
		new ServiceClass().ShowListOfService(li);
		}
		
		public void ShowListOfServicePerson(List<ServicePerson> q) {
			for(ServicePerson w : q) {
				System.out.println(w);
			}
		}
		
		public void ShowListOfService(List<Service> e) {
			
			for(Service k : e) {
				System.out.println(k);
			}
			System.out.println();
			System.out.println("Choose the Service");
			int choice = sc.nextInt();
			
			//new ServiceClass().ShowListOfServicePerson();
			Booking o = new Booking(choice,1,"Available");
			lio.add(o);
			System.out.println(lio);
			
		}

	

}
