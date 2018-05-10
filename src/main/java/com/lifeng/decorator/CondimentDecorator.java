package com.lifeng.decorator;

public abstract class CondimentDecorator extends Beverage{

	protected volatile Beverage beverage;
	
	
	public abstract String getDescription();
	

}
