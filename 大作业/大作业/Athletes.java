package ����ҵ;

public class Athletes {
	private String name;
	private String academy;
	private double grade;
	
	public Athletes() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public Athletes(String name,String academy,double grade) {
		this.name = name;
		this.academy = academy;
		this.grade = grade;
	}
	
	public String getName() {
		//��������
		return name;
	}
	
	public String getAcademy() {
		//����ѧԺ
		return academy;
	}
	
	public double getGrade() {
		//���سɼ�
		return grade;
	}
	
	public void newName(String name) {
		//�޸�����
		this.name = name;
	}
	
	public void newAcademy(String academy) {
		//�޸�ѧԺ
		this.academy = academy;
	}
	
	public void newGrade(double grade) {
		//�޸ĳɼ�
		this.grade = grade;
	}
	
	
}
