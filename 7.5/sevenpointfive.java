/*
 * �̲ģ�������ϰ7.5��ӡ��ͬ����
 * Aurther:FTR
 * Time: 2019-10-8

*/
import java.util.Scanner;

public class sevenpointfive {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int iTemp = 0;//��ʱֵ���������뻺��������һ��ֵ�����ڱȽϺ͸�ֵ
		boolean iTurns = true;//�����Ƿ���ͬ���ж�
		System.out.println("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		for(int i = 0;i < 10;i++) {
			iTurns = true;
			iTemp = input.nextInt();
			for(int j = 0;j < i;j++) {
				if(iTemp == numbers[j]) {//�ж��뵽i֮ǰ��Ԫ���Ƿ���ͬ
					iTurns = false;
					break;		
				}	
			}
			if(iTurns == true)
				numbers[i] = iTemp;//��ֵ���µ�Ԫ��
		}
		for(int i = 0;i < 10;i++) {//�������0��ֵ����Ϊ����Ԫ�ز���ֵĬ��Ϊ0
			if(numbers[i] != 0)
			System.out.print(numbers[i]+ " ");
		}
		
	}

}
