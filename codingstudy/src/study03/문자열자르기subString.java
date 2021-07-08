package study03;

import java.util.Scanner;

public class 문자열자르기subString {

	public static void main(String[] args) {
		// 문자열을 입력받고 해당 문자열을 잘라서 출력하는 코딩 완성
		Scanner sc = new Scanner(System.in);
		// 입력값을 받을 때는 System.in을 사용한다.
		String s1 = sc.nextLine();
		// s1변수에 입력받은 문자열을 넣어줌.
		System.out.println("입력된 문자열은 " + s1);
		// 입력받은 문자열이 잘 들어 갔는지 확인
		String s2 = s1.substring(3, 10); // (시작 인덱스순번, 종료인덱스순번-1)
		// s1을 substring 함수를 사용해 인덱스 3번부터 인덱스 9번까지만 잘라서 s2 변수에 넣어줌.
		System.out.println(s2);
		// s1변수의 인덱스 3번~9번까지의 문자열을 가진 s2를 출력

	}

}
