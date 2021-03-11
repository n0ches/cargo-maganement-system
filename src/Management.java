import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Management {
	private Office[] offices;
	private static int countOffices;
	private Employee[] employees;
	private static int countEmployees;
	private Customer[] customers;
	private static int countCustomers;
	private Packet[] packets;
	private static int countPackets;
	
	public Management(int officeCapacity,int employeesCapacity,int customerCapacity,int packetCapacity,int topCustomerCapacity) {
		offices=new Office[officeCapacity];
		countOffices=0;
		employees=new Employee[employeesCapacity];
		countEmployees=0;
		customers=new Customer[customerCapacity];
		countCustomers=0;
		packets=new Packet[packetCapacity];
		countPackets=0;
		
	}
	
	
		//OFFICE\\
	public void addOffice(String name, Address address, Phone phone) {
		offices[countOffices]=new Office(name,address,phone);
		offices[countOffices].setOfficeID(countOffices+1);
		countOffices++;
		System.out.println("The Office has been added successfully!");
	}
	public void listOffices() {
		
		for(int i=0;i<countOffices;i++) {
			System.out.println("******OFFICE "+(i+1)+"******");
			offices[i].display();
			System.out.println();
			
		}
	}
	public void updateOffice(int id,String name, Address address, Phone phone) {
		boolean flag=false;
		for(int i=0;i<countOffices;i++) {
			if(offices[i].getOfficeID()==id) {
				offices[i]=new Office(name, address, phone);
				offices[i].setOfficeID(id);
				System.out.println("The office has been updated successfully!");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Geçersiz office güncellenmeye çalýþýldý.");
		}
	}
	public void totalIncome(int id) {
		for(int i=0;i<countOffices;i++) {
			int temp=0;
			if(offices[i].getOfficeID()==id) {
				for(int j=0;j<countEmployees;j++) {
					if(employees[j].getOfficeID()==id) {
						temp+=employees[j].getPrice();
					}
				}
				offices[i].setIncome(temp);
				System.out.print(offices[i].getName()+" toplam geliri: ");
				System.out.println(offices[i].getIncome());
			}
		}
	}
	//OFFICE\\
	
	//EMPLOYEE\\
	public void addEmployee(int officeID, String type, String name, Date birthdate, String gender, Address address,Phone phone) {
		employees[countEmployees]=new Employee(officeID,type,name,birthdate,gender,address,phone);
		employees[countEmployees].setEmployeeID(countEmployees+1);
		countEmployees++;
		System.out.println("The employee has been added successfully!");
	}
	public void listEmployees() {
		for(int i=0;i<countEmployees;i++) {
			if(employees[i].getStatus()!=false) {
			System.out.println("******EMPLOYEE "+(i+1)+"******");
			employees[i].display();
			System.out.println();
			}
		}
	}
	public void deleteEmployee(int id) {
		boolean flag=true;
		for(int i=0;i<countEmployees;i++) {
			if(employees[i].getEmployeeID()==id) {
				employees[i]=new Employee();
				flag=false;
				System.out.println("The employee has been deleted successfully!");
			}
		}
		if(flag==true) {
			System.out.println("Geçersiz Çalýþan");
		}
	}
	public void updateEmployee(int id,int officeID, String type, String name, Date birthdate, String gender, Address address,Phone phone) {
		boolean flag=false;
		for(int i=0;i<countEmployees;i++) {
			if(employees[i].getEmployeeID()==id) {
				employees[i]=new Employee(officeID,type,name,birthdate,gender,address,phone);
				employees[i].setEmployeeID(id);
				System.out.println("The office has been updated successfully!");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Geçersiz çalýþan güncellenmeye çalýþýldý.");
		}
	}
	public void fireEmployee() {
		for(int i=0;i<countEmployees;i++) {
			if(employees[i].getFailCount()>=3) {
				employees[i]=new Employee();
				System.out.println(employees[i].getEmployeeID()+"ID number employee has been fired!");
			}
		}
	}
	public void increaseSalaries() {
		for(int i=0;i<countEmployees;i++) {
			if(employees[i].getStatus()==true) {
			double temp = employees[i].getSalary();
			temp+=temp/10;
			employees[i].setSalary(temp);
		}
	}
		System.out.println("Maaþlar baþarýyla arttýrýlmýþtýr");
}
	
	//EMPLOYEE\\
	
	//CUSTOMER
	public void addCustomer(String name, Date birthdate, String gender, String mail, Address address, Phone phone) {
		customers[countCustomers]=new Customer(name,birthdate,gender,mail,address,phone);
		customers[countCustomers].setCustomerID(countCustomers+1);
		countCustomers++;
		System.out.println("The customer has been added successfully!");
	}
	public void listCustomers() {
		for(int i=0;i<countCustomers;i++) {
			if(customers[i].getStatus()!=false) {
			System.out.println("******CUSTOMER "+(i+1)+"******");
			customers[i].display();
			System.out.println();
			}
		}
	}
	public void deleteCustomer(int id) {
		boolean flag=true;
		for(int i=0;i<countCustomers;i++) {
			if(customers[i].getCustomerID()==id) {
				customers[i]=new Customer();
				flag=false;
				System.out.println("The customer has been deleted successfully!");
			}
		}
		if(flag==true) {
			System.out.println("Geçersiz customer");
		}
	}
	public void updateCustomer(int id,String name, Date birthdate, String gender, String mail, Address address, Phone phone) {
		boolean flag=false;
		for(int i=0;i<countCustomers;i++) {
			if(customers[i].getCustomerID()==id) {
				customers[i]=new Customer(name,birthdate,gender,mail,address,phone);
				customers[i].setCustomerID(id);
				System.out.println("The office has been updated successfully!");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Geçersiz çalýþan güncellenmeye çalýþýldý.");
		}
	}
	public void top3Customers() {
		System.out.println("TOP 3 CUSTOMER");
			int[] arr=new int[countCustomers];
			int max = -1,max2 = -1,max3 = -1;
			int temp[] = new int[3];
			int count=0;
			for(int i=0;i<countCustomers;i++) {
				count=0;
				for(int j=0;j<countPackets;j++) {
					if(packets[j].getSenderCustomer()==i) {
						count++;
					}
				}
				arr[i]=count;
			}
			for (int i = 0; i < countCustomers; i++)
			{
				if (arr[i] > max)
		      {
		          // This order of assignment is important
		          max3 = max2;
		          max2 = max;
		          max = arr[i];  
		          temp[0]=i;
		       }
				else if (arr[i] > max2)
			      {
					max3 = max2;
					max2 = arr[i]; 
					temp[1]=i;
			      }
				else if (arr[i] > max3)
			      {
					max3 = arr[i];  
					temp[2]=i;
			      }
			     

			}
			 System.out.println("TOP 3 Customers and Number of Packets : ");
		     System.out.println("First : "+max+" "+customers[temp[0]].getName());
		     System.out.println("Second : "+max2+" "+customers[temp[1]].getName());
		     System.out.println("Third : "+max3+" "+customers[temp[2]].getName());



			System.out.println("");
		}
		
		
	
	//CUSTOMER
	
	//PACKET
	public void addPacket(int senderCustomer, int receiverCustomer, int weight, String volume,Date date) {
		if(senderCustomer > countCustomers) {
			System.out.println("Geçersiz sender customer");
		}
		else if(receiverCustomer>countCustomers) {
			System.out.println("Geçersiz receiver customer");
		}
		else {
			packets[countPackets]=new Packet(senderCustomer,receiverCustomer,weight,volume,date);
			packets[countPackets].setPacketID(countPackets+1);
			countPackets++;
			customers[senderCustomer-1].setNumberOfCargo(customers[senderCustomer-1].getNumberOfCargo()+1);
			System.out.println("The packet has been added successfully!");
		}
		
	}
	public void listPackets() {
		for(int i=0;i<countPackets;i++) {
			if(packets[i].getStatus()!=false) {
			System.out.println("******PACKET "+(i+1)+"******");
			System.out.println("Sender customer: ");
			customers[packets[i].getSenderCustomer()-1].display();
			System.out.println();
			System.out.println("Receiver customer: ");
			customers[packets[i].getReceiverCustomer()-1].display();
			System.out.println();
			packets[i].display();
			
			}
		}
	}
	public void updatePacket(int id,int senderCustomer, int receiverCustomer, int weight, String volume,Date date) {
		boolean flag=false;
		for(int i=0;i<countPackets;i++) {
			if(packets[i].getPacketID()==id) {
				packets[i]=new Packet(senderCustomer,receiverCustomer,weight,volume,date);
				packets[i].setPacketID(id);
				System.out.println("The office has been updated successfully!");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Geçersiz packet güncellenmeye çalýþýldý.");
		}
	}
	public void deliverPacket(int packetID,int employeeID) {
		if(packetID>countPackets || packetID ==0) {
			System.out.println("Geçersiz packet ID");
		}
		if(employeeID>countEmployees || employeeID==0) {
			System.out.println("Geçersiz employee ID");
		}
		if(!(packetID>countPackets || packetID ==0) && !(employeeID>countEmployees || employeeID==0) ) {
			int temp=0;
			int price=0;
			if(customers[packets[packetID-1].getReceiverCustomer()-1].getAddress().getCity().equals(employees[employeeID-1].getAddress().getCity())) {
				packets[packetID-1].setAvailibility(1);
				price=packets[packetID-1].calculate(packets[packetID-1].getWeight(),packets[packetID-1].getVolume());
				temp= employees[employeeID-1].getPrice();
				employees[employeeID-1].setPrice(temp+price);
				System.out.println(packetID+" ID numarasýna sahip paket baþarýyla adrese teslim edilmiþtir.");
			}
			else {
				System.out.println("Packetýn gideceði þehir ile görevlinin çalýþtýðý þehir uyuþmuyor.");
			}
		
		
		}
	}
	public void trackPacket(int packetID) {
		if(packetID>countPackets || packetID ==0) {
			System.out.println("Geçersiz packet ID");
		}
		else {
		for(int i=0;i<countPackets;i++) {
			if(packets[i].getPacketID()==packetID) {
			System.out.println("******PACKET "+(i+1)+"******");
			System.out.println("Sender customer: ");
			customers[packets[i].getSenderCustomer()-1].display();
			System.out.println();
			System.out.println("Receiver customer: ");
			customers[packets[i].getReceiverCustomer()-1].display();
			System.out.println();
			packets[i].display();
			
			}
		}
	 }
  }
	public void lossPacket(int packetID,int employeeID) {
		if(packetID>countPackets || packetID ==0) {
			System.out.println("Geçersiz packet ID");
		}
		if(employeeID>countEmployees || employeeID==0 || employees[employeeID-1].getStatus()==false) {
			System.out.println("Böyle bir employee bulunamadý.");
		}
		if(!(packetID>countPackets || packetID ==0) && !(employeeID>countEmployees || employeeID==0 || employees[employeeID-1].getStatus()==false) ) {
			if(customers[packets[packetID-1].getReceiverCustomer()-1].getAddress().getCity().equals(employees[employeeID-1].getAddress().getCity())) {
				packets[packetID-1].setAvailibility(2);
				int temp=employees[employeeID-1].getFailCount();
				employees[employeeID-1].setFailCount(temp+1);
				System.out.println(packetID+" ID numarasýna sahip paket kaybolmuþtur. Bu paketle ilgilenen "+employeeID+" ID numarasýna sahip çalýþanýmý hakkýnda gerekli iþlemler yapýlacaktýr.");
			}
			else {
				System.out.println("Packetýn gideceði þehir ile görevlinin çalýþtýðý þehir uyuþmuyor.");
			}
		}
	}
}
