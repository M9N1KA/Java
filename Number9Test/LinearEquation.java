
public class LinearEquation {
	public double a,b,c,d,e,f,x,y;
	
	LinearEquation(double temp[]){
		a = temp[1] - temp[3];
		b = temp[0] - temp[2];
		c = temp[5] - temp[7];
		d = temp[4] - temp[6];
		e = (temp[1] - temp[2]) * temp[0] - (temp[0]- temp[1]) * temp[1];
		f = (temp[5] - temp[7]) * temp[4] - (temp[4] - temp[6]) * temp[5];
	}
	public void result() {
		x = (e * d - b * f) / (a * d - b * c );
		y = (a * f - e * c) / (a * d - b * c );
		System.out.print("(" + x + "," + y + ")");
	}
	
}
