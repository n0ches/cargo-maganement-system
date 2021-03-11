public class Office {
	private int officeID;
	private String name;
	private Address address;
	private Phone phone;
	private int income;
	
	public Office(String name, Address address, Phone phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	/**
	 * @return the income
	 */
	public int getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(int income) {
		this.income = income;
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
		System.out.println("Adress: " + address.display());
		System.out.println("Phone: " +phone.display());
	}
	
	
	
}
