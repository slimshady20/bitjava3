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
	public String score() {
		String result="";
		int average= (korean + english + math)/3;
	//  int average= 	averagescore();
		
		if(average>=90) {
			result="A .";	
		} else if(average>=80) {
			result="B ";
		} else if(average>=70) {
			result="C ";
		} else if(average>=60) {
			result="D ";
		} else if(average>=50) {
			result="E ";
		} else if(average<50) {
			result="F";
		} else {
			result="�߸� �Էµ� ���Դϴ�.";
		}
		return result;
	}
	public int totalscore() {
		int total= korean + english + math;
		return total;
	//	 return korean + english + math;
	}
	public int averagescore() {
		int average2=  (korean + english + math)/3;
		return average2;
	//	return totalscore()/3;  
	}
	
}


