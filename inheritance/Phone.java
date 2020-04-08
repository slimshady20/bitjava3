package com.jse.inheritance;

public class Phone {
	private String phoneNumber;
	private String name;
	private String company;
	public Phone(String phoneNumber, String name, String company) {  //4. must에 line 16 다 일일이 넣기 귀찮아서 이렇게생성
		this.phoneNumber=phoneNumber;
		this.name=name;
		this.company=company;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// alt shift s 
	
}

