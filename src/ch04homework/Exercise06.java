package ch04homework;
//for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
public class Exercise06 {

	public static void main(String[] args) {
		int i,j;
		for(i=5;i>0;i--) {
			for(j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
