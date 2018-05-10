package com.lifeng.foctory;
/**
 * 
* @ClassName: NYPizzaIngredientsFactory 
* @Description: TODO(纽约配料工厂) 
* @author lifeng
* @date 2018年5月10日 下午3:27:08 
*
 */
public class NYPizzaIngredientsFactory  implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoChesse();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]= {new Garlic(),new Onion(),new Mushroom()};
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

	
}
