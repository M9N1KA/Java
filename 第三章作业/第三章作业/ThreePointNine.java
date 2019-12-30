package 第三章作业;

import java.util.Scanner;

public class ThreePointNine {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Scanner scanner=new Scanner(System.in);
	        int sum=0,num=1;
	        System.out.print("Enter the first 9 digits of an ISBN as integer:");
	        String isbn=scanner.next();
	        for(int i=0;i<9;i++){
	            int j=isbn.charAt(i)-'0';
	            sum+=j*num++;
	        }
	        System.out.println("The ISBN-10 number is "+(((sum%11)==10)?(isbn+"X"):(isbn+(sum%11))));
	}

}
