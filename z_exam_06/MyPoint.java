package z_exam_06;

public class MyPoint {
	
	int x;
	int y;
	MyPoint (int x, int y){
		this.x = x;
		this.y = y;
	}
	public double getDistance(int x, int y) {
		return Math.sqrt((x ^ 2 - this.x ^ 2) + (y ^ 2 - this.y ^ 2));
	}
}
