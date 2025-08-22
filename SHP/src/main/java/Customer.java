package main.java;

public class Customer {
	private int custId;
	private String custName;
	private String custContact;
	private String custGender;
	private String custAddr;
	private String city;
	private String zipcode;

	// Constructors
//    public Customer() {}
	public Customer(String custName, String custContact, String custGender, String custAddr, String city,
			String zipcode) {
		this.custName = custName;
		this.custContact = custContact;
		this.custGender = custGender;
		this.custAddr = custAddr;
		this.city = city;
		this.zipcode = zipcode;
	}

	// Getters & Setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + custId + ", Name=" + custName + ", Contact=" + custContact + ", Gender=" + custGender
				+ ", Address=" + custAddr + ", City=" + city + ", Zip=" + zipcode + "]";
	}
}
