package study01;

public class 배열2 {

	public static void main(String[] args) {
		// 1~100이 있는 배열에서 3의배수 5의배수 3과5의 공통배수를 변환시켜 출력
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			// for 반복문을 통해서 num 배열에 1~100까지의 수를 넣는다.
			num[i] = i + 1; // 1~100까지 num 배열에 넣기
			// System.out.println(num[i]); 잘 들어갔는지 확인하는 출력
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 && num[i] % 5 == 0) {
				System.out.print("짱킹" + " ");
				// 코딩의 위에서부터 아래로 처리가 되기 때문에 15의 배수를 가장 위로 올려준다.
			} else if (num[i] % 3 == 0) { // 여러개의 조건을 걸기 위해서 else if 문을 사용한다.
				System.out.print("짱" + " ");
			} else if (num[i] % 5 == 0) {
				System.out.print("킹" + " ");
			} else {
				System.out.print(num[i] + " ");
			}

		}

	}

}
