package study05;

import java.util.Scanner;

public class 신규아이디추천1 {

	public static void main(String[] args) {
		// 카카오 신규 아이디 추천하기
		// 1. 대문자 -> 소문자로 변환하기.
		Scanner sc = new Scanner(System.in);
		String id1 = sc.next();
		String id2 = id1.toLowerCase();
		System.out.println(id2);

		// 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 제외한 모든 문자를 제거
		String id3 = "";
		// 두번째 조건을 충족시켜 아이디를 넣어줄 변수 id3
		for (int i = 0; i < id2.length(); i++) {
			char ch = id2.charAt(i);
			// 대문자를 제거한 id2를 char 배열로 만들어서 각각 인덱스 순번의 조건을 확인하기 위해서
			// ch변수에 하나씩 문자를 넣고 해당 ch 문자의 조건을 분석한다.
			if (ch >= 'a' && ch <= 'z') {
				// ch문자에 a~z까지 있으면 
				// a~z까지 하려면 기본형 변수를 사용해야한다. String은 불가하다.
				// &&를 사용해서 a~z까지를 표현할 수 있다.
				id3 = id3 + ch;
				// 해당 ch의 value 값을 스트링형태로 id3의 넣어준다.
			} else if (ch >= '0' && ch <= '9') {
				// ch 문자에 0~9까지 숫자가 있으면
				id3 = id3 + ch;
				// id3에 추가해준다.
			} else if (ch == '-' || ch == '_' || ch == '.') {
				// ch 문자에 -_. 이 있으면
				id3 = id3 + ch;
				// id3에 추가해준다.
			}
		}
		// 3. . 이 2번 이상 연속된 부분을 하나의 . 로 치환
		while (id3.contains("..") == true) {
			// id3에 ..이 있으면 아래를 실행!
			id3 = id3.replace("..", ".");
			// ..을 .으로 치환!
		}
		
		
//		for (int i = 0; i < id3.length(); i++) {
//			if (id3.charAt(i) == '.') {
//				// id3를 char 배열로 만들어서 각 인덱스 순번에 . 이 있을때
//				int j = i + 1;
//				// .이 몇개 인지 체크해줄 j변수
//				String dot = ".";
//				// replace하기 위한 변수
//				while (j != id3.length() && id3.charAt(j) == 'j') {
//					dot = dot + ".";
//					j++;
//				}
//				if (dot.length() > 1) {
//					id3 = id3.replace(dot, ".");
//				}
//			}
//		}
		// 4. 첫번째, 마지막에 . 이있으면 삭제
		if (id3.startsWith(".")) {
			// id3가 .으로 시작하면
			id3 = id3.substring(1, id3.length());
			// id3를 인덱스 순번 1번부터 끝까지로 짤라주고
		} else if (id3.endsWith(".")) {
			// id3가 .으로 끝나면
			id3 = id3.substring(0, id3.length() - 1);
			// id3를 0번부터 마지막 전까지 짤라준다.
		}
		// 5. 빈 문자열이라면 a를 대입해줘라
		if (id3.length() == 0) {
			// 아이디가 비어있으면
			id3 = id3 + "a";
			// a를 추가해준다.
		}
		// 6-1. 16자 이상이면, 15자만 남기고 삭제
		if (id3.length() >= 16) {
			// id3의 길이가 16이상이면
			id3 = id3.substring(0, 15);
			// 인덱스 순번 0번부터 15개를 추출한다.
			// 6-2. 마지막이 . 이면 제거
			if (id3.endsWith(".")) {
				// 15개로 추출한 후 .으로 끝나면
				id3 = id3.substring(0, id3.length() - 1);
				// 마지막 .도 삭제한다.
			}
		}
		// 7. 2자 이하면 마지막 문자를 3개의 문자열까지 복사해서 붙임
		String last = id3.charAt(id3.length() - 1) + "";
		// 인덱스 번호는 0번부터기 때문에 전체 길이에서 1을 빼준다.
		// 타입을 char에서 String으로 캐스팅해주기 위해서 ""를 더해준다.
		if (id3.length() == 2) {
			// 길이가 2라면
			id3 = id3 + last;
			// id3에 마지막 문자를 더해준다.
		} else if (id3.length() == 1) {
			// 길이가 1이라면
			id3 = id3 + last + last;
			// id3에 마지막 글자를 2번 더해준다.
		}
		System.out.println(id3);
	}
}
