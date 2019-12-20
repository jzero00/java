package Homework;

import java.util.Scanner;

public class nojamcityAlgorithm {
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		nojamcityAlgorithm n = new nojamcityAlgorithm();
		n.selectCity();

	}
	void selectCity(){
		System.out.println("친구가 아무 연락없이 갑자기 우리동네에 왔습니다."
				+ "\n내가 사는 도시는 노잼입니다."
				+ "\n어떻게 하는게 좋을까요? 친구는 벌써 오고 있댑니다..."
				+ "\n내가 사는 도시는 :");
		System.out.println("1. 대전 \t 2.울산");
		int ans = Integer.parseInt(s.nextLine());
		if(ans == 1){
			System.out.println("평화의 도시 대전을 선택하셨습니다.");
			q1();
		}
		else if (ans == 2){
			System.out.println("현차의 도시 울산을 선택하셨습니다.");
		q4();
		}
		else {
			selectCity();
		}
	}
	void q1(){
		System.out.println("집에 초대할 수 있음?");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("집에서 배달음식 ㄱㄱ");
		}
		else if(ans.equals("N") || ans.equals("n")){
			q2();
		}
		else {
			q1();
		}
	}
	void q2(){
		System.out.println("매운거 잘 먹음?");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("칼국수, 쭈꾸미 두부두루치기 ㄱㄱ");
		}
		else if(ans.equals("N") || ans.equals("n")){
		q3();
		}
		else{
			q2();
		}
	}
	void q3(){
		System.out.println("둔산동 or 은행동 시내 구경하는거 어떰?");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("그래도 다행이군... 대전에서 할일이 있어서...");
			con1();
		}
		else if(ans.equals("N") || ans.equals("n")){
			System.out.println("이제 뭐하지... 성심담 들리고 집에 보낸다.");
		}
		else{
			q3();
		}
	}
	void q4(){
		System.out.println("날씨 좋음?");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("돗자리 들고 태화 강변 ㄱㄱ");
		}
		else if(ans.equals("N") || ans.equals("n")){
			q5();
		}
		else{
			q4();
		}
	}
	void q5(){
		System.out.println("성남동 or 삼산동 시내 구경 ㄱㄱ?");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("그래도 다행이군... 울산에서 할일이 있어서...");
			con2();
		}
		else if(ans.equals("N") || ans.equals("n")){
			System.out.println("이제 뭐하지... 바다 보여주고 집에 보낸다.");
		}
		else{
			q5();
		}
	}
	void con1(){
		System.out.println("그 다음에 이제 뭐하지... 성심당 들리고 집에 보낸다.");
	}
	
	void con2(){
		System.out.println("그 다음에 이제 뭐하지... 바다 보여주고 집에 보낸다.");
	}
	
}
