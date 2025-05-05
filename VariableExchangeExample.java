package ch02.sec01;

//두 변수의 값을 교환하는 방법, 새로운 변수 temp를 선언
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y:" + y);
	}
}
