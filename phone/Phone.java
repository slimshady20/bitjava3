package com.jse.phone;
import lombok.Data;


@Data

public class Phone {
	private String phoneNumber,name,company;
	
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
	@Override		// @는 annotation(주석)
	public String toString() {
		return "Phone :PhoneNumber=" + phoneNumber + ", Name=" + name + ", Company=" + company;
	}
	
	// alt shift s 
	
}
	class CellPhone extends Phone {   
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
	/*	
		if(portable) {
			this.move= "휴대 가능";
	} else{
		this.move= "휴대 불가능";
		
	} */
		this .move =(portable) ? "휴대 가능" : "휴대 불가능";			// 삼항연산자
		
}
	@Override
	public String toString() {
		return super.toString()+ "portable=" + portable + ", move=" + move;
	}
}
	class Iphone extends CellPhone {
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
		@Override
		public String toString() {
			
			return super.toString()+ ", Serach = "+ search;
		}
	}
	class GalaxyNote extends Iphone {
		private String bigSize;
		public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search,String bigSize) {
			super(phoneNumber, name, company, portable, search);
			this.bigSize=bigSize;
		}

		public String getBigSize() {
			return bigSize;
		}

		public void setBigSize(String bigSize) {
			this.bigSize = bigSize;
		}

		@Override
		public String toString() {
			return super.toString()+", BigSize = "+ bigSize;
		}

		
	}

