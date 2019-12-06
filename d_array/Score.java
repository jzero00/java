package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {

		/* 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차 순으로 석차, 이름, 과목별 점수, 총점 평균을 출력해주세요.
		 * 
		 * 순위	이름		Java	Oracle		HTML	CSS		Jquery	JSP	총점	평균
		 * 1	홍길동	90		100			80		50		30		90	400	70
		 * 2	홍길동	90		100			80		50		30		90	400	70
		 * 3	홍길동	90		100			80		50		30		90	400	70
		 * 4	홍길동	90		100			80		50		30		90	400	70
		 * 5	홍길동	90		100			80		50		30		90	400	70
		 */

		String[] names = {"김지선", "이누리", "박종민", "정대석", "정재영", "강현철", "주향한", "윤창훈", "연은주",
				"김령환", "구한나", "백종빈", "이병훈", "강현지", "김경운", "이지형", "이예림", "이승재", "민태홍", "정보람", "박진영"};
		String[] subjects = {"Java" , "Oracle", "HTML", "CSS", "JQuery", "JSP"};
		int[][] scores = new int[names.length][subjects.length];		//순위와 과목 성적 2차원배열
		int[] sum = new int[scores.length];				//과목 총합
		double[] avg = new double[scores.length];		//과목 평균

		System.out.print("석차 \t이름 \t");
		for(int i = 0; i < subjects.length; i++){
			System.out.print( subjects[i] + "\t");
		}
		System.out.println("총점\t 평균");						//출력 포맷
		for (int i = 0; i < names.length; i++){
			for ( int j = 0 ; j < subjects.length; j++){
				scores[i][j] = (int)(Math.random()* 50 + 50);
				sum [i] += scores[i][j];
			}
			avg[i] = (double)sum[i] / (subjects.length);

		}

		int[] rank = new int[names.length];
		//초기화는 1로 모두 등록		//정수만큼 배열이 필요
		for(int i = 0 ; i < names.length - 1 ; i++){
			rank[i] = 1;
		}
		for (int i = 0; i < names.length - 1; i++){
			for (int j = names.length - 1 ; i < j; j--){
				if(sum[i] < sum [j]){
					rank[i]++;
				}
				else if(sum[i] > sum [j]){
					rank[j]++;
				}
			}
		}

		//i컬럼만 가지고 정렬하기 각각의 점수와 평균과 총점을 큰순서대로 배열
		for (int i = 0; i < names.length ; i++){
			System.out.print(rank[i] + "\t" + names[i] + "\t");

			for (int j = 0; j < subjects.length; j++){
				System.out.print(+ scores[i][j] + "\t");	
			}
			System.out.println(sum[i] + "\t" + avg[i]);
		}
		System.out.println("============================================================================================");
		final int row = subjects.length; 
		for (int i = 0; i < scores.length ; i++ ){
			for (int j = i = 1;  j < scores.length ; j++ ){
				
				if (sum[j] > sum[i]){

					int tempSum = sum[i];
					sum[i] = sum[j];
					sum[j] = tempSum;

					double tempAvg = avg[i];
					avg[i] = avg[j];
					avg[j] = tempAvg;

					String str = names[i];
					names[i] = names[j];
					names[j] = str;

					int tempRank = rank[i];
					rank[i] = rank[j];
					rank[j] = tempRank;
					
					}
				}
			}

		for(int i = 0; i <scores.length ; i++){
			for(int j = i + 1; j <scores.length; j++){
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}

			

		
		
//		for (int i = 0; i < names.length; i++){
//			for (int j = i ;  j < names.length ; j++ ){
//				
//				if (sum[j] > sum[i]) {
//					
//				}
//			}
//		}

		for (int i = 0; i < names.length ; i++){
			System.out.print(rank[i] + "\t" + names[i] + "\t");

			for (int j = 0; j < subjects.length; j++){
				System.out.print(+ scores[i][j] + "\t");	
			}
			System.out.println(sum[i] + "\t" + avg[i]);
		}
	}
}
