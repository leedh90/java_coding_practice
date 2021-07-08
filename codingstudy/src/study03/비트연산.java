package study03;

import java.util.Scanner;

public class 비트연산 {

	public static void main(String[] args) {
		// 비트연산자를 사용해서 연산결과 출력하기
		// 두수를 입력받는다
		Scanner s1 = new Scanner(System.in);
		// 입력 받을 때는 System.in 사용
		int num1 = s1.nextInt();
		int num2 = s1.nextInt();
		System.out.println(num1); // 각 변수에 입력값이 잘 들어 갔는지 확인
		System.out.println(num2);
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		// 비트연산자는 10진수를 2진수로 바꿔서 각 위치에 있는 값들을 비교해서 최종 값을 도출하는 연산자
		// & 비교하는 숫자 2개에 같은 위치에 1이 있으면 1 없으면 0으로 도출
		// | 같은 위치에 1이 있기만 하면 1 없으면 0
		// ^ 같은 위치의 값이 같으면 0 다르면 1을 도출
		// 10진수 15 => 2진수 1111
		// 10진수 5 =>  2진수 0101
		// & => 0101 => 10진수로 변환하면 5
		// | => 1111 => 10진수로 변환하면 15
		// ^ => 1010 => 10진수로 변환하면 10

	}

}
