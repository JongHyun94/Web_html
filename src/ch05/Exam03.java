package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		
		int[] scores1 = {90,85,95}; //Stack영역에 scores1, scores2, scores3이 생성
		int[] scores2 = {90,85,95}; //heap에 들어있는 90 85 95 값의 주소값은 다른 객체에 생성됨
		int[] scores3 = scores1;    //scores1의 주소값을 scores3에 저장됨
		
		System.out.println(scores1 == scores2);
		System.out.println(scores1 == scores3);

	}

}
