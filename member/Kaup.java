package com.jse.member;

/*
 �����ڴ� Ű�� �����Ը� �̿��Ͽ� 
 ī��Ǫ������ ���ϰ�
 Kaup= ü��(Kg) / ����(m)2
 �װ�� ����15~18
 ,��ü�� 18~20
 ,�� 20�̻�
 ������ ���� ���¸�
 �˷��ִ� ���α׷��� ������ּ���.
 */
public class Kaup {

	private double weight;
	private double height;
	
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setHeight(double height) {
		this.height = height /100;
	}

	public double getHeight() {
		return height;
	}
	
	public String estimate() {
	
		String result2="";
		double kaupindex = weight/(height*height);
				if(kaupindex <18.5) {	
			result2="��ü��";	
		} else if( kaupindex<23.0) {
 			result2= "����ü��";
		} else if (kaupindex <25.0) {
				result2= "��ü��";
			} else {
				result2 =" �ʰ�ü��";
				
			}
		return result2;
}
}