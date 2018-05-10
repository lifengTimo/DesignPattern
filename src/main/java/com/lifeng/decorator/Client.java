package com.lifeng.decorator;

public class Client {

	public static void main(String[] args) {
		Beverage beverage=new HouseBlend();
		beverage=new Mocha(beverage);
		beverage=new Mocha(beverage);
		beverage=new Soy(beverage);
		System.out.println("$"+beverage.cost());
		System.out.println(beverage.getDescription());
		

	}

}
