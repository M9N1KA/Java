import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入学生个数：");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		System.out.println("请输入学生姓名：");
		input = new Scanner(System.in);
		String[] name = new String[size];
		for(int i = 0;i < size;i++)
			
			name[i] = input.next();
		System.out.println("请输入学生成绩");
		input = new Scanner(System.in);
		double[] score = new double[size];
		for(int i = 0;i < size;i++)
			score[i] = input.nextDouble();
		Listsort(score,name,size);
		System.out.println("姓名           成绩");
	    System.out.println("------------------");
		for(int i = 0;i < size;i++)
			System.out.print(name[i] + "\t" + score[i] +  "\n");
			
		
	}
	private static void Listsort(double[] result,String[] name,int length) {
		String tempname;
		double tempscore;
		for(int i = 0;i < length;i++) {
			for(int j = 0;j < length;j++) {
				if(result[i] > result[j]) {
					tempscore = result[i];
					result[i] = result[j];
					result[j] = tempscore;
					tempname = name[i];
					name[i] = name[j];
					name[j] = tempname;
				}
			}
		}
	}
	
	
//	private static void shellSort(int[] a) {
//		int n = a.length;
//		int i,j,k,gap;
//		for(gap = n/2;gap > 0;gap /= 2) {
//			for(i = 0;i < gap;i++) {
//				for(j = i + gap;j < n;j += gap) {
//					int temp = a[j];
//					for(k = j - gap;k >= 0 && a[k] > temp;k -=gap) {
//						a[k+gap] = a[k];
//					}
//					a[k+gap] = temp;
//				}
//			}
//		}
//	}
}
