package 大作业;

public class Athletes {
	private String name;
	private String academy;
	private double grade;
	
	public Athletes() {
		// TODO 自动生成的构造函数存根
	}
	
	public Athletes(String name,String academy,double grade) {
		this.name = name;
		this.academy = academy;
		this.grade = grade;
	}
	
	public String getName() {
		//返回名字
		return name;
	}
	
	public String getAcademy() {
		//返回学院
		return academy;
	}
	
	public double getGrade() {
		//返回成绩
		return grade;
	}
	
	public void newName(String name) {
		//修改名字
		this.name = name;
	}
	
	public void newAcademy(String academy) {
		//修改学院
		this.academy = academy;
	}
	
	public void newGrade(double grade) {
		//修改成绩
		this.grade = grade;
	}
	
	
}
