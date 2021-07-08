package study04;

import java.util.Scanner;

public class 특정문자개수구하기 {

	public static void main(String[] args) {
		// 입력된 문자열 안에 포함된 특정 문자의 개수를 출력하는 프로그램
		// 예) Goorm EDU에서 'o'가 2개이다 -> 2를 출력
		// 대소문자 구분해서 진행
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		// 문자열을 입력 받아 st 변수로 설정
		String[] st1 = st.split("");
		// 문자열을 각각의 문자로서 비교하기 위해 배열로 변경하고 분리하는 기준을 ""으로 잡아서 전체 분리시킨다.
		System.out.println(st1.length);
		// 배열 st1의 전체 갯수 체크(for문에서 몇번을 돌려야하는지 확인하는 출력)
		
		Scanner sc2 = new Scanner(System.in);
		String st2 = sc2.next();
		// 어떤 문자로 비교할것인지 입력하여 변수 설정
		// char로 잡고 싶었는데 scanner는 char로 입력 불가.
		
		System.out.println("검색할 문자열은 " + st);
		System.out.println("문자열에서 검색할 문자는 " + st2);
		// 확인 출력
		
		int count = 0;
		// 총 몇개가 똑같은지 갯수를 세는 count
		for (int i = 0; i < st1.length; i++) {// for 반복문을 st1 배열의 length만큼 진행
			if (st1[i].equals(st2)) {
				// st1배열의 각 인덱스 값이 st2의 문자와 일치하는지 조건문 실행
				count++;
				// 일치하면 카운트
			}
			
		}
		System.out.println("문자열 " + st + "에 포함된 " + st2 + "는 " + count + "개이다.");
		// 총 몇개인지 확인해주는 출력
		// 대소문자 구분은 자동으로 됨.
	}

}
