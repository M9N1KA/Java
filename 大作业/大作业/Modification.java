package ����ҵ;

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
//	//��дLogin�е�Judge�������ж��˺��Ƿ����
//	public boolean Judge(ArrayList<USER> ALLUSER) {
//		//�ж��˺��Ƿ����
//		ListIterator<USER> it1 = ALLUSER.listIterator();
//		USER iTemp = new USER();
//		super.NewUserName(scan.next());
//		while(it1.hasNext()) {
//			index = it1.nextIndex();
//			iTemp = (USER)it1.next();
//			if((iTemp.getUserName().equals(super.getUserName()))) {//���ø��෽���Ի�ȡ���������û���
//				//����ɹ�ƥ��
//				System.out.println("��Ҫ�������û���"+iTemp.getUserName());
//				return true;//��ֵ���ص�menu�˵�
//			}	
//		}
//		System.out.println("���޴���");
//		return false;
//	}
	
	public void ChangePassword(USER iTemp,String password) {
		//�޸ĵ�����ķ���
		System.out.println("�������µ�����");
		password = scan.next();
		System.out.println("���ٴ������µ�����");
		while(!password.equals(scan.next())) {
			System.out.println("������������벻һ�£������������µ�����");
			password = scan.next();
			System.out.println("���ٴ������µ�����");
		}
		iTemp.newPassWord(password);
		System.out.println("�޸�����ɹ���");
	}
	
	public void ChangeTelephone(USER iTemp) {
		//�޸ĵ绰����ķ���
		System.out.println("�������µĵ绰����");
		iTemp.newTelePhone(scan.next());
		System.out.println("�޸ĳɹ������ĵ绰���������ǣ�"+ iTemp.getTelephone());
	}
	
//	public void ChangeAccess(USER iTemp) {
//		//�޸�Ȩ�޵ķ���
//		String choose = null;
//		System.out.println("�Ƿ�����û�Ϊ����Ա��\n"
//				+"Y��������������\n"
//				+"N��������������");
//		choose = scan.next();
//		if("Y".equals(choose))
//			iTemp.Access(true);
//		else if("N".equals(choose))
//			iTemp.Access(false);
//		else {
//			while(!("Y".equals(choose))&&!("N".equals(choose))) {
//				System.out.println("����������������룡\n"
//						+ "�Ƿ�����û�Ϊ����Ա��\n"
//						+"Y��������������\n"
//						+"N��������������");
//				choose = scan.next();
//				if("Y".equals(choose))
//					iTemp.Access(true);
//				else if("Y".equals(choose))
//					iTemp.Access(false);
//			}
//		}
//	}
	
//	public void adminchange(ArrayList<USER> ALLUSER,int input) {
//		//����Աר�������޸��û����ݵķ���
//		USER iTemp = new USER();//����һ����ʱ���࣬���ڴ���޸ĵ�ֵ
//		iTemp = ALLUSER.get(index);
//		String password = null;//�������е�����
//		switch(input) {
//			case 1:{
//				//�޸��û���
//				System.out.println("�������µ��û���");
//				iTemp.newUserName(scan.next());//
//				break;
//			}
//			case 2:{
//				//�޸�����
//				ChangePassword(iTemp,password);
//				break;
//			}
//			case 3:{
//				//�޸ĵ绰����
//				ChangeTelephone(iTemp);
//				break;
//			}
//			case 4:{
//				//�޸�Ȩ��
//				ChangeAccess(iTemp);
//				break;
//			}
//		}
//		ALLUSER.set(index, iTemp);//����set�ķ�����iTemp�滻ALLUSER�е�Ԫ��
//	}
	
//	public void adminadd(ArrayList<USER> ALLUSER) {
//		//���ڹ���Ա����û�
//		USER iTemp = new USER();
//		System.out.println("���������û���id");
//		iTemp.newUserName(scan.next());
//		System.out.println("���������û�������");
//		iTemp.newPassWord(scan.next());
//		System.out.println("���������û��ĵ绰");
//		iTemp.newTelePhone(scan.next());
//		ChangeAccess(iTemp);
//		ALLUSER.add(iTemp);//��iTemp��ӽ���ALLUSER
//		System.out.println("��ӳɹ���");
//	}
	
	
	public void useralter(ArrayList<USER>ALLUSER,int index,int returnchoose) {
		//�����û������޸�����͵绰�ķ���,returnchoose����MENU�ж��Ƿ�Ϊ���ع���
		USER iTemp = new USER();
		String password = null;
		iTemp = ALLUSER.get(index);
		switch(scan.nextInt()) {
			case 1:{
				//�޸�����
				ChangePassword(iTemp,password);
				break;
			}
			case 2:{
				//�޸ĵ绰����
				ChangeTelephone(iTemp);
				break;
			}
			case 0:{
				//���ع���
				returnchoose = 1;
				return;
			}
		}
		returnchoose = 0;
		ALLUSER.set(index, iTemp);
	}

	/* �޸�Athletes �����Ϣ*/

	public boolean Athletesjudge(ArrayList<Athletes> aLLAthletes) {
		//�ж��˺��Ƿ����ALLATHLETES
		ListIterator<Athletes> it1 = aLLAthletes.listIterator();
		Athletes iTemp = new Athletes();
		super.NewUserName(scan.next());
		while(it1.hasNext()) {
			index = it1.nextIndex();
			iTemp = (Athletes)it1.next();
			if((iTemp.getName().equals(super.getUserName()))) {//���ø��෽���Ի�ȡ���������û���
				//����ɹ�ƥ��
				System.out.println("��Ҫ�������˶�Ա��"+iTemp.getName());
				return true;//��ֵ���ص�menu�˵�
			}	
		}
		System.out.println("���޴���");
		return false;
	}
	
	public void adminadd(ArrayList<Athletes> allAthletes) {
		//���ڹ���Ա����û�
		Athletes iTemp = new Athletes();
		System.out.println("���������˶�Ա��id");
		iTemp.newName(scan.next());
		System.out.println("���������˶�Ա��ѧԺ");
		iTemp.newAcademy(scan.next());
		System.out.println("���������˶�Ա�ĳɼ�");
		iTemp.newGrade(scan.nextDouble());
		allAthletes.add(iTemp);//��iTemp��ӽ���ALLATHLETES
		System.out.println("��ӳɹ���");
	}
	
	public void adminchange(ArrayList<Athletes> alAthletes,int input) {
		//����Աר�������޸��û����ݵķ���
		Athletes iTemp = new Athletes();//����һ����ʱ���࣬���ڴ���޸ĵ�ֵ
		iTemp = alAthletes.get(index);
		switch(input) {
			case 1:{
				//�޸��û���
				System.out.println("�������µ��û���");
				iTemp.newName(scan.next());//
				break;
			}
			case 2:{
				//�޸�ѧԺ
				System.out.println("������ѧԺ");
				iTemp.newAcademy(scan.next());
				break;
			}
			case 3:{
				//�޸ĳɼ�
				System.out.println("������ɼ�");
				iTemp.newGrade(scan.nextDouble());
				break;
			}
			case 4:{
				System.out.println("ɾ��"+iTemp.getName());
				alAthletes.remove(index);
				return;
			}
		}
		alAthletes.set(index, iTemp);//����set�ķ�����iTemp�滻ALLUSER�е�Ԫ��
	}

}