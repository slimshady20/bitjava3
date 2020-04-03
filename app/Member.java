package com.jse.app;

public class Member {
	public String id; //instance variable
	public Member() {  //constructor
	
	}
	public void setId(String id) { // 갈색 id는 local variable 
		System.out.println("지역변수 들어옴"+ id);
		this.id = id;   //this 는 필드 에있는 변수를 가리키는 용어
		System.out.println("인스턴스 변수에 저장됨: " + this.id);
	}
				
	public String getId() { //4라인에 String과  String 일치해야함
		return this.id; 
	}
}
