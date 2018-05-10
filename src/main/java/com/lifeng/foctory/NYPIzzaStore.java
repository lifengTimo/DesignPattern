package com.lifeng.foctory;

public class NYPIzzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientsFactory();
		if(type.equals("cheese")) {
			return new NYSteyCheesePizza();
		}else if (type.equals("veggie")) {
			pizza=new NYStyleVeggiePizza(ingredientFactory);
			pizza.setName("New York Style VBeggire");
			return pizza;
		}else return null;

	}

}
