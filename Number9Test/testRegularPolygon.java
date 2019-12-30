
public class testRegularPolygon {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RegularPolygon pattern = new RegularPolygon();
		System.out.println("无参构造方法：");
		System.out.println(" n = " + pattern.getN());
		System.out.println(" side = " + pattern.getSide());
		System.out.println(" x = " + pattern.getX());
		System.out.println(" y = " + pattern.getY());
		
		System.out.println();
		
		RegularPolygon pattern1 = new RegularPolygon(3,2);
		System.out.println("有边数和边长度构造方法：");
		System.out.println(" n = " + pattern1.getN());
		System.out.println(" side = " + pattern1.getSide());
		System.out.println(" x = " + pattern1.getX());
		System.out.println(" y = " + pattern1.getY());

		System.out.println();
		
		RegularPolygon pattern2 = new RegularPolygon(3,2,66,114514);
		System.out.println("有边数和边长度还有x和y构造方法：");
		System.out.println(" n = " + pattern2.getN());
		System.out.println(" side = " + pattern2.getSide());
		System.out.println(" x = " + pattern2.getX());
		System.out.println(" y = " + pattern2.getY());
		
		System.out.println();
		
		System.out.println("周长0：" + pattern.getPerimeter());
		System.out.println("周长1：" + pattern1.getPerimeter());
		System.out.println("周长2：" + pattern2.getPerimeter());
		
		System.out.println("面积0：" + pattern.getArea());
		System.out.println("面积1：" + pattern1.getArea());
		System.out.println("面积2：" + pattern2.getArea());
		
		System.out.println();
		//修改
		pattern.newN(9);
		pattern.newSide(6);
		pattern.newX(69);
		pattern.newY(112);
		
		
		System.out.println(" n = " + pattern.getN());
		System.out.println(" side = " + pattern.getSide());
		System.out.println(" x = " + pattern.getX());
		System.out.println(" y = " + pattern.getY());
		.
		System.out.println("周长0：" + pattern.getPerimeter());
		System.out.println("面积0：" + pattern.getArea());
		
		
	}

}
