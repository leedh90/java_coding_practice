package study04;

public class game {

	public static void main(String[] args) {
		// 369게임 만들기
		int lastnum = 100;
		// 게임의 마지막 숫자
		int count = 0;
		// 짝을 카운팅 하기 위한 변수
		for (int i = 0; i < lastnum; i++) {
			String num = Integer.toString(i);
			// 문자열로 나눠서 각 문자열이 3 6 9 인지 문자로서 확인하기 위한 형변환
			for (int j = 0; j < num.length(); j++) {
				char num1 = num.charAt(j);
				// String의 값을 각각의 인덱스를 부여하기 위해 char형태로 형변환
				// 인덱스 번호는 0부터 시작이기 때문에 length보다 1 작아야 순번이 맞는다.
				if (num1 == '3' || num1 == '6' || num1 == '9') {
					count++;
					// 또는 연산자를 사용해서 각각의 요소가 포함되어 있을때 짝의 카운팅을 해준다.
				}
			}
		}
		System.out.println("총 박수 횟수는 " + count + "번 이다.");
		// 총 박수 횟수를 출력!
	}

}
