package com.jse.app;

public class Member {
	public String id; //instance variable
	public Member() {  //constructor
	
	}
	public void setId(String id) { // ���� id�� local variable 
		System.out.println("�������� ����"+ id);
		this.id = id;   //this �� �ʵ� ���ִ� ������ ����Ű�� ���
		System.out.println("�ν��Ͻ� ������ �����: " + this.id);
	}
				
	public String getId() { //4���ο� String��  String ��ġ�ؾ���
		return this.id; 
	}
}
