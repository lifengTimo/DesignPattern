package com.lifeng.foctory;
/**
 * 
 * @ClassName: PizzaStore 
 * @Description: TODO(披萨店) 
 * @author lifeng
 * @date 2018年5月9日 上午11:15:12 
 *
 */
public abstract class PizzaStore {

	public Pizza oraderPizza(String type) {
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	abstract Pizza createPizza(String type);
}
