package com.jse.app;

public class Member2 {
	public String id;
	public Member2() {
		
	}
	public void setId(String id) {
		System.out.println("지역변수 들어옴" + id);
		this.id = id;
		System.out.println("인스턴스변수 들어옴"+ this.id);
		
	}

}

