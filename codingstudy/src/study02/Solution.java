package study02;

class Solution {
	public boolean solution(String s) {// boolean값을 리턴하기 때문에 void 위치를 리턴값 타입으로 변경
		boolean answer = false; // 변수 초기화(보통은 false 한다)
		try {// 내가 조건을 준 경우가 true이면 아래 진행 false일경우 catch 진행
			Integer.parseInt(s); // 입력받은 문자열이 int 값으로 변경이 가능한경우 아래 진행
			// 문자열 s가 숫자로 이루어졌는지 확인 하는 처리 Integer메서드
			if (s.length() == 4 || s.length() == 6) {
				// 문자열 s의 길이가 4 또는 6일 경우에만 true를 리턴한다.
				answer = true;
			}
		} catch (Exception e) { // 위의 2조건 중 하나라도 일치하지 않으면 catch문 실행
			// 입력받은 문자열 s가 int로 변경이 안될경우
			// 입력받은 문자열 s가 int로 캐스팅이 되어도 길이가 4 또는 6이 아닐경우
			// 리턴값을 false로 넣어줌
			answer = false;
		}
		return answer; // answer 값을 리턴해줌. 메서드 정의
	}

	public boolean solution2(String s2) {
		boolean answer = false; // 지역변수 초기화(boolean은 false로 초기화한다)
		if (s2.length() == 4 || s2.length() == 6) { // s2의 문자열의 길이가 4 또는 6이면 아래를 실행

			try {// 문자열의 값이 숫자로 되어 있는지 확인하기 위해 정수형으로 변환하는 Integer메서드 사용
					// try-catch문을 사용해서 그렇지 않을때는 리턴값에 false입력
				Integer.parseInt(s2);
				for (int i = 0; i < s2.length(); i++) {
					// 문자열 s2에 입력된 값의 길이만큼 for을 반복해서 문자배열로 바꿔준다.
					if (s2.charAt(i) < 0 && s2.charAt(i) > 9) {
						// s2를 문자배열로 바꾼 후 각 인덱스 값이 0보다 작거나 9보다 크면 false
						answer = false;
					} // 문자배열의 인덱스 값이 0 ~ 9까지 일때는 true
					answer = true;
				}
			} catch (Exception e) {// 처음부터 문자열 s2가 int 캐스팅 되지 않으면 false
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {// 위의 class를 사용해보기 위한 main
		Solution st = new Solution();
		// 위의 Solution class를 사용하기 위한 객체 호출
		String s = "12356";
		// 변수값 설정
		System.out.println(st.solution(s));
		// 프린트해서 결과값 확인

		Solution st2 = new Solution();
		String s2 = "0000";
		System.out.println(st2.solution2(s2));
	}

}
