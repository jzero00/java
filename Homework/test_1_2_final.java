package Homework;

import java.util.Scanner;

public class test_1_2_final {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String q1 = "나는 금사빠다. *금방 사랑에 빠진다. Y/N?";
		String q2 = "연애할 때 끌려다니는 타입이다. Y/N?";
		String q3 = "데이트 코스는 미리 짜는게 편하다. Y/N?";
		String q4 = "감정기복이 크지 않다. Y/N?";
		String q5 = "감정표현에 솔직한 편이다. Y/N?";
		String q6 = "활동적인 데이트가 좋다. Y/N?";
		String q7 = "연락이 없어도 믿고 기다리는 편이다. Y/N?";
		String q8 = "이성친구는 존재할 수 없다. Y/N ?";
		String q9 = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N ?";
		String resA = "A타입 : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입 입니다.";
		String resB = "B타입 : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입 입니다.";
		String resC = "C타입 : 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입 입니다.";
		String resD = "D타입 : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입 입니다.";

		System.out.println("둘중에 하나만 눌러 YES OR NO? 연애 심리 테스트");
		System.out.println(q1);
		String ans1 = s.nextLine();
		//	q1 y		
		if (ans1.equals("Y") || ans1.equals("y")) {
			System.out.println(q2);
			String ans2 = s.nextLine();
			//	q2 y
			//	q2 시작
			if	(ans2.equals("Y") || ans2.equals("y")) {
				//			q5 시작
				System.out.println(q5);
				String ans5 = s.nextLine();
				//	q5 y
				if (ans5.equals("Y") || ans5.equals("y")) {
					System.out.println(q8);
					String ans8 = s.nextLine();

					if (ans8.equals("Y") || ans8.equals("y")){
						//			qq9				
						System.out.println(q9);
						String ans9 = s.nextLine();
						if (ans9.equals("Y") || ans9.equals("y")){
							System.out.println(resD);
						}
						//			q9 n
						else if (ans9.equals("N") || ans9.equals("n")){
							System.out.println(resC);
						}
					}
					else if (ans8.equals("N") || ans8.equals("n")) {
						System.out.println(resB);
					}

				}
				//	q5 n
				else if(ans5.equals("N") || ans5.equals("n")) {
					//			 	q6	
					//			 	y 답 시작점
					System.out.println(q6);
					String ans6 = s.nextLine();
					if (ans6.equals("Y") || ans6.equals("y")) {
						//				q8 시작점
						System.out.println(q8);
						String ans8 = s.nextLine();

						if (ans8.equals("Y") || ans8.equals("y")){
							//					q9
							System.out.println(q9);
							String ans9 = s.nextLine();
							if (ans9.equals("Y") || ans9.equals("y")){
								System.out.println(resD);
							}
							//					q9 n
							else if (ans9.equals("N") || ans9.equals("n")){
								System.out.println(resC);
							}
						}
						else if (ans8.equals("N") || ans8.equals("n")) {
							System.out.println(resB);
						}
					}
					//	q6 끝점					
					// q8 끝점		
					//				q6	y 답했을때 끝점		

					//				q6	n 답했을때 시작점
					else if (ans6.equals("N") || ans6.equals("n")) {
						System.out.println(q9);
						String ans9 = s.nextLine();
						if (ans9.equals("Y") || ans9.equals("y")){
							System.out.println(resD);
						}
						//				q9 n
						else if (ans9.equals("N") || ans9.equals("n")){
							System.out.println(resC);
						}
					}
					//				q6	n 답했을 때 끝점
				}
			}
			//	q2 끝점

			//	q2 n
			//	q3 시작
			else if (ans2.equals("N") || ans2.equals("n")) {
				System.out.println(q3);
				String ans3 = s.nextLine();

				//	q3 y		
				if (ans3.equals("Y") || ans3.equals("y")) {
					//	q6 시작점			
					System.out.println(q6);
					String ans6 = s.nextLine();
					if (ans6.equals("Y") || ans6.equals("y")) {
						//					q8 시작점
						System.out.println(q8);
						String ans8 = s.nextLine();

						if (ans8.equals("Y") || ans8.equals("y")){
							//						q9
							System.out.println(q9);
							String ans9 = s.nextLine();
							if (ans9.equals("Y") || ans9.equals("y")){
								System.out.println(resD);
							}
							//						q9 n
							else if (ans9.equals("N") || ans9.equals("n")){
								System.out.println(resC);
							}
						}
						else if (ans8.equals("N") || ans8.equals("n")) {
							System.out.println(resB);
						}
					}
					//		q6 끝점					
					// q8 끝점		
					//					q6	y 답했을때 끝점		

					//					q6	n 답했을때 시작점
					else if (ans6.equals("N") || ans6.equals("n")) {
						System.out.println(q9);
						String ans9 = s.nextLine();
						if (ans9.equals("Y") || ans9.equals("y")){
							System.out.println(resD);
						}
						//					q9 n
						else if (ans9.equals("N") || ans9.equals("n")){
							System.out.println(resC);
						}
					}
					//					q6	n 답했을 때 끝점
				}
				//	q3 n
				else if (ans3.equals("N") || ans3.equals("n")) {
					//				q5 시작
					System.out.println(q5);
					String ans5 = s.nextLine();
					//		q5 y
					if (ans5.equals("Y") || ans5.equals("y")) {
						System.out.println(q8);
						String ans8 = s.nextLine();

						if (ans8.equals("Y") || ans8.equals("y")){
//				q9
							System.out.println(q9);
							String ans9 = s.nextLine();
							if (ans9.equals("Y") || ans9.equals("y")){
								System.out.println(resD);
							}
//				q9 n
							else if (ans9.equals("N") || ans9.equals("n")){
								System.out.println(resC);
							}
						}
						else if (ans8.equals("N") || ans8.equals("n")) {
							System.out.println(resB);
						}

					}
//		q5 n
					else if(ans5.equals("N") || ans5.equals("n")) {
//				 	q6	
//				 	y 답 시작점
						System.out.println(q6);
						String ans6 = s.nextLine();
						if (ans6.equals("Y") || ans6.equals("y")) {
//					q8 시작점
							System.out.println(q8);
							String ans8 = s.nextLine();

							if (ans8.equals("Y") || ans8.equals("y")){
//						q9
								System.out.println(q9);
								String ans9 = s.nextLine();
								if (ans9.equals("Y") || ans9.equals("y")){
									System.out.println(resD);
								}
//						q9 n
								else if (ans9.equals("N") || ans9.equals("n")){
									System.out.println(resC);
								}
							}
							else if (ans8.equals("N") || ans8.equals("n")) {
								System.out.println(resB);
							}
						}
//		q6 끝점					
// q8 끝점		
//					q6	y 답했을때 끝점		

//					q6	n 답했을때 시작점
						else if (ans6.equals("N") || ans6.equals("n")) {
							System.out.println(q9);
							String ans9 = s.nextLine();
							if (ans9.equals("Y") || ans9.equals("y")){
								System.out.println(resD);
							}
//					q9 n
							else if (ans9.equals("N") || ans9.equals("n")){
								System.out.println(resC);
							}
						}
//					q6	n 답했을 때 끝점
					}
				}
//		q5 끝점		
			}

		}
//	q3 끝점		

//	q1 y 끝점

//	q1 n
		else if (ans1.equals("N") || ans1.equals("n")) {
//			q4 시작점
			System.out.println(q4);
			String ans4 = s.nextLine();
//			4 y 답 시작점
			if (ans4.equals("Y") || ans4.equals("y")) {

//		q7
				System.out.println(q7);
				String ans7 = s.nextLine();
//			7 y 답 시작점		
				if (ans7.equals("Y") || ans7.equals("y")) {
					System.out.println(resA);
				}
//			7 n 답 시작점
				else if (ans7.equals("N") || ans7.equals("n")) {
					System.out.println(q8);
					String ans8 = s.nextLine();

					if (ans8.equals("Y") || ans8.equals("y")){
//			q9
						System.out.println(q9);
						String ans9 = s.nextLine();
						if (ans9.equals("Y") || ans9.equals("y")){
							System.out.println(resD);
						}
//			q9 n
						else if (ans9.equals("N") || ans9.equals("n")){
							System.out.println(resC);
						}
					}
					else if (ans8.equals("N") || ans8.equals("n")) {
						System.out.println(resB);
					}
				}
			}
//			4 n 답 시작점

			else if (ans4.equals("N") || ans4.equals("n")) {
//				q5 시작
				System.out.println(q5);
				String ans5 = s.nextLine();
//		q5 y
				if (ans5.equals("Y") || ans5.equals("y")) {
					System.out.println("q8는 존재할 수 없다. Y/N ? ");
					String ans8 = s.nextLine();

					if (ans8.equals("Y") || ans8.equals("y")){
//				q9
						System.out.println(q9);
						String ans9 = s.nextLine();
						if (ans9.equals("Y") || ans9.equals("y")){
							System.out.println(resD);
						}
//				q9 n
						else if (ans9.equals("N") || ans9.equals("n")){
							System.out.println(resC);
						}
					}
					else if (ans8.equals("N") || ans8.equals("n")) {
						System.out.println(resB);
					}

				}
//		q5 n
				else if(ans5.equals("N") || ans5.equals("n")) {
//				 	q6	
//				 	y 답 시작점
					System.out.println(q6);
					String ans6 = s.nextLine();
					if (ans6.equals("Y") || ans6.equals("y")) {
//					q8 시작점
						System.out.println(q8);
						String ans8 = s.nextLine();

						if (ans8.equals("Y") || ans8.equals("y")){
//						q9
							System.out.println(q9);
							String ans9 = s.nextLine();
							if (ans9.equals("Y") || ans9.equals("y")){
								System.out.println(resD);
							}
//						q9 n
							else if (ans9.equals("N") || ans9.equals("n")){
								System.out.println(resC);
							}
						}
						else if (ans8.equals("N") || ans8.equals("n")) {
							System.out.println(resB);
						}
					}
//		q6 끝점					
// q8 끝점		
//					q6	y 답했을때 끝점		

//					q6	n 답했을때 시작점
					else if (ans6.equals("N") || ans6.equals("n")) {
						System.out.println(q9);
						String ans9 = s.nextLine();
						if (ans9.equals("Y") || ans9.equals("y")){
							System.out.println(resD);
						}
//					q9 n
						else if (ans9.equals("N") || ans9.equals("n")){
							System.out.println(resC);
						}
					}
//					q6	n 답했을 때 끝점
				}
			}
//		q5 끝점		
//		q4 끝점
		}
	}
//	q1 n 끝점	
}


