package study01;

import java.util.Scanner;

public class 이중for문 {

	public static void main(String[] args) {
		// 이중 for문을 사용해서 구구단 만들기
		for (int i = 1; i <= 9; i++) { // 바깥 for문이 1번 도는 동안 안쪽 for문은 9번 돈다
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("\n");
		}

		// Scanner 사용해서 구구단 뽑기
		System.out.println("구구단 몇단을 보고 싶으신가요?");
		// 어떤 입력값을 입력해야 하는지 알려주는 프린트
		Scanner sc = new Scanner(System.in); // Scanner 사용하기 위한 객체 생성
		// 스캐너는 콘솔에서 입력값을 받아서 바로 변수에 넣을 수 있는 기능?
		int m = sc.nextInt();
		// 입력값에 맞는 타입을 사용
		System.out.println("입력하신 구구단은 " + m + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.print(m * i + " ");
		}
		System.out.println("");
		System.out.println("-----------------------------------");
		// 구구단 3단에서 4의 배수를 제외하고 프린트하기
		System.out.println("3단에서 4의 배수를 뺀 값은?");
		int[] i3 = new int[9];
		for (int i = 0; i < i3.length; i++) {// 구구단 3단을 i3 배열에 만들어 넣는다
			i3[i] = 3 * (i + 1);
			// System.out.print(i3[i] + " "); // 3단이 잘 나오는지 확인
			if (i3[i] % 4 != 0) {// i3에 있는 값을 4로 나누었을때 나머지가 0이 아니면 출력!
				// 나머지 찾는 연산자 % 사용 같지 않을때 != 사용
				System.out.print(i3[i] + " ");
			}
		}
		sc.close();

	}

}
