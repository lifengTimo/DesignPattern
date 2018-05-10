package com.lifeng.decorator;

public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		this.beverage=beverage;
		this.size=beverage.size;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+ 0.20;
	}

	@Override
	public String getDescription() {
		this.description=" Soy";
		String description=beverage.getDescription()+this.description;
		return description;
	}

	
}
