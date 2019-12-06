package x_practice;

public class d_array_practice {

	public static void main(String[] args) {
		//Ex5
		//배열의 모든 요소를 더해 총합과 평균을 구한다.
		/*int sum = 0;
		float avg = 0;
		int[] score = {100, 88, 100, 100, 90};
		for (int i = 0; i < score.length ; i++){
			sum += score[i];
		}
		avg = (sum / (float)score.length);
		System.out.println("총합은 : " + sum);
		System.out.println("평균은 : " + avg);*/
		
		//Ex6
		//배열의 요소중에서 제일 큰 값과 제일 작은 값을 찾는다.
		/*
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		for (int i = 1 ; i < score.length ; i++ )
		{
			if 		(score[i] > max) max = score[i];
			else if (score[i] < min) min = score[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);	*/
		
		//Ex7
		//배열의 요소의 순서를 반복해서 바꾼다.
		int[] numArr = new int[10];
		for (int i = 0; i < numArr.length ; i++ ){
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
			System.out.println();
		for (int i = 0 ; i < numArr.length * 10; i++){
			int n = (int)(Math.random()* 10);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}
		for (int i = 0 ; i < numArr.length ; i++){
			System.out.print(numArr[i]);
		}
		
		//Ex8
		//배열의 요소의 순서를 반복해서 바꾼다.
		//1~45개의 숫자에서 랜덤으로 6개의 숫자를 뽑는 프로그램을 작성하세요. 
		int[] ball = new int [45];
		
		for(int i = 0; i < ball.length; i++){
			ball[i] = i + 1;
		}
		int tmp = 0;
		int j = 0;
		for (int i = 0; i < 6 ; i++){
			j = (int)(Math.random() * 45) + 1;
		}
		
		
		
		
	}
}
