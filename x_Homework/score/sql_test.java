package x_Homework.score;

import java.util.ArrayList;
import java.util.List;



public class sql_test {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(25);
		intList.add(30);
		intList.add(35);
		intList.add(40);
		
		int sum1 = 0;
		int sum2 = 0;
		int dif = sum2 - sum1;
		
		for (int i = 0; i < intList.size() - 1; i++){
			sum1 += intList.get(i);
			sum2 += intList.get(i+1);
		}
		
		System.out.println(dif / (intList.size()-1));
		
	}
	
}
