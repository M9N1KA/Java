package 大作业;

import java.util.ArrayList;
import java.util.ListIterator;

public class Login{

	//用于做登录判断
	private String password;
	private String username;
	private boolean admin = true;
	int index;
	
	Login(){}
	
	public void NewPassWord(String password) {
		//作为输入的缓存区，接受读入的密码
		this.password = password;
	}
	
	public void NewUserName(String username) {
		//接受读入的用户名
		this.username = username;
	}
	
	
	
	public boolean Judge(ArrayList<USER> ALLUSER) {
		//判断密码和账号是否符合
		ListIterator<USER> it1 = ALLUSER.listIterator();//在初始化ListIterator之前吧该add的add了，否则会引起modCount和expectModCount的不匹配而报错
		USER iTemp = new USER();
		while(it1.hasNext()) {
			index = it1.nextIndex();
			iTemp = (USER)it1.next();
			//对于比较，一定要用equals()!，不然会因为字符串地址不同而造成报错！
			if((iTemp.getUserName().equals(this.username))&&(iTemp.getPassWord().equals(this.password))) {
				//如果成功匹配
				admin = (iTemp.getAdmin() == true)?true:false;//判断是否为管理员，并赋值
				return true;//把值返回到menu菜单
			}	
		}
		System.out.println("账号或密码错误，请重试！");
		return false;
	}
	
	public String getUserName() {
		//用户名
		return this.username;
	}	
	
	
	public boolean getAdmin() {
		return this.admin;
	}

	
}
