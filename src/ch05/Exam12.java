package ch05;

public class Exam12 {

	public static void main(String[] args) {
		/*
		String season = "여름";
		Season season1 = Season.SUMMER;
		*/
		
		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) {
			System.out.println("맞습니다.");
		}
		else {
			System.out.println("아닙니다.");
		}
		
		System.out.println(nowSeason); //출력용으로 사용은 안함.
		
		
		//String loginResult = "ID틀림"; // 이런식으로 하지말라
		// 가독성 안좋음 가독성용 boolean에 많이 활용
		LoginResult loginResult = LoginResult.FAILURE_ID;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("로그인 성공");
		}
		else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("아이디 다시 입력하세요");
		}
		else {
			System.out.println("패스워드 다시 입력하세요");
		}
		
	}

}
