package ����ҵ;

public class USER {
	private String USERNAME;
	private String PASSWORD;
	private String TELEPHONE;
	private boolean ADMINISTRATOR;
	
	USER(){
		
	}

	USER(String USERNAME,String PASSWORD,String TELEPHONE,boolean ADMINISTRATOR){
			this.USERNAME = USERNAME;
			this.PASSWORD = PASSWORD;
			this.TELEPHONE = TELEPHONE;
			this.ADMINISTRATOR = ADMINISTRATOR;
	}
	
	
	public String getUserName() {
		//��ȡ�û���(������֤��
		return USERNAME;
	}
	
	public String getPassWord() {
		//��ȡ���루������֤��������ֻ�й���Ա����ʹ�øù��ܣ�
		return PASSWORD;
	}
	
	public String getTelephone() {
		return TELEPHONE;
	}
	
	public boolean getAdmin() {
		//��ȡ����Ա״̬��Ȩ�ޣ�
		return ADMINISTRATOR;
	}
	
	public void newUserName(String username) {
		//�޸��û���
		this.USERNAME = username;
	}
	
	public void newPassWord(String password) {
		//�޸�����
		this.PASSWORD = password;
	}
	
	public void newTelePhone(String number) {
		//�޸ĵ绰
		this.TELEPHONE = number;
	}
	
	public void Access(boolean order) {
		//�޸�Ȩ��
		this.ADMINISTRATOR = order;
	}
}
