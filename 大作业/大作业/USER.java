package 大作业;

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
		//获取用户名(用于验证）
		return USERNAME;
	}
	
	public String getPassWord() {
		//获取密码（用于验证）（必须只有管理员才能使用该功能）
		return PASSWORD;
	}
	
	public String getTelephone() {
		return TELEPHONE;
	}
	
	public boolean getAdmin() {
		//获取管理员状态（权限）
		return ADMINISTRATOR;
	}
	
	public void newUserName(String username) {
		//修改用户名
		this.USERNAME = username;
	}
	
	public void newPassWord(String password) {
		//修改密码
		this.PASSWORD = password;
	}
	
	public void newTelePhone(String number) {
		//修改电话
		this.TELEPHONE = number;
	}
	
	public void Access(boolean order) {
		//修改权限
		this.ADMINISTRATOR = order;
	}
}
