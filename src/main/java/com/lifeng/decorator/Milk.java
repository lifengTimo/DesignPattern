package com.lifeng.decorator;



public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		this.beverage=beverage;
		this.size=beverage.size;
	
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+ 0.10;
	}


	@Override
	public String getDescription() {
		this.description=" Milk";
		String decription=beverage.getDescription()+this.description;
		return decription;
	}


}
