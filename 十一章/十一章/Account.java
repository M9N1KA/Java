package 十一章;

import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		//dateCreated.getDate();
		//dateCreated.toGMTString();
	}
	/**
	 * @param uId 用户ID
	 * @param initBalance 初始余额
	 * */
	Account(int uId, double initBalance){
		id = uId;
		balance = initBalance;
	}
	public void setId(int newId){
		id = newId;
	}
	public int getId(){
		return id;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public double getBalance(){
		return balance;
	}
	public void setInterestAnnualRate(double newAnnualRate){
		annualInterestRate = newAnnualRate;
	}
	public double getInterestAnnualRate(){
		return annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return balance * annualInterestRate / 100 / 12;
	}
	public void withDraw(double withDrawBalance){
		balance -= withDrawBalance;
	}
	public void deposit(double depositBalance){
		balance += depositBalance;
	}
}