package ch03;

public class Exam01 {

	public static void main(String[] args) {
		
		//산술연산의 다양한 형태
		
		int var1 = 1;
		var1 = var1 + 1; // var1에 1을 더해서 다시 var1에 저장
		var1 += 1; // var1에 1을 더해서 다시 var1에 저장
		var1++; // var1에 1을 더해서 다시 var1에 저장
		System.out.println("var1: "+ var1);

		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		System.out.println("var2: "+ var2);
		
		int var3 = 16;
		var3 = var3 / 2;
		var3 /= 2;
		
		// 자바는 정수 / (나눗셈)의 결과는 정수입니다.
		int var4 = 11;
		int var5 = 4;
		int var6 = var4 / var5;
		System.out.println("var6: "+ var6); // 2
		
		// 실수로 만들어줘서 나눠준다.
		double var7 = 1.0 * var4 / var5;
		System.out.println("var7: "+ var7); // 2.75
		
		double var8 = (double) var4 / var5;
		System.out.println("var8: "+ var8); // 2.75
		
		// 나머지 구하기
		int var9 = var4 % var5;
		System.out.println("var9: "+ var9); // 3
	}

}
