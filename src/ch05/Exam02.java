package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		// 변수를 선언하면서 값 목록을 제공할 경우
		int[] scores1 = {90,85,95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		// 변수를 선언한 후 값 목록을 제공할 경우
		int[] scores2 = null;
		//scores2 = {90,85,95}; // 안됨
		scores2 = new int[] {90,85,95};
		
		//add(10); // call by value : 값을 전달하면서 호출
		add(scores1); // call by reference : 번지를 전달하면서 호출
		add(new int[] {100,200,300}); // 값의 목록을 주고 배열을 만들어야됨. 이미 선언된 배열 int[] arr 이 있기때문에
	}
	/*
	public static void add(int value) {
		System.out.println("값:"+value);
	}
	*/
	public static void add(int[] arr) {
		System.out.println("값:"+Arrays.toString(arr)); // 번지값을 다 문자열로 바꿔주는 메소드
	}

}
