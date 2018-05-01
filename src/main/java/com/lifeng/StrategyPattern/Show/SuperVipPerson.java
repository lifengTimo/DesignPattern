package com.lifeng.StrategyPattern.Show;
/**
 * 超级会员
 * @author PA
 *
 */
public class SuperVipPerson implements CalPrice{

	public double getPrice(double price) {
		
		return price*0.8;
	}

}
