package com.lifeng.decorator;

public class Espresso  extends Beverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
	}
	public Espresso(Size size) {
		this.size=size;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	@Override
	public String getDescription() {
		this.description="DarkRoast";
		return description;
	}

}
