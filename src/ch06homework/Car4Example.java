package ch06homework;
//return문
public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5); //Car의 setGas() 메소드 호출

		boolean gasState = myCar.isLeftGas(); //Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); //Car의 run()메소드 호출
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
