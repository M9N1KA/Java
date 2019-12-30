package Ê®Ò»ÕÂ;

import java.util.ArrayList;
import java.util.Scanner;


public class Plus {
	
	void main() {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		ArrayList<Integer> anwsers = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " " + number2 + "?" );
		int answer = input.nextInt();
		
		if(anwsers.contains(anwsers))
			System.out.println("You have already anwser " + answer);
		
		while(number1 + number2 != answer) {
			System.out.println("Wrong answer.Try again.What is"+ 
					number1 + " " + number2 + "?" );
			
			anwsers.add(answer);
			
			answer = input.nextInt();
			
		}
		System.out.println("You got it!");
	}
	
}
