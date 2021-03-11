
public class Customer {
	private int customerID;
	private String name;
	private Date birthdate;
	private String gender;
	private String mail;
	private Address address;
	private Phone phone;
	private Boolean status;
	private int numberOfCargo;
	
	public Customer(String name, Date birthdate, String gender, String mail, Address address, Phone phone) {
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.mail = mail;
		this.address = address;
		this.phone = phone;
		this.status=true;
		numberOfCargo=0;
	}
	public Customer() {
		this.name = null;
		this.birthdate = null;
		this.gender = null;
		this.mail = null;
		this.address = null;
		this.phone = null;
		this.customerID=-1;
		this.status=false;
	}

	/**
	 * @return the numberOfCargo
	 */
	public int getNumberOfCargo() {
		return numberOfCargo;
	}
	/**
	 * @param numberOfCargo the numberOfCargo to set
	 */
	public void setNumberOfCargo(int numberOfCargo) {
		this.numberOfCargo = numberOfCargo;
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
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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
	
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Birthdate: " + birthdate.display());
		System.out.println("Gender: " + this.gender);
		System.out.println("Mail: " + this.mail);
		System.out.println("Adress: " + address.display());
		System.out.println("Phone: " +phone.display());
	}
	
}
