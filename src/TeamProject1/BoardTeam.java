//이클립스 콘솔에서 사용할 수 있는 게시판을 만드시오.
//기능 : 목록, 생성, 읽기, 수정, 삭제, 종료
package TeamProject1;

//Scanner 객체 사용하기 위한 import
import java.util.Scanner;

public class BoardTeam {

	public static void main(String[] args) {
		// 작동 flag를 run으로 선언. 
		boolean run = true;
		// string 객체 선언
		String[][] myBoard;
		myBoard = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		/**
		 *  true환경에선 계속 작동하면서 메뉴 화면 출력, false 환경에선 작동 종료
		 */ 
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.목록 | 2.생성 | 3.읽기 | 4.수정 | 5.삭제 | 6. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("메뉴 선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			/*
			 * 1. 목록 출력 기능
			 */
			if(selectNo == 1) {
				
			}
			/*
			 * 2. 생성 기능 
			 */
			else if(selectNo == 2) {

			}
			/**
			 * 3. 읽기 기능 
			 */
			else if(selectNo == 3) {
	
			}
			/**
			 * 4. 수정 기능
			 */
			else if(selectNo == 4) {
				
			}
			/**
			 * 5. 삭제 기능
			 */
			else if(selectNo == 5) {
				
			}
			/**
			 * 6. 종료 기능 run = true 에서 -> false로 바꾸기 
			 */
			else if(selectNo == 6) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
