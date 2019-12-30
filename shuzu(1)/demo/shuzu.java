package demo;

import java.util.Scanner;

public class demotest {

	public static void main(String[] args) {
		System.out.println("请输入数组大小：");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		double[] number = new double[size];
		for(int i = 0;i < number.length;i++) {
			number[i] = Math.random()*10;
		}
		for(int i = 0;i < number.length;i++)
			System.out.println(number[i]);
		int j;
		for(int i = number.length-1;i > 0;i--) {
			 j = (int)(Math.random()*(i + 1));
			 double temp = number[i];
			 number[i] = number[j];
			 number[j] = temp;
		}
		System.out.println();
		for(int i = 0;i < number.length;i++)
			System.out.println(number[i]);
	}
}
