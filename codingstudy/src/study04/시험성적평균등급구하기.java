package study04;

import java.util.Scanner;

public class 시험성적평균등급구하기 {

	public static void main(String[] args) {
		// 시험성적의 평균과 등급구하기
		// 평균은 소수점 2번째자리까지만(3번째 자리에서 반올림)
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D 미만 F
		// 과목별 만점은 100점
		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		double korean = sc1.nextDouble();
		// 국어 점수 입력하는 스캐너
		Scanner sc2 = new Scanner(System.in);
		System.out.println("수학 점수를 입력하세요");
		double math = sc2.nextDouble();
		// 수학 점수 입력하는 스캐너
		Scanner sc3 = new Scanner(System.in);
		System.out.println("영어 점수를 입력하세요");
		double eng = sc3.nextDouble();
		// 영어 점수 입력하는 스캐너
		
		System.out.println("국어점수는? " + korean);
		System.out.println("수학점수는? " + math);
		System.out.println("영어점수는? " + eng);
		// 입력된 점수를 확인하는 출력
		double avg = (korean + math + eng) / 3;
		System.out.println("3과목 평균은 " + String.format("%.2f", avg));
		// 평균은 소수점 2자리까지 나타내기 위해서 정규식을 format 함수를 사용
		if (avg >= 90) {
			System.out.println("3과목 평균은 " + String.format("%.2f", avg));
			System.out.println("등급은 " + "A");
		}else if (avg >= 80) {
			System.out.println("3과목 평균은 " + String.format("%.2f", avg));
			System.out.println("등급은 " + "B");
			
		}else if (avg >= 70) {
			System.out.println("3과목 평균은 " + String.format("%.2f", avg));
			System.out.println("등급은 " + "C");
		}else if (avg >= 60) {
			System.out.println("3과목 평균은 " + String.format("%.2f", avg));
			System.out.println("등급은 " + "D");
		}else {
			System.out.println("3과목 평균은 " + String.format("%.2f", avg));
			System.out.println("등급은 " + "F");
		}
		// 각 평균값에 맞는 등급을 주는 if문 사용
	}
}
