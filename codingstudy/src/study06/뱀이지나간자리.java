package study06;

import java.util.Scanner;

public class 뱀이지나간자리 {

	public static void main(String[] args) {
		// 뱀은 1,1에 위치하고 있고
		// 이동할때는 한행을 끝까지 이동한 후 2칸 아래로 이동한다.
		// 벽에 닿을때 까지 계속 이동하며 더이상 아래로 내려갈 칸이 없으면 멈춘다.
		// 행은 3보다 크거나 같으며 열을 100보다 작거나 같다.
		Scanner sc1 = new Scanner(System.in);
		System.out.println("뱀이 움직일 평면의 크기를 입력하시오(N M)");
		String map = sc1.nextLine();
		// N과 M 사이에 공백이 있으므로 공백을 입력하기 위해서는 nextLine으로 한줄을 전부 입력을 받아야한다.
		// next로 문자열을 받을때는 공백 앞에서 끝기게 때문에 N만 입력값으로 받아진다.
		String[] map1 = map.split(" ");
		// 입력받은 공백이 포함된 문자열을 공백으로 나눠서 배열로 넣어준다.
		// 배열은 인덱스를 가지기 때문에 인덱스 0번이 행 인덱스 1번이 열의 값이다.
		int n = Integer.parseInt(map1[0]);
		int m = Integer.parseInt(map1[1]);
		// 입력받은 문자열을 인트형으로 변경하기 위해 형변환 처리
		System.out.println("입력된 평면의 행의 값: " + n);
		System.out.println("입력된 평면의 열의 값: " + m);

		if (n >= 3 && m <= 100) {
			// 조건에 맞게 범위를 설정
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) { // 홀수행은 항상 뱀이 이동한 자리이다.
					// i의 시작값을 0으로 두면 나머지를 구할 수 없으므로 시작값을 1로 둔다.
					String move = "";
					// 이동하는 경로를 담아주는 변수
					for (int j = 0; j < m; j++) {
						move = move + "#";
						// 이동하는 행에는 전부 #을 넣어준다.
					}
					System.out.println(move);
				} else if (i % 2 == 0 && i % 4 == 2) {
					// 2번 6번 10번....행은 뱀이 오른쪽 끝으로 지나가는 길이다.
					// 2로 나누면 나머지가 0 4로 나누면 나머지가 2인 행이다.
					String move2 = "";
					for (int j = 0; j < m - 1; j++) {
						// 0번째부터 -1번째까지만 . 을 넣어준다.
						move2 = move2 + ".";
					}
					move2 = move2 + "#";
					// 마지막에 #을 붙여서 오른쪽 끝을 뱀이 지나가는 자리로 만든다.
					System.out.println(move2);
				} else if (i % 4 == 0) { // 4의 배수의 행은 뱀이 왼쪽 끝으로 지나가는 행이다.
					String move3 = "";
					for (int j = 0; j < m - 1; j++) {
						move3 = move3 + ".";
						// m-1개까지만 . 을 찍어준다.
					}
					move3 = "#" + move3;
					// 처음에 #을 붙여서 뱀이 왼쪽으로 지나가게 만들어 준다.
					System.out.println(move3);
				}
			}
		}else {
			System.out.println("뱀의 이동한 평면의 크기가 잘못 되었습니다.");
		}
	}
}
