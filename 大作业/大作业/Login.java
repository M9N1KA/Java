package ����ҵ;

import java.util.ArrayList;
import java.util.ListIterator;

public class Login{

	//��������¼�ж�
	private String password;
	private String username;
	private boolean admin = true;
	int index;
	
	Login(){}
	
	public void NewPassWord(String password) {
		//��Ϊ����Ļ����������ܶ��������
		this.password = password;
	}
	
	public void NewUserName(String username) {
		//���ܶ�����û���
		this.username = username;
	}
	
	
	
	public boolean Judge(ArrayList<USER> ALLUSER) {
		//�ж�������˺��Ƿ����
		ListIterator<USER> it1 = ALLUSER.listIterator();//�ڳ�ʼ��ListIterator֮ǰ�ɸ�add��add�ˣ����������modCount��expectModCount�Ĳ�ƥ�������
		USER iTemp = new USER();
		while(it1.hasNext()) {
			index = it1.nextIndex();
			iTemp = (USER)it1.next();
			//���ڱȽϣ�һ��Ҫ��equals()!����Ȼ����Ϊ�ַ�����ַ��ͬ����ɱ���
			if((iTemp.getUserName().equals(this.username))&&(iTemp.getPassWord().equals(this.password))) {
				//����ɹ�ƥ��
				admin = (iTemp.getAdmin() == true)?true:false;//�ж��Ƿ�Ϊ����Ա������ֵ
				return true;//��ֵ���ص�menu�˵�
			}	
		}
		System.out.println("�˺Ż�������������ԣ�");
		return false;
	}
	
	public String getUserName() {
		//�û���
		return this.username;
	}	
	
	
	public boolean getAdmin() {
		return this.admin;
	}

	
}
