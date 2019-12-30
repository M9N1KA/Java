package 第三章作业;

import java.util.Scanner;

public class ThreePointFifteen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Generate a lottery number
        int lottery = (int) (Math.random() * 1000);
        //Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits):");
        int guess = input.nextInt();
        //Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;
        //Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess % 100 / 10;
        int guessDigit3 = guess % 10;
        System.out.println("The lottery number is " + lottery);
        //Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $10000");
        } else if (((guessDigit1 == lotteryDigit1) && (guessDigit2 == lotteryDigit3)
                && (guessDigit3 == lotteryDigit2)) || ((guessDigit1 == lotteryDigit2) && (
                guessDigit2 == lotteryDigit3) && (guessDigit3 == lotteryDigit1)) ||
                ((guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit3)) ||
                ((guessDigit1 == lotteryDigit3) && (guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit2)) ||
                ((guessDigit1 == lotteryDigit3) && (guessDigit2 == lotteryDigit2) && (guessDigit3 == lotteryDigit1))) {
            System.out.println("Match all digits: you win $3000");
        } else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3) ||
                (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3) ||
                (guessDigit3 == lotteryDigit3)) {
            System.out.println("Match one digits: you win $1000");
        } else {
            System.out.println("Sorry, no match");
        }

	}

}
