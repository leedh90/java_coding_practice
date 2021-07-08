package study02;

public class Solution2 {// 소수 찾기
	// 1. 1부터 숫자 n 사이에 있는 소수의 개수를 반환하는 함수.
	// 2. n은 2이상 1000000 이하 의 자연수
	public int solution(int n) {
		String str = "100이하의 약수는 ";
		int answer = 0; // 총 소수의 개수를 담는 변수
		for (int i = 2; i <= n; i++) {
			int count = 0; // 입력받은 수 n을 for문을 통해 2~n 까지 전부 나눠고 나머지가 0인 갯수를 카운트
			// count 변수의 위치 중요 첫번째 for문이 돌때 마다 0으로 초기화가 되어야 한다.
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					// i를 j로 나눴을때 입력받은 값을 for문을 반복하여 2부터 입력받은 숫자까지 계속 나눴을때 나머지가 0이면
					count++; // 변수를 증감한다.
				}
			}
			if (count == 1) {// 나머지가 0인 갯수가 1개면 그 수는 소수이다.
				answer++;
				str = str + " " + i; // count가 1이면 약수이다 그 때 i값을 변수에 넣고 총 약수 쌓는다.
			}
		}
		System.out.println(str); // 
		return answer; // 리턴은 항상 마지막에 위치해야 한다
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println("100이하의 약수의 개수는 : " + s.solution(100));

	}
}
