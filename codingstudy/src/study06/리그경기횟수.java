package study06;

import java.util.Scanner;

public class 리그경기횟수 {

	public static void main(String[] args) {
		// 리그 경기 횟수 구하기!
		// 리그에 참여하는 n 개의 팀이 리그에서 몇번의 경기를 치루는지
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("리그에 총 참여하는 팀의 수를 입력하세요");
		int team = sc1.nextInt();
		int count = team * (team - 1) / 2;
		int count2 = 0;		// 리그의 경기수를 구하는 공식! 참여팀수 * (참여팀수-1) / 2
		System.out.println("리그의 총 참여하는 팀은 " + team + "개이고, 총 경기수는 " + count + "회이다.");
		
		for (int i = 0; i < team; i++) {
			// 나를 제외한 모든 팀이랑 하고 2번째는 나와 이미 경기한팀을 제외한다.
			// 이렇게 소거식으로 하면 팀수 - 1까지를 다 더하면 된다.
			count2 += i;
		}
		System.out.println("리그의 총 참여하는 팀은 " + team + "개이고, 총 경기수는 " + count2 + "회이다.");
	}

}
