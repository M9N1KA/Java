package 第二章作业;

import java.util.Scanner;


public class TwoPointSix1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("Enter a number between 0 and 1000");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = (int)(a / 100)+ (int)(a / 10 %10) + (int)(a % 10);
		System.out.println("The sum of the digits is :" + b);
		input.close();
	}

}
