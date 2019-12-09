package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
	
		/*
			<<정렬>>
		- 선택 정렬	 : 	첫번쨰 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리바꾸기를 반복해
					앞에서부터 작은 수를 채워 나가는 방식
		- 버블 정렬	 :	첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리바꾸기를 반복해
					뒤에서부터 큰 수를 채워나가는 방식
		- 삽입 정렬	 : 	두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 
					삽입하는 방식
		- 석차구하기 :	모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점숙다 작으면
					등수를 1씩 증가시키는 방식
		 */
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));
		
//		selectSort(numbers); //선택정렬
//		bubbleSort(numbers); //버블정렬
//		insertSort(numbers); //삽입정렬
		printRank(numbers);	//석차구하기
//		System.out.println(Arrays.toString(numbers));
	}

//			System.out.println(Arrays.toString(rank));
	//석차구하기
private static void printRank(int[] numbers) {
	//정수의 갯수만큼
	int[] rank = new int[numbers.length];
	//초기화는 1로 모두 등록		//정수만큼 배열이 필요
	for(int i = 0 ; i < numbers.length ; i++){
		rank[i] = 1;
	}

	for (int i = 0; i < numbers.length ; i++){
		for (int j = numbers.length - 1 ; j > i ; j--){
			if(numbers[i] > numbers[j]){
				rank[j]++; 
			}
			else if(numbers[i] < numbers[j]) {
				rank[i]++; 
			}	
		}
	}
	for (int i = 0; i < numbers.length ; i++){
		System.out.println("숫자 " + numbers[i] + " 은/는 " + rank[i] + "등 입니다.");
	}

		
		//등수를 저장할 배열 생성 여기에 1 채워넣기
		//나보다 더 좋은 점수를 만나면 +1등
	}


	//삽입정렬
/*	private static void insertSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1 ; i++){
			int temp = numbers[i + 1];
			if (numbers[i] > temp){
				temp = numbers[i + 1];
				numbers[i+1] = numbers[i];
				numbers[i] = temp;
				
			}
		}
	}*/

	//sem 답 : 삽입정렬 
	private static void insertSort(int[] numbers) {
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for (j = i - 1; j >= 0; j--){
				if(temp < numbers[j]){
					numbers[j + 1] = numbers[j];
				}else{
					break;
				}
			}
			numbers[j + 1] = temp;
		}	
	}

	//임시로 숫자를 저장
	
	//sem 답 (버블정렬):
/*	private static void bubbleSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++){
			boolean changed = false;						// ##for문 중간에 체크하고 싶을 때 boolean 을 사용
			for (int j = 0; j < numbers.length - i - 1; j++){
				if (numbers[j] > numbers[j + 1]){					
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					changed = true;
					System.out.println(Arrays.toString(numbers));
				}
			}
			if (!changed){
				break;
			}
		}
	}*/
	
	//내가 쓴 답
	private static void bubbleSort(int[] numbers) {
		for(int k = numbers.length - 1; k > 0 ; k--){
			for (int i = 0, j = i + 1; i < numbers.length - 1; i++, j++){
				if (numbers[i] > numbers[j]){					
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
					System.out.println(Arrays.toString(numbers));
				}
			}
		}
	}
	
	//선택정렬
	private static void selectSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1 ; i++){
			for (int j = i + 1; j < numbers.length ; j++){
				if (numbers[i] > numbers[j]){
					int temp   = numbers[i];		//temp에 0번째 수 저장
					numbers[i] = numbers[j];
					numbers[j] = temp;
					System.out.println(Arrays.toString(numbers));
				}
			}
		}	
	}
	
	private static void shuffle(int[] numbers) {
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random() * numbers.length);
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	}
}
