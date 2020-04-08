package com.jse.inheritance;

public class CellPhone extends Phone {   
	private boolean portable;
	private String move;
	
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public CellPhone(String phoneNumber, String name, String company,boolean portable) {
		super(phoneNumber, name, company);
	//	this.portable=portable;
		setPortable(portable);       
}

	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		
		if(portable) {
			this.move= "ÈÞ´ë °¡´É";
	} else{
		this.move= "ÈÞ´ë ºÒ°¡´É";
		
	}
}
}
