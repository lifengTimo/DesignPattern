package com.lifeng.decorator;

public abstract class Beverage {

	String description ="Unknown Beverage";
	Size size;
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public abstract double cost();
	public  String getDescription() {
		return description;
	}
	
}
