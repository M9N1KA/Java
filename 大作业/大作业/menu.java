package ����ҵ;

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
		
		ALLATHLETES.add(new Athletes("Tom","����",77.5));
		ALLATHLETES.add(new Athletes("Bob","����",66.5));
		ALLATHLETES.add(new Athletes("sb","����",99));
		ALLATHLETES.add(new Athletes("huhaoyu","����",123.5));
		
		
		
		
		System.out.println("����������˺ţ�");
		login.NewUserName(input.next());
		System.out.println("�������������룺");
		login.NewPassWord(input.next());
		while(!login.Judge(ALLUSER)) {
			//���ж�ʧ��ʱ���ظ�ִ��
			System.out.println("����������˺ţ�");
			login.NewUserName(input.next());
			System.out.println("�������������룺");
			login.NewPassWord(input.next());
		}
		System.out.println("��ӭ��" + login.getUserName());

		if(login.getAdmin() == true) {
			//����Ա��ӭ�˵�
			System.out.println("\n���ǹ���Ա�����Զ�ALLAthlets�����޸Ĳ���\n"
					+"����������ѡ���ܣ�\n"
					+"1�����������������޸ĵ����˶�Ա����Ϣ\n"
					+"2��������������������˶�Ա\n"
					+"3�����������������鿴�����˶�Ա��Ϣ\n"
					+"0��������������������");//goto?
			iTemp = input.nextInt();
			while(iTemp != 0) {
				switch(iTemp) {
					case 1:{
						System.out.println("������Ҫ�������û�id");
						while(!alter.Athletesjudge(ALLATHLETES)) {
							System.out.println("����������Ҫ�������˶�Աid");
						}
						System.out.println("\n����������ѡ����\n"
								+"1�����������������޸��˺�\n"
								+"2�����������������޸�ѧԺ\n"
								+"3�����������������޸ĳɼ�\n"
								+"4����������������ɾ���˶�Ա\n"
								+"0��������������������");
						alter.adminchange(ALLATHLETES,input.nextInt());
						break;
						}
					case 2:{
						System.out.println("����˶�Ա");
						alter.adminadd(ALLATHLETES);
						break;
					}
					case 3:{
						//�鿴�û�
						checked.AdminCheck(ALLATHLETES);
						break;
					}
				}
				System.out.println("\n���ǹ���Ա�����Զ�ALLUSER�����޸Ĳ���\n"
						+"����������ѡ���ܣ�\n"
						+"1�����������������޸ĵ����˶�Ա����Ϣ\n"
						+"2��������������������˶�Ա\n"
						+"3�����������������鿴�����˶�Ա��Ϣ\n"
						+"0��������������������");
				iTemp = input.nextInt();
			}
		}
		else{
			//��ͨ�û���ӭ�˵�
			System.out.println("������ͨ�û���ֻ���޸��Լ�������͵绰\n"
					+ "����������ѡ����\n"
					+ "1�����������������޸�����\n"
					+ "2�����������������޸ĵ绰\n"
					+ "0��������������������");
			alter.useralter(ALLUSER,login.index,returnchoose);//���ڸ���ͨ�û��޸�
			while (returnchoose == 0) {
				System.out.println("����������ѡ����\n"
						+ "1�����������������޸�����\n"
						+ "2�����������������޸ĵ绰\n"
						+ "0��������������������");
				alter.useralter(ALLUSER,login.index,returnchoose);//���µ�����ͨ�û��޸ķ���
				
			}
		}
		input.close();
	}
}
