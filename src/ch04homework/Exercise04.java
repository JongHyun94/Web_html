package ch04homework;
//while문과 Math.random()메소드를 이용해서 두개의 주사위를 던졌을때 나오는 눈을 (눈1,눈2) 형태로 출력하고
//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 
//눈의 합이 5가 되는 조합은 (1,4),(4,1),(2,3),(3,2)입니다.
public class Exercise04 {

	public static void main(String[] args) {
		
		boolean flag = true;
		int n1,n2;
		while(flag) {
			n1 = (int)(Math.random()*6)+1;
			n2 = (int)(Math.random()*6)+1;
			System.out.println("("+n1+","+n2+")");
			if((n1+n2)==5) {
				flag = false;
			}
		}

	}

}
