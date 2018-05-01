package com.lifeng.StrategyPattern.Show;
/**
 * 金牌会员
 * @author PA
 *
 */
public class GoldVipPerson implements CalPrice{

	public double getPrice(double price) {
		// TODO Auto-generated method stub
		return price*0.7;
	}

}
