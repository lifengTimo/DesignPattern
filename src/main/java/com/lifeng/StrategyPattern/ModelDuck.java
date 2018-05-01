package com.lifeng.StrategyPattern;
/**
 * 模型鸭
 * @author PA
 *
 */
public class ModelDuck extends Duck{

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
		
	}

}
