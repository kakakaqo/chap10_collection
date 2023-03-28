package com.javalab.collection.pkg13;

public class Product {

	// 필드
	private int id; // 번호
	private String name; // 이름
	private int price; // 가격

	// 기본 생성자(파라미터, 내용부 없음)
	public Product() {
		super();
	}

	// 오버로딩 생성자
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// 게터/ 세터 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 디버깅용 to string() 메소드 
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}