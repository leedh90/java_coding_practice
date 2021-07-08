package study03;

import java.util.Scanner;

public class 거스름돈 {

	public static void main(String[] args) {
		// 자동으로 거스름돈 계산해주는 프로그램 만들기(단위가 큰 동전부터 주기)

		Scanner s = new Scanner(System.in); // 입력값을 받기위한 스캐너
		int price = s.nextInt(); // 상품의 가격을 price에 입력
		int exchange = 1000 - price; // 계산되면서 남은 잔돈을 넣어줄 변수
		int count500 = 0; // 각각의 동전의 갯수 카운팅 하는 변수
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		System.out.println("거스름 돈은 " + exchange + "원 이다.");
		if (exchange / 500 >= 0) {
			count500 = exchange / 500; // int의 나누기는 몫만 가져올 수 있기 때문에 갯수로 사용가능
			// System.out.println(exchange / 500);
			exchange = exchange - (500 * count500);
			if (exchange / 100 >= 0) {
				count100 = exchange / 100;
				exchange = exchange - 100 * count100;
				if (exchange / 50 >= 0) {
					count50 = exchange / 50;
					exchange = exchange - 50 * count50;
					if (exchange / 10 >= 0) {
						count10 = exchange / 10;
					}
				}
			}
		}
		System.out.println("500원짜리 " + count500 + " 100원짜리 " + count100 + " 50원짜리 " + count50 + " 10원짜리 " + count10);
	}

}
