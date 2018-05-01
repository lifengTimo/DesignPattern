package com.lifeng.StrategyPattern.Show;

public class Client {

	public static void main(String[] args) {
		Person person=new Person();
		person.buyMoney(5000D);
		System.out.println("玩家要付的钱："+person.realCharge());
		person.buyMoney(12000D);
		System.out.println("玩家要付的钱："+person.realCharge());
	}
}
