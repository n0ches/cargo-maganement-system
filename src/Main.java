import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws FileNotFoundException, IOException {
				Management DECargo = new Management(20,20,20,20,20);
				int count=0;
				int i=0;
				try(BufferedReader scanner1 = new BufferedReader(new FileReader("input.txt"));){
					while(scanner1.readLine()!=null) {
						count++;
					}
					}
					//System.out.println(count);
					String[] array=new String[count];
					try(Scanner scanner =  new Scanner(new FileReader("input.txt"))){
						while(scanner.hasNextLine()) {
							
							array[i]=scanner.nextLine();
							i++;
						}
						for(int j=0;j<count;j++) 
						{
							String [] array1=array[j].split(";");
							
							if(array1[0].equals("addOffice")) 
							{
								Address address = new Address(array1[2], array1[3], array1[4]);
								Phone phone = new Phone(Integer.parseInt(array1[5].substring(1,3)),Integer.parseInt(array1[5].substring(3, 6)),Integer.parseInt(array1[5].substring(6)));
								DECargo.addOffice(array1[1], address, phone);
							}
				
							else if(array1[0].equals("listOffices")) {
								DECargo.listOffices();
							}
							else if(array1[0].equals("addEmployee")) {
								Address address = new Address(array1[6], array1[7], array1[8]);
								Phone phone = new Phone(Integer.parseInt(array1[9].substring(1,3)),Integer.parseInt(array1[9].substring(3, 6)),Integer.parseInt(array1[9].substring(6)));
								Date birthdate=new Date(Integer.parseInt(array1[4].substring(0,2)),Integer.parseInt(array1[4].substring(3,5)),Integer.parseInt(array1[4].substring(6)));
								//System.out.println(Integer.parseInt("02"));
								if(birthdate.dateControl()==true) {
									DECargo.addEmployee(Integer.parseInt(array1[1]),array1[2], array1[3], birthdate,array1[5], address, phone);
								}
								else {
									System.out.println("Given date information is invalid!");
								}
							}
							else if(array1[0].equals("listEmployees")) {
								DECargo.listEmployees();
							}
							else if(array1[0].equals("deleteEmployee")) {
								DECargo.deleteEmployee(Integer.parseInt(array1[1]));
							}
							else if(array1[0].equals("addCustomer")) {
								Address address = new Address(array1[5], array1[6], array1[7]);
								Phone phone = new Phone(Integer.parseInt(array1[8].substring(1,3)),Integer.parseInt(array1[8].substring(3, 6)),Integer.parseInt(array1[8].substring(6)));
								Date birthdate=new Date(Integer.parseInt(array1[2].substring(0,2)),Integer.parseInt(array1[2].substring(3,5)),Integer.parseInt(array1[2].substring(6)));
								if(birthdate.dateControl()==true) {
									DECargo.addCustomer(array1[1],birthdate, array1[3], array1[4],address, phone);
								}
								else {
									System.out.println("Given date information is invalid!");
								}
							}
							else if(array1[0].equals("listCustomers")) {
								DECargo.listCustomers();
							}
							else if(array1[0].equals("deleteCustomer")) {
								DECargo.deleteCustomer(Integer.parseInt(array1[1]));
							}
							else if(array1[0].equals("addPacket")) {
								Date date=new Date(Integer.parseInt(array1[5].substring(0,2)),Integer.parseInt(array1[5].substring(3,5)),Integer.parseInt(array1[5].substring(6)));
								if(date.dateControl()==true) {
								DECargo.addPacket(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]),Integer.parseInt(array1[3]),array1[4],date);
								}
								else {
									System.out.println("Given date information is invalid!");
								}
							}
							else if(array1[0].equals("listPackets")) {
								DECargo.listPackets();
							}
							else if(array1[0].equals("updateOffice")) {
								Address address = new Address(array1[3], array1[4], array1[5]);
								Phone phone = new Phone(Integer.parseInt(array1[6].substring(1,3)),Integer.parseInt(array1[6].substring(3, 6)),Integer.parseInt(array1[6].substring(6)));
								DECargo.updateOffice(Integer.parseInt(array1[1]),array1[2],address,phone);
							}
							else if(array1[0].equals("updateEmployee")) {
								Address address = new Address(array1[7], array1[8], array1[9]);
								Phone phone = new Phone(Integer.parseInt(array1[10].substring(1,3)),Integer.parseInt(array1[10].substring(3, 6)),Integer.parseInt(array1[10].substring(6)));
								Date birthdate=new Date(Integer.parseInt(array1[5].substring(0,2)),Integer.parseInt(array1[5].substring(3,5)),Integer.parseInt(array1[5].substring(6)));
								if(birthdate.dateControl()==true) {
								DECargo.updateEmployee(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]),array1[3],array1[4],birthdate,array1[6],address,phone);
								}
								else {
									System.out.println("Given date information is invalid!");
								}
							}
							else if(array1[0].equals("updateCustomer")) {
								Address address = new Address(array1[6], array1[7], array1[8]);
								Phone phone = new Phone(Integer.parseInt(array1[9].substring(1,3)),Integer.parseInt(array1[9].substring(3, 6)),Integer.parseInt(array1[9].substring(6)));
								Date birthdate=new Date(Integer.parseInt(array1[3].substring(0,2)),Integer.parseInt(array1[3].substring(3,5)),Integer.parseInt(array1[3].substring(6)));
								if(birthdate.dateControl()==true) {
								DECargo.updateCustomer(Integer.parseInt(array1[1]),array1[2],birthdate,array1[4],array1[5],address,phone);
								}
								else {
									System.out.println("Given date information is invalid!");
								}
							}
							else if(array1[0].equals("updatePacket")) {
								Date date=new Date(Integer.parseInt(array1[6].substring(0,2)),Integer.parseInt(array1[6].substring(3,5)),Integer.parseInt(array1[6].substring(6)));
								if(date.dateControl()==true) {
								DECargo.updatePacket(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]),Integer.parseInt(array1[3]),Integer.parseInt(array1[4]),array1[5],date);
								}
								else {
									System.out.println("Given date information is invalid!");
								}
							}
							else if(array1[0].equals("deliverPacket")) {
								DECargo.deliverPacket(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
							}
							else if(array1[0].equals("trackPacket")) {
								DECargo.trackPacket(Integer.parseInt(array1[1]));
							}
							else if(array1[0].equals("lossPacket")) {
								DECargo.lossPacket(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
								DECargo.fireEmployee();
							}
							else if(array1[0].equals("increaseSalaries")) {
								DECargo.increaseSalaries();
								
							}
							else if(array1[0].equals("totalIncome")) {
								DECargo.totalIncome(Integer.parseInt(array1[1]));
								
							}
							else if(array1[0].equals("top3Customers")) {
								DECargo.top3Customers();
							}
						}
							
						
						//DERE.displayAgents();
					 }
						
					 catch (FileNotFoundException e) {
						System.out.println("Error!");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("Error!");
						e.printStackTrace();
					}
					
				
				
			}
		}



