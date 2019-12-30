package 大作业;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		ArrayList<USER> ALLUSER = new ArrayList<>();
		ArrayList<Athletes> ALLATHLETES = new ArrayList<>();
		Login login = new Login();
		Modification alter = new Modification();
		Check checked = new Check();
		int iTemp,returnchoose = 0;
		Scanner input = new Scanner(System.in);
		
		
		
		ALLUSER.add(new USER("wwwftrcom","111111","18078145611",true));
		ALLUSER.add(new USER("monika","7355608","666666",false));
		
		ALLATHLETES.add(new Athletes("Tom","国服",77.5));
		ALLATHLETES.add(new Athletes("Bob","经管",66.5));
		ALLATHLETES.add(new Athletes("sb","国服",99));
		ALLATHLETES.add(new Athletes("huhaoyu","人文",123.5));
		
		
		
		
		System.out.println("请输入你的账号：");
		login.NewUserName(input.next());
		System.out.println("请输入宁的密码：");
		login.NewPassWord(input.next());
		while(!login.Judge(ALLUSER)) {
			//当判断失败时，重复执行
			System.out.println("请输入你的账号：");
			login.NewUserName(input.next());
			System.out.println("请输入宁的密码：");
			login.NewPassWord(input.next());
		}
		System.out.println("欢迎！" + login.getUserName());

		if(login.getAdmin() == true) {
			//管理员欢迎菜单
			System.out.println("\n你是管理员，可以对ALLAthlets进行修改操作\n"
					+"请输入数字选择功能：\n"
					+"1————————修改单个运动员的信息\n"
					+"2————————添加运动员\n"
					+"3————————查看所有运动员信息\n"
					+"0————————返回");//goto?
			iTemp = input.nextInt();
			while(iTemp != 0) {
				switch(iTemp) {
					case 1:{
						System.out.println("请输入要操作的用户id");
						while(!alter.Athletesjudge(ALLATHLETES)) {
							System.out.println("请重新输入要操作的运动员id");
						}
						System.out.println("\n请输入数字选择功能\n"
								+"1————————修改账号\n"
								+"2————————修改学院\n"
								+"3————————修改成绩\n"
								+"4————————删除运动员\n"
								+"0————————返回");
						alter.adminchange(ALLATHLETES,input.nextInt());
						break;
						}
					case 2:{
						System.out.println("添加运动员");
						alter.adminadd(ALLATHLETES);
						break;
					}
					case 3:{
						//查看用户
						checked.AdminCheck(ALLATHLETES);
						break;
					}
				}
				System.out.println("\n你是管理员，可以对ALLUSER进行修改操作\n"
						+"请输入数字选择功能：\n"
						+"1————————修改单个运动员的信息\n"
						+"2————————添加运动员\n"
						+"3————————查看所有运动员信息\n"
						+"0————————返回");
				iTemp = input.nextInt();
			}
		}
		else{
			//普通用户欢迎菜单
			System.out.println("你是普通用户，只能修改自己的密码和电话\n"
					+ "请输入数字选择功能\n"
					+ "1————————修改密码\n"
					+ "2————————修改电话\n"
					+ "0————————返回");
			alter.useralter(ALLUSER,login.index,returnchoose);//用于给普通用户修改
			while (returnchoose == 0) {
				System.out.println("请输入数字选择功能\n"
						+ "1————————修改密码\n"
						+ "2————————修改电话\n"
						+ "0————————返回");
				alter.useralter(ALLUSER,login.index,returnchoose);//重新调用普通用户修改方法
				
			}
		}
		input.close();
	}
}
