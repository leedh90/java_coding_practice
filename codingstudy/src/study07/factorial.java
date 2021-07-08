package study07;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// 수를 입력받아 팩토리얼을 구하는 메서드 작성
		// 3! => 3 x 2 x 1 => 6
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		// 수를 입력 받을 스캐너 객체 변수 생성
		int result = 1;
		for (int i = sc1; i >= 1; i--) {
			result = result * i;
			// 입력받은 숫자에서 1씩 줄이면서 반복문을 실행 1이 될때까지.
		}
		System.out.println(sc1 + "!의 값은 " + result);
	}

}
