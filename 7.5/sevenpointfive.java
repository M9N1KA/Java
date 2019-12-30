/*
 * 教材，数组练习7.5打印不同的树
 * Aurther:FTR
 * Time: 2019-10-8

*/
import java.util.Scanner;

public class sevenpointfive {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int iTemp = 0;//临时值：来自输入缓冲区的下一个值，用于比较和赋值
		boolean iTurns = true;//两数是否相同的判断
		System.out.println("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		for(int i = 0;i < 10;i++) {
			iTurns = true;
			iTemp = input.nextInt();
			for(int j = 0;j < i;j++) {
				if(iTemp == numbers[j]) {//判断与到i之前的元素是否相同
					iTurns = false;
					break;		
				}	
			}
			if(iTurns == true)
				numbers[i] = iTemp;//赋值给新的元素
		}
		for(int i = 0;i < 10;i++) {//输出不带0的值，因为数组元素不赋值默认为0
			if(numbers[i] != 0)
			System.out.print(numbers[i]+ " ");
		}
		
	}

}
