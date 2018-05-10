package com.lifeng.foctory;

import java.util.ArrayList;

public abstract class Pizza {

	//名称
	String name;
	//面团
	Dough dough;
	//酱
	Sauce sauce;
	//奶酪
	Cheese cheese;
	//蔬菜
	Veggies veggies[];
	//意大利辣味香肠
	Pepperoni pepperoni;
	//蛤
	Clams clam;
	//装饰
	ArrayList<String> topppings = new ArrayList<>();

	/**
	 * 
	* @Title: prepare 
	* @param   参数说明 
	* @return void    返回类型 
	* @throws
	 */
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough....");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings");
		for (int i = 0; i < topppings.size(); i++) {
			System.out.println(" " + topppings.get(i));
		}
	}

	/**
	 * 
	* @Title: bake 
	* @Description: TODO(烤披萨) 
	* @param   参数说明 
	* @return void    返回类型 
	* @throws
	 */
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	/**
	 * 
	* @Title: cut 
	* @Description: TODO(切披萨) 
	* @param   参数说明 
	* @return void    返回类型 
	* @throws
	 */
	void cut() {
		System.out.println("Cutting the pizza into diagoanl slices");
	}
	/**
	 * 
	* @Title: box 
	* @Description: TODO(打包披萨) 
	* @param   参数说明 
	* @return void    返回类型 
	* @throws
	 */
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
