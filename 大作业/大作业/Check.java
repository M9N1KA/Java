package ����ҵ;

import java.util.ArrayList;
import java.util.ListIterator;

public class Check {
	Check(){
		
	}
	
	public void AdminCheck(ArrayList<Athletes> aLLAthletes) {
		ListIterator<Athletes> it2 = aLLAthletes.listIterator();
		Athletes iTemp = new Athletes();
		int numbers = 0;
		while(it2.hasNext()) {
			numbers++;
			iTemp = (Athletes)it2.next();
			System.out.println(numbers + "���˶�Ա����:"+iTemp.getName() +
							" ѧԺ��" + iTemp.getAcademy() + " �ɼ���" + iTemp.getGrade());
			
		}
		System.out.println("���ҵ�"+numbers+"���˶�Ա");
	}
	
}
