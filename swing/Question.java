package com.jse.swing;

/*
Ŭ���̾�Ʈ���� ���α׷� ���� ��û�� �Խ��ϴ�. 
�̸��� ��,��,�� ������������ �Է¹޾Ƽ�
 [ȫ�浿 : ���� ***��, * ���***��,���� : F] �� ����ϴ� ���α׷��� ����� �ּ���.
 
��) ����� �Ҽ������ϴ� �����մϴ� 
��������� 90�� �̻� A  
80�� �̻��̸� B 
70�� �̻��̸� C 
60�� �̻��̸� D 
50�� �̻��̸� E 
50�� �̸��̸� F �����Դϴ�
��� ��µǰ� ���ּ���
 * */
public class Quetion {
	private String name;
	private int korean;
	private int math;
	private int english;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getKorean() {
		return korean;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnglish() {
		return english;
	}

	public int total() {
		return korean + english + math;
	}

	public int average() {
		return total() / 3;
	}
	public String grade2() {
		String grade = "";
		
		return grade;
	}

	public String grade() {
		String grade = "";
		int average = average();
		switch(average) {
		
		case 9:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               break;
		case 2: break;
		case 3: break;
		
				}
	
		return grade;
	}

}