package com.lifeng.foctory;

public class Client {

	public static void main(String[] args) {
		PizzaStore nyStore=new NYPIzzaStore();
		
		Pizza pizza = nyStore.oraderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");
	}
}
