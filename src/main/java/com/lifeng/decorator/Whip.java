package com.lifeng.decorator;

public class Whip extends CondimentDecorator {
	public Whip() {
		// TODO Auto-generated constructor stub
	}
	public Whip(Beverage beverage) {
		this.beverage=beverage;
		this.size=beverage.size;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 0.15;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " Whip";
	}

}
