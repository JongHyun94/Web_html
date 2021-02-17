package ch02;

public class Exam03 {

	public static void main(String[] args) {
		
		//int 타입 이하의 피연산자의 연산은 결과가 int다
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2;
		byte var4 = (byte)(var1 + var2);
		
		//int 타입보다 큰 타입이 연산이 되면 큰 타입으로 결과가 된다.
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		int var8 = (int)(var5 + var6);
		
		int var9 = 10;
		double var10 = 1.5;
		double var11 = var9 + var10;
	}

}
