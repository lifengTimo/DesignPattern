package com.lifeng.decorator;

public class Decaf extends Beverage{

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}
	@Override
	public String getDescription() {
		this.description="DarkRoast";
		return description;
	}

}
