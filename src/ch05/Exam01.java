package ch05;

public class Exam01 {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 10;
		//값 비교
		System.out.println(var1 == var2); // true
		System.out.println(var1 != var2); // false
		
		String var3 = "자바";
		String var4 = new String("자바"); // 문자열은 같지만 값은 다름 주소값이 달라서

		//번지 비교
		System.out.println(var3 == var4); // false
		System.out.println(var3 != var4); // true
		System.out.println(var3.equals(var4)); // true
	}

}
