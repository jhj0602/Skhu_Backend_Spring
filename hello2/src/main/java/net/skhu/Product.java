package net.skhu;

public class Product {//제품ㅇ의 이름과 가격 데이터를 넣어서 전달하기 위한 클래스이다  이런 목적의 클래스를 DTO 라고 부른다
	String name;
	int unitCost;

	public Product(String name, int unitCost) {
		this.name = name;
		this.unitCost = unitCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
}