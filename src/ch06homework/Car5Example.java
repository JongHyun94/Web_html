package ch06homework;
//클래스 외부에서 메소드 호출
public class Car5Example {

	public static void main(String[] args) {
		Car5 myCar = new Car5();
				
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
