package study05;

import java.util.Scanner;

public class 신규아이디추천정규식 {

	public static void main(String[] args) {
		// 카카오 신규 아이디 추천하기
		// 1. 대문자 -> 소문자로 변환하기.
		Scanner sc = new Scanner(System.in);
		String id1 = sc.next();
		String id2 = id1.toLowerCase();
		// 2. 소문자, 숫자, -, _, . 빼고 전부 삭제
		id2 = id2.replace("[^a-z0-9-_.]", "");
		// 정규식 [^abc] = abc가 아닌거를 추출!
		// 3. .이 2개 이상일때는 그걸 1개로 치환
		id2 = id2.replace("[.]{2, }", ".");
		// 정규식 [] = []안에 있는 중 동일한개 있으면 일치하는걸 추출!
		// x{n} = x가 n번 있을경우
		// x{n, } = x가 연속해서 n번 이상 나올경우!
		// 4. .이 시작이나 끝이면 삭제
		id2 = id2.replace("^[.] | [.]$", "");
		// 정규식 ^ 행의 시작 $ 행의 끝
		// [] = 해당 대괄호 안에 있으면 추출!
		// | 또는의 의미
		// 5. 빈 문자열이라면 a를 대입해줘라
		if (id2.length() == 0) {
			// 아이디가 비어있으면
			id2 = id2 + "a";
			// a를 추가해준다.
		}
		// 6-1. 16자 이상이면, 15자만 남기고 삭제
		if (id2.length() >= 16) {
			// id2의 길이가 16이상이면
			id2 = id2.substring(0, 15);
			// 인덱스 순번 0번부터 15개를 추출한다.
		}
		// 6-2. 마지막이 . 이면 제거
		if (id2.endsWith(".")) {
			// 15개로 추출한 후 .으로 끝나면
			id2 = id2.substring(0, id2.length() - 1);
			// 마지막 .도 삭제한다.
		}
		// 7. 2자 이하면 마지막 문자를 3개의 문자열까지 복사해서 붙임
		String last = id2.charAt(id2.length() - 1) + "";
		// 인덱스 번호는 0번부터기 때문에 전체 길이에서 1을 빼준다.
		// 타입을 char에서 String으로 캐스팅해주기 위해서 ""를 더해준다.
		if (id2.length() == 2) {
			// 길이가 2라면
			id2 = id2 + last;
			// id2에 마지막 문자를 더해준다.
		} else if (id2.length() == 1) {
			// 길이가 1이라면
			id2 = id2 + last + last;
			// id2에 마지막 글자를 2번 더해준다.
		}
		System.out.println(id2);
	}
}
