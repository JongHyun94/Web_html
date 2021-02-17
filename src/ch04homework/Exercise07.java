package ch04homework;
//While문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
//이 프로그램을 실행시키면 다음과 같은 실행 결과가 나와야 합니다.
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int flag;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금  | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			flag = Integer.parseInt(scanner.nextLine());
			
			if(flag==1) {
				System.out.print("예금액>");
				balance = balance + Integer.parseInt(scanner.nextLine());
			}
			else if(flag==2) {
				System.out.print("출금액>");
				balance = balance - Integer.parseInt(scanner.nextLine());
			}
			else if(flag==3) {
				System.out.print("잔고>");
				System.out.println(balance);
			}
			else if(flag==4){
				break;
			}
			else {
				continue;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
