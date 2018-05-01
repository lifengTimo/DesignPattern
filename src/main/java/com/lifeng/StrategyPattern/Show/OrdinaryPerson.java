package com.lifeng.StrategyPattern.Show;
/**
 * 普通成员
 * @author PA
 *
 */
public class OrdinaryPerson implements CalPrice{

	public double getPrice(double price) {
		
		return price*1.0;
	}



}
