package 第二章作业;

import java.util.Scanner;


public class TwoPointThirteen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ThemeReader monthly saving amount");
		double qianshu = input.nextDouble();
		double m1 = qianshu * (1 + 0.00417);
		double m2 = (qianshu + m1) * (1 + 0.00417);
		double m3 = (qianshu + m2) * 1.00417;
		double m4 = (qianshu + m3) * 1.00417;
		double m5 = (qianshu + m4) * 1.00417;
		double m6 = (qianshu + m5) * 1.00417;
		input.close();
		
		System.out.println("After the sixth month,the account value is %"+ m6);
	}

}
