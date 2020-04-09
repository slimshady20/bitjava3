package com.jse.member;

/*
 개발자님 키와 몸무게를 이용하여 
 카우푸지수를 구하고
 Kaup= 체중(Kg) / 신장(m)2
 그결과 정상15~18
 ,저체중 18~20
 ,비만 20이상
 등으로 몸의 상태만
 알려주는 프로그램을 만들어주세요.
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
			result2="저체중";	
		} else if( kaupindex<23.0) {
 			result2= "정상체중";
		} else if (kaupindex <25.0) {
				result2= "과체중";
			} else {
				result2 =" 초과체중";
				
			}
		return result2;
}
}