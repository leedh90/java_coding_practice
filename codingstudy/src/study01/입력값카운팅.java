package study01;

import java.util.Scanner;

public class 입력값카운팅 {

	public static void main(String[] args) {
		// 스캐너 이용해서 입력값 카운팅하기
		
		// 스캐너 사용을 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		// 입력값을 받을때는 System.in을 사용한다.
		System.out.println("문자를 입력해주세요");
		String text = sc.next(); // 공백전까지의 입력값을 받는다.
		// System.out.println(text); // 입력값이 잘 들어 갔는지 확인하는 출력
		// System.out.println(text.length()); for문을 돌릴 길이 출력
		char[] arr = text.toCharArray();
		// 입력값을 받은 String을 문자 하나의 배열로 변경 char배열로
	
		// 입력된 문자들의 갯수 카운팅
		int counta = 0;
		int countb = 0;
		int countc = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (arr[i] == 'a') {
				// 문자열을 문자의 배열로 변경해서 배열의 각 인덱스 값을 비교한 후 카운팅
				counta++;
			}
			else if (arr[i] == 'b') {
				countb++;
			}
			else if (arr[i] == 'c') {
				countc++;
			}
		}
		System.out.println("a의 총 갯수는  " + counta + "개 이고" + "b의 총 갯수는 " + countb
				+ "개 이고" + "c의 총 갯수는 " + countc + "개이다.");
		
		System.out.println("===================================================");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("나는 사람, 너도 사람, 우리도 사람, 모두다 사람 을 입력하세요.");
		String h = sc1.nextLine(); // 한줄 전체를 받기 위해서는 nextLine 사용
		// System.out.println(h); // 확인을 위한 출력
		String[] we = h.split(", "); // split("  |  ") | 기준으로 앞이랑 뒤를 2개의 조건으로 나줄 수 있다. | 또는의 의미
		int count = 0;
		int countm = 0;
		int county = 0;
		int countw = 0;
		int countall = 0;
		for (int i = 0; i < we.length; i++) {
			if (we[i].contains("사람")) {
				count++;
			}if (we[i].contains("나는")) {
				countm++;
			}else if (we[i].contains("너도")) {
				county++;
			}else if (we[i].contains("우리도")) {
				countw++;
			}else if (we[i].contains("모두다")) {
				countall++;
			}
		}
		System.out.println("결과: 사람(" + count + ")");
		System.out.println("결과: 나는(" + countm + "), 너도(" + county + "), "
				+ "우리도(" + countw + "), 모두다(" + countall + "), 사람(" + count + ")");
		sc.close();
		sc1.close();
	}

}
