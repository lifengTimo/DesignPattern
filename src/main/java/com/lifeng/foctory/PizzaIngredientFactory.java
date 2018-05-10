package com.lifeng.foctory;
/**
 * 
* @ClassName: PizzaIngredientFactory 
* @Description: TODO(原料工厂) 
* @author lifeng
* @date 2018年5月10日 下午3:10:30 
*
 */
public interface PizzaIngredientFactory {
	/**
	 * 
	* @Title: createDough 
	* @Description: TODO(创建面团) 
	* @param @return  参数说明 
	* @return Dough    返回类型 
	* @throws
	 */
	public Dough createDough();
	/**
	 * 
	* @Title: createSauce 
	* @Description: TODO(创建调味汁) 
	* @param @return  参数说明 
	* @return Sauce    返回类型 
	* @throws
	 */
	public Sauce createSauce();
	/**
	 * 
	* @Title: createCheese 
	* @Description: TODO(创建奶酪) 
	* @param @return  参数说明 
	* @return Cheese    返回类型 
	* @throws
	 */
	public Cheese createCheese();
	/**
	 * 
	* @Title: createVeggies 
	* @Description: TODO(生产蔬菜) 
	* @param @return  参数说明 
	* @return Veggies[]    返回类型 
	* @throws
	 */
	public Veggies[] createVeggies();
	/**
	 * 
	* @Title: createPepperoni 
	* @Description: TODO(生产意大利辣味香肠) 
	* @param @return  参数说明 
	* @return Pepperoni    返回类型 
	* @throws
	 */
	public Pepperoni createPepperoni();
	/**
	 * 
	* @Title: createClam 
	* @Description: TODO(生产蛤) 
	* @param @return  参数说明 
	* @return Clams    返回类型 
	* @throws
	 */
	public Clams createClam();

}
