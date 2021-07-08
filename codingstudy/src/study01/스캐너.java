package study01;

import java.util.Scanner;

public class 스캐너 {

	public static void main(String[] args) {
		// 스캐너 함수 사용하기
		Scanner sc = new Scanner(System.in);
		// 스캐너 함수는 키 입력을 받을때 System.in을 사용한다
		

		String name;
		System.out.println("이름을 입력하세요");
		name = sc.next(); // 공백전까지 받아줌.
		
		String s1 = sc.nextLine(); // 이름입력시 발생하는 개행문자(엔터)를 처리해주기 위한 것
		
		String message;
		System.out.println("메세지를 입력하세요");
		message = sc.nextLine();

		int age;
		System.out.println("나이를 입력하세요");
		age = sc.nextInt(); // nextLine만 공백 및 엔터 인식 및 받기 가능 다른 next기능들은 공백 앞까지만 받는 기능
		
		String s3 = sc.nextLine();
		
		String hobby;
		System.out.println("취미를 입력하세요");
		hobby = sc.next();
		
		double height;
		System.out.println("신장를 입력하세요");
		height = sc.nextDouble();
		
		System.out.println(name + "님을 소개 하면 나이는 " + age + "이고, 취미는 " + hobby + 
				"이며, 키는 " + height + "입니다.");
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(name.length());
		
		
		sc.close();

	}

}
