
public class testRegularPolygon {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		RegularPolygon pattern = new RegularPolygon();
		System.out.println("�޲ι��췽����");
		System.out.println(" n = " + pattern.getN());
		System.out.println(" side = " + pattern.getSide());
		System.out.println(" x = " + pattern.getX());
		System.out.println(" y = " + pattern.getY());
		
		System.out.println();
		
		RegularPolygon pattern1 = new RegularPolygon(3,2);
		System.out.println("�б����ͱ߳��ȹ��췽����");
		System.out.println(" n = " + pattern1.getN());
		System.out.println(" side = " + pattern1.getSide());
		System.out.println(" x = " + pattern1.getX());
		System.out.println(" y = " + pattern1.getY());

		System.out.println();
		
		RegularPolygon pattern2 = new RegularPolygon(3,2,66,114514);
		System.out.println("�б����ͱ߳��Ȼ���x��y���췽����");
		System.out.println(" n = " + pattern2.getN());
		System.out.println(" side = " + pattern2.getSide());
		System.out.println(" x = " + pattern2.getX());
		System.out.println(" y = " + pattern2.getY());
		
		System.out.println();
		
		System.out.println("�ܳ�0��" + pattern.getPerimeter());
		System.out.println("�ܳ�1��" + pattern1.getPerimeter());
		System.out.println("�ܳ�2��" + pattern2.getPerimeter());
		
		System.out.println("���0��" + pattern.getArea());
		System.out.println("���1��" + pattern1.getArea());
		System.out.println("���2��" + pattern2.getArea());
		
		System.out.println();
		//�޸�
		pattern.newN(9);
		pattern.newSide(6);
		pattern.newX(69);
		pattern.newY(112);
		
		
		System.out.println(" n = " + pattern.getN());
		System.out.println(" side = " + pattern.getSide());
		System.out.println(" x = " + pattern.getX());
		System.out.println(" y = " + pattern.getY());
		.
		System.out.println("�ܳ�0��" + pattern.getPerimeter());
		System.out.println("���0��" + pattern.getArea());
		
		
	}

}
