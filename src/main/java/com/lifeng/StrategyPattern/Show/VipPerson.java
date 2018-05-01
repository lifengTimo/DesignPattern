package com.lifeng.StrategyPattern.Show;
/**
 * 会员
 * @author PA
 *
 */
public class VipPerson implements CalPrice{

	public double getPrice(double price) {
		// TODO Auto-generated method stub
		return price*0.9;
	}

}
