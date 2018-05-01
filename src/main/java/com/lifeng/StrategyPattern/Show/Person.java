package com.lifeng.StrategyPattern.Show;

public class Person {
	
	private CalPrice calPrice=new OrdinaryPerson();
	private double totalAmount;
	private double nowAmount;
	
	public void buyMoney(double money) {
		this.nowAmount=money;
		this.totalAmount+=money;
		if(totalAmount>=10000) {
			calPrice=new VipPerson();
		}else if(totalAmount>=20000) {
			calPrice=new SuperVipPerson();
		}else if(totalAmount>=30000) {
			calPrice=new GoldVipPerson();
		}
	}
	
	public double realCharge() {
		return calPrice.getPrice(this.nowAmount);
	}

}
