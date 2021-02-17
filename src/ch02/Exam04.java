package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		//문자열 => 숫자(정수, 실수)
		
		//문자열은 String 타입 변수에 저장한다.
		String var1 = "10"; //10이 아니라 1 과 0 임
		
		System.out.println("var1: "+ var1);

		//문자열과 숫자가 + 연산하면 문자열 결합이 됨
		String var2 = var1 + 5; // 1 0 5
		System.out.println("var2: "+ var2);
		
		//문자열을 정수로 변환해서 연산
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("var3: "+ var3);
		
		//문자열을 실수로 변환해서 연산
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var4: "+ var5);
		
		//숫자를 문자열로 변환
		int var6 = 3;
		String var7 = "" + var6;//3을 문자열 3으로 만드는방법1
		String var8 = String.valueOf(var6);//방법 2
		System.out.println("var7: "+ var7);
	}

}
