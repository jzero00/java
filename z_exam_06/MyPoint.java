package z_exam_06;

public class MyPoint {
	
	int x;
	int y;
	MyPoint (int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x, int y) {
		return Math.sqrt((x - this.x) ^ 2 + (y- this.y) ^ 2);
	}
}
