package 十一章;

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
	//重写withDraw方法
	public void withDraw(double withDrawBalance){
		double balance  = getBalance() - withDrawBalance; 
		String description  = "取款  " + withDrawBalance + "\t剩余："+ balance;
		record.add(new Transaction('W',withDrawBalance,balance,description));
	}
	
	@Override
	//重写deposit方法
	public void deposit(double depositBalance) {
		double balance  = getBalance() + depositBalance;
		String description = "存款  " + depositBalance + "\t剩余："+ balance;
		record.add(new Transaction('D',depositBalance,balance,description));
	}
}
