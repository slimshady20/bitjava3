package com.jse.inheritance;

public class Iphone extends CellPhone {
	private String search;

	
	public Iphone(String phoneNumber, String name, String company, boolean portable,String search) {
		super(phoneNumber, name, company, portable);
		this.search= search;
			}
	public String getSerach() {
		return search;
	}
	public void setSerach(String serach) {
		this.search = serach;
	}
	
	
	
	
	
}
