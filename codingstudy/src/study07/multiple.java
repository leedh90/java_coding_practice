package study07;

public class multiple {

	public static void main(String[] args) {
		// 1~100중에서 3의 배수면 짱, 5의 배수면 킹, 3의배수이면서 5의 배수면 짱킹 이외에는 그냥 숫자를 출력
		for (int i = 1; i <= 100 ; i++) {
			if (i % 15 == 0) {// 공배수인 15의 배수 먼저 처리해준다. 그렇지 않으면 결과가 꼬인다.
				// i 값을 15로 나누었을때 나머지가 0이면 짱킹을 출력
				System.out.println("짱킹");
			} else if (i % 3 == 0) {// i를 3으로 나눴을때 나머지가 0이면 짱을 출력
				System.out.println("짱");
			} else if (i % 5 == 0) {// i를 5로 나눴을때 나머지가 0이면 킹을 출력
				System.out.println("킹");
			} else {// 그 외에는 그냥 i를 출력
				System.out.println(i);
			}
		}

	}

}
