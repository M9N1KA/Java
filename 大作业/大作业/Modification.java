package 大作业;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Modification extends Login{
	
	private int index;
	Scanner scan = new Scanner(System.in);
	
	Modification(){
		
	}
	
//	
//	@Override
//	//重写Login中的Judge方法，判断账号是否符合
//	public boolean Judge(ArrayList<USER> ALLUSER) {
//		//判断账号是否符合
//		ListIterator<USER> it1 = ALLUSER.listIterator();
//		USER iTemp = new USER();
//		super.NewUserName(scan.next());
//		while(it1.hasNext()) {
//			index = it1.nextIndex();
//			iTemp = (USER)it1.next();
//			if((iTemp.getUserName().equals(super.getUserName()))) {//调用父类方法以获取缓存区中用户名
//				//如果成功匹配
//				System.out.println("你要操作的用户是"+iTemp.getUserName());
//				return true;//把值返回到menu菜单
//			}	
//		}
//		System.out.println("查无此人");
//		return false;
//	}
	
	public void ChangePassword(USER iTemp,String password) {
		//修改的密码的方法
		System.out.println("请输入新的密码");
		password = scan.next();
		System.out.println("请再次输入新的密码");
		while(!password.equals(scan.next())) {
			System.out.println("两次输入的密码不一致！请重新输入新的密码");
			password = scan.next();
			System.out.println("请再次输入新的密码");
		}
		iTemp.newPassWord(password);
		System.out.println("修改密码成功！");
	}
	
	public void ChangeTelephone(USER iTemp) {
		//修改电话号码的方法
		System.out.println("请输入新的电话号码");
		iTemp.newTelePhone(scan.next());
		System.out.println("修改成功！您的电话号码现在是："+ iTemp.getTelephone());
	}
	
//	public void ChangeAccess(USER iTemp) {
//		//修改权限的方法
//		String choose = null;
//		System.out.println("是否设该用户为管理员？\n"
//				+"Y——————是\n"
//				+"N——————否");
//		choose = scan.next();
//		if("Y".equals(choose))
//			iTemp.Access(true);
//		else if("N".equals(choose))
//			iTemp.Access(false);
//		else {
//			while(!("Y".equals(choose))&&!("N".equals(choose))) {
//				System.out.println("输入错误！请重新输入！\n"
//						+ "是否设该用户为管理员？\n"
//						+"Y——————是\n"
//						+"N——————否");
//				choose = scan.next();
//				if("Y".equals(choose))
//					iTemp.Access(true);
//				else if("Y".equals(choose))
//					iTemp.Access(false);
//			}
//		}
//	}
	
//	public void adminchange(ArrayList<USER> ALLUSER,int input) {
//		//管理员专门用来修改用户数据的方法
//		USER iTemp = new USER();//创建一个临时的类，用于存放修改的值
//		iTemp = ALLUSER.get(index);
//		String password = null;//缓存区中的密码
//		switch(input) {
//			case 1:{
//				//修改用户名
//				System.out.println("请输入新的用户名");
//				iTemp.newUserName(scan.next());//
//				break;
//			}
//			case 2:{
//				//修改密码
//				ChangePassword(iTemp,password);
//				break;
//			}
//			case 3:{
//				//修改电话号码
//				ChangeTelephone(iTemp);
//				break;
//			}
//			case 4:{
//				//修改权限
//				ChangeAccess(iTemp);
//				break;
//			}
//		}
//		ALLUSER.set(index, iTemp);//运用set的方法将iTemp替换ALLUSER中的元素
//	}
	
//	public void adminadd(ArrayList<USER> ALLUSER) {
//		//用于管理员添加用户
//		USER iTemp = new USER();
//		System.out.println("请输入新用户的id");
//		iTemp.newUserName(scan.next());
//		System.out.println("请输入新用户的密码");
//		iTemp.newPassWord(scan.next());
//		System.out.println("请输入新用户的电话");
//		iTemp.newTelePhone(scan.next());
//		ChangeAccess(iTemp);
//		ALLUSER.add(iTemp);//将iTemp添加进入ALLUSER
//		System.out.println("添加成功！");
//	}
	
	
	public void useralter(ArrayList<USER>ALLUSER,int index,int returnchoose) {
		//用于用户自行修改密码和电话的方法,returnchoose用于MENU判断是否为返回功能
		USER iTemp = new USER();
		String password = null;
		iTemp = ALLUSER.get(index);
		switch(scan.nextInt()) {
			case 1:{
				//修改密码
				ChangePassword(iTemp,password);
				break;
			}
			case 2:{
				//修改电话号码
				ChangeTelephone(iTemp);
				break;
			}
			case 0:{
				//返回功能
				returnchoose = 1;
				return;
			}
		}
		returnchoose = 0;
		ALLUSER.set(index, iTemp);
	}

	/* 修改Athletes 相关信息*/

	public boolean Athletesjudge(ArrayList<Athletes> aLLAthletes) {
		//判断账号是否符合ALLATHLETES
		ListIterator<Athletes> it1 = aLLAthletes.listIterator();
		Athletes iTemp = new Athletes();
		super.NewUserName(scan.next());
		while(it1.hasNext()) {
			index = it1.nextIndex();
			iTemp = (Athletes)it1.next();
			if((iTemp.getName().equals(super.getUserName()))) {//调用父类方法以获取缓存区中用户名
				//如果成功匹配
				System.out.println("你要操作的运动员是"+iTemp.getName());
				return true;//把值返回到menu菜单
			}	
		}
		System.out.println("查无此人");
		return false;
	}
	
	public void adminadd(ArrayList<Athletes> allAthletes) {
		//用于管理员添加用户
		Athletes iTemp = new Athletes();
		System.out.println("请输入新运动员的id");
		iTemp.newName(scan.next());
		System.out.println("请输入新运动员的学院");
		iTemp.newAcademy(scan.next());
		System.out.println("请输入新运动员的成绩");
		iTemp.newGrade(scan.nextDouble());
		allAthletes.add(iTemp);//将iTemp添加进入ALLATHLETES
		System.out.println("添加成功！");
	}
	
	public void adminchange(ArrayList<Athletes> alAthletes,int input) {
		//管理员专门用来修改用户数据的方法
		Athletes iTemp = new Athletes();//创建一个临时的类，用于存放修改的值
		iTemp = alAthletes.get(index);
		switch(input) {
			case 1:{
				//修改用户名
				System.out.println("请输入新的用户名");
				iTemp.newName(scan.next());//
				break;
			}
			case 2:{
				//修改学院
				System.out.println("请输入学院");
				iTemp.newAcademy(scan.next());
				break;
			}
			case 3:{
				//修改成绩
				System.out.println("请输入成绩");
				iTemp.newGrade(scan.nextDouble());
				break;
			}
			case 4:{
				System.out.println("删除"+iTemp.getName());
				alAthletes.remove(index);
				return;
			}
		}
		alAthletes.set(index, iTemp);//运用set的方法将iTemp替换ALLUSER中的元素
	}

}