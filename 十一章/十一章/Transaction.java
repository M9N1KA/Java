package Ê®Ò»ÕÂ;

import java.util.Date;

public class Transaction {
	private Date date = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction(char type,double amount,
			double balance,String description){
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		this.type = type;
	}
	
	
}
