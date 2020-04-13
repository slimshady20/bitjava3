package com.jse.phone;
import lombok.Data;


@Data

public class Phone {
	private String phoneNumber,name,company;
	
	
//	@Override		// @´Â annotation(ÁÖ¼®)
	//public String toString() {
//		return "Phone :PhoneNumber=" + phoneNumber + ", Name=" + name + ", Company=" + company;
//	}
	
	// alt shift s 
	
}
@Data
	class CellPhone extends Phone {   
	private boolean portable;
	private String move;
	
}
@Data
	class Iphone extends CellPhone {
		private String search;

		/*	
		public Iphone(String phoneNumber, String name, String company, boolean portable,String search) {
//			super(phoneNumber, name, company, portable);
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
		}*/
	}
@Data
	class GalaxyNote extends Iphone {
		private String bigSize;
		/*
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
*/
		
	}

