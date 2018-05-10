package com.lifeng.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		// TODO Auto-generated constructor stub
	}
	public HouseBlend(Size size) {
		this.size=size;
	}
	@Override
	public double cost() {
		
		return .89;
	}
	@Override
	public String getDescription() {
		this.description="DarkRoast";
		return description;
	}

}
