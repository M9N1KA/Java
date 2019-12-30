package 大作业;

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
			System.out.println(numbers + "、运动员姓名:"+iTemp.getName() +
							" 学院：" + iTemp.getAcademy() + " 成绩：" + iTemp.getGrade());
			
		}
		System.out.println("共找到"+numbers+"名运动员");
	}
	
}
