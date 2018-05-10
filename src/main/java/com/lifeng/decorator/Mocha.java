package com.lifeng.decorator;

public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		this.beverage=beverage;
		this.size=beverage.size;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return  beverage.cost()+.20;
	}

	@Override
	public String getDescription() {
		this.description=" Mocha";
		
		return beverage.getDescription()+ this.description;
	}

}
