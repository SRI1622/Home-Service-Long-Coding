package homeServiceSolution;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Customer> list = new ArrayList<>();
		List<ServicePerson> service = new ArrayList<>();
		
		Customer obj = new Customer("Ram","Chennai","9876876543","ram12@gmail.com","Ram@123");
		list.add(obj);
		
		new ServiceClass().serviceClass(list);
		
		ServicePerson obj1 = new ServicePerson("Danial","9878796573","chennai",1);
		service.add(obj1);
		ServicePerson obj2 = new ServicePerson("Danial","9878796573","chennai",1);
		service.add(obj2);
		ServicePerson obj3 = new ServicePerson("Danial","9878796573","chennai",1);
		service.add(obj3);
		ServicePerson obj4 = new ServicePerson("Danial","9878796573","chennai",1);
		service.add(obj4);
		ServicePerson obj5 = new ServicePerson("Danial","9878796573","chennai",1);
		service.add(obj5);
		
		new ServiceClass().ShowListOfServicePerson(service);
		
	}

}
