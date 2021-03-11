
public class Employee {
	private int employeeID;
	private int officeID;
	private String type;
	private String name;
	private Date birthdate;
	private String gender;
	private Address address;
	private Phone phone;
	private double salary;
	private int price;
	private int failCount;
	private Boolean status;
	
	public Employee(int officeID, String type, String name, Date birthdate, String gender, Address address,Phone phone) {
		this.officeID = officeID;
		this.type = type;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		salary=2020.58;
		failCount=0;
		status=true;
		price=0;
				
	}
	public Employee() {
		this.officeID = -1;
		this.type = null;
		this.name = null;
		this.birthdate = null;
		this.gender = null;
		this.address = null;
		this.phone = null;
		this.employeeID=-1;
		salary=0;
		failCount=0;
		status=false;
	}
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the failCount
	 */
	public int getFailCount() {
		return failCount;
	}

	/**
	 * @param failCount the failCount to set
	 */
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

	/**
	 * @return the officeID
	 */
	public int getOfficeID() {
		return officeID;
	}

	/**
	 * @param officeID the officeID to set
	 */
	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Office ID: " +this.officeID);
		System.out.println("Type: " + this.type);
		System.out.println("Name: "+ this.name);
		System.out.println("Birthdate: " + birthdate.display());
		System.out.println("Gender: " + this.gender);
		System.out.println("Adress: " + address.display());
		System.out.println("EmployeeID: " +this.employeeID);
		System.out.println("Phone: " +phone.display());
	}

}
