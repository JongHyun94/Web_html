package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// 주사위를 던져 나오는 수 얻기
		// int value = ?;
		
		double temp = Math.random();
		/*
		System.out.println(Math.random()); //[0,1) 0포함 1미포함 실수
		System.out.println(Math.random() * 6); //[0,6) 0포함 6미포함 실수
		System.out.println((int)(Math.random() * 6)); //0.1.2.3.4.5
		 */
		System.out.println(temp);
		System.out.println(temp*6);
		System.out.println((int)(temp*6));     // 0.1.2.3.4.5
		System.out.println((int)(temp*6) + 1); // 1.2.3.4.5.6
		
		int value = (int)(temp*6) + 1;
		
		if(value%2 == 0) { // 짝수
			System.out.println("짝수가 나왔어요.");
		}
		else { // 홀수
			System.out.println("홀수가 나왔어요.");
		}
	}

}
