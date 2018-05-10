package com.lifeng.foctory;

public class NYStyleVeggiePizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;

	public NYStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory=ingredientFactory;
	}
	@Override
	void prepare() {
		System.out.println("preparing "+name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		cheese=ingredientFactory.createCheese();
	}

}
