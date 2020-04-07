package com.jse.swing;

public class ProductService {
	private ProductBean[] products;
	public ProductService() {
		products= new ProductBean[10]; //필드는 초기화하지않는다. 그래서 생성자로
	}
}
//아이템을 개발해라했을때 인스턴스변수는 name이 있다