package com.jse.swing;
/*
 * Ŭ���̾�Ʈ���� ���α׷� ���� ��û�� �Խ��ϴ�. 
 * * �̸��� ��,��,�� ������������ �Է¹޾Ƽ�() 
 * [ȫ�浿 : ���� ***��, * ���***��,���� : F] �� ����ϴ� ���α׷��� ����� �ּ���. 
 * ��) ����� �Ҽ������ϴ� �����մϴ�
 *  ��������� 90�� �̻� A 
 *  * 80�� �̻��̸� B 
 *  70�� �̻��̸� C
 *   60�� �̻��̸� D 
 *   50�� �̻��̸� E 
 *   50�� �̸��̸� F �����Դϴٶ�� ��µǰ� ���ּ���
 */
public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setKorean(int korean) {
		this.korean= korean;
	}
	public int getKorean() {
		return korean;
	}
	public void setEnglish(int english) {
		this.english= english;
	}
	public int getEnglish() {
		return english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public String grade() {
		String grade="";
	//int average= (korean + english + math)/3;
	 int average= 	average();
		
		if(average>=90) {
			grade="A .";	
		} else if(average>=80) {
			grade="B ";
		} else if(average>=70) {
			grade="C ";
		} else if(average>=60) {
			grade="D ";
		} else if(average>=50) {
			grade="E ";
		} else if(average<50) {
			grade="F";
		} else {
			grade="�߸� �Էµ� ���Դϴ�.";
		}
		return grade;
	}
	public int total() {
	//	int total= korean + english + math;
	//	return total;
		 return korean + english + math;
	}
	public int average() {
	//	int average2=  (korean + english + math)/3;
	//	return average2;
		return total()/3;  
	}
	
}


