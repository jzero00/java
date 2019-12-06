package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * <<다차원 배열>>
		 * - 배열 안에 배열이 저장되어 있는 형태이다.
		 */
		
		int[][] numbers = new int[2][3];
		int numbers2[][] = new int [][]{{1, 2, 3}, {4, 5, 6}};
		int[] numbers3[] = { {1, 2, 3}
							,{4, 5, 6}
							,{7, 8, 9} };
		
		//[]위치는 중요하지 않음. 보통 타입 뒤에 붙여줌
		
		int [][] numbers4 = new int [3][]; //가변 배열
		numbers[0] = new int[3];
		numbers[1] = new int[4];
//		numbers[2] = new int[10];		   //크기를 다르게 지정할 수 있다.
		
//		numbers[0] = 10;				   //1차원에 값을 저장할 수 없다.
		numbers[0] = new int [5]; 		   //1차원에 배열을 저장할 수 있다.
		numbers[0][0] = 10;				   //2차원에 값을 저장할 수 있다.
		numbers[1][0] = 20;
		numbers[0][1] = 100;
		
		System.out.println(numbers.length);//1차원 배열의 길이
		System.out.println(numbers[0].length);//2차원 배열의 길이
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));
		}
		
		int[][] scores = new int[3][5];
		/*
		 * {{1, 2, 3, 4, 5},
		 * {1, 2, 3, 4, 5} ,
		 * {1, 2, 3, 4, 5}}
		 * scores [1][3]
		 * sum : {300, 400 ,500}
		 * avg : {50, 70, 90}
		 */
		
		int[] sum = new int[scores.length];			//합계
		double[] avg = new double[scores.length]; 	//평균
		
		for (int i = 0 ; i < scores.length; i++){
			for(int j = 0 ; j < scores[i].length; j++){
				scores [i][j]= (int)(Math.random()*100 + 1);				
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//총점과 평균을 구해주세요
		for (int i = 0 ; i < scores.length; i++){
			for(int j = 0 ; j < scores[i].length; j++){
				sum[i] += scores[i][j];
			}
			avg [i] = (double)sum[i] / scores[i].length;
			System.out.println(i + "의 총점 : " + sum[i] + " / 평균 : " + avg[i]);
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
