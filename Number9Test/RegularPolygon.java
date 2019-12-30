
public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	
	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	RegularPolygon(int numbers,double sides){
		n = numbers;
		side = sides;
		x = 0;
		y = 0;
		
	}
	
	RegularPolygon(int numbers,double sides,double x0,double y0){
		n = numbers;
		side = sides;
		x= x0;
		y = y0;
	}
	
	double getPerimeter(){
		return n * side;
	}
	
	//访问数据
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public int getN() {
		return n;
	}
	
	public double getSide() {
		return side;
	}
	
	//修改数据
	
	public void newX(int x0) {
		x = x0;
	}
	
	public void newY(int y0) {
		y = y0;
	}
	
	public void newN(int numbers) {
		n = numbers;
	}
	
	public void newSide(int sides) {
		side = sides;
	}
	
	public double getArea() {
		return n * (side * side)/4*Math.tan(Math.PI/n);
	}
	
}
