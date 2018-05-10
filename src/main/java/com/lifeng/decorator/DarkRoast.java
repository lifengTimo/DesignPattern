package com.lifeng.decorator;

public class DarkRoast extends Beverage{

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .99;
	}
	
	public DarkRoast() {
		// TODO Auto-generated constructor stub
	}
	public DarkRoast(Size size) {
		this.size=size;
	}
	
	@Override
	public String getDescription() {
		this.description="DarkRoast";
		return description;
	}

}
