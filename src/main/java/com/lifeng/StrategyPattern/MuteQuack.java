package com.lifeng.StrategyPattern;

public class MuteQuack implements QuackBehavior {

	public void quack() {

		System.out.println("<< Silencd >>");
	}

}
