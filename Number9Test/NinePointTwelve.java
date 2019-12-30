import java.util.Scanner;

public class NinePointTwelve {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double[] iTemp = new double[8];
		System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
		Scanner input = new Scanner(System.in);
		for(int i = 0;i < iTemp.length;i++)
			iTemp[i] = input.nextDouble();
		LinearEquation Equation = new LinearEquation(iTemp);
		System.out.println("The intersecting point is at ");
		Equation.result();
	}
	

}
