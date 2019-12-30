package ʮһ��;

import java.util.ArrayList;

public class NewAccount extends Account{
	private String name;
	
	NewAccount(){
		
	}
	
	NewAccount(String name,int id,double balance){
		this.name = name;
		setId(id);
		setBalance(balance);
	}
	ArrayList<Transaction> record= new ArrayList<>();
	
	@Override
	//��дwithDraw����
	public void withDraw(double withDrawBalance){
		double balance  = getBalance() - withDrawBalance; 
		String description  = "ȡ��  " + withDrawBalance + "\tʣ�ࣺ"+ balance;
		record.add(new Transaction('W',withDrawBalance,balance,description));
	}
	
	@Override
	//��дdeposit����
	public void deposit(double depositBalance) {
		double balance  = getBalance() + depositBalance;
		String description = "���  " + depositBalance + "\tʣ�ࣺ"+ balance;
		record.add(new Transaction('D',depositBalance,balance,description));
	}
}
