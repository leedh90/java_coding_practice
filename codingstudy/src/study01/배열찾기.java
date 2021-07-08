package study01;

import java.util.Arrays;

public class 배열찾기 {

	public static void main(String[] args) {
		// int 배열에서 합계 평균 최대값 최소값 구하기
		int[] num = {3, 12, 45, 32, 54, 22};
		
		// num 배열의 합계 구하기
		int sum = 0; // 정수값의 합을 구하기 위해 sum 변수를 초기화
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i]; // sum 변수가 for문을 돌면서 계속해서 num에 있는 값을 더해서 sum에 넣어준다.
		}
		System.out.println("배열값의 합은? " + sum); // num 배열에 있는 값을 다 더한 후 프린트
		System.out.println("----------------------------");
		// num 배열의 평균 구하기
		int sum1 = 0; // 배열값의 합을 구하기 위함
		int count = 0; // 배열의 갯수를 구하기 위함
		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + num[i];
			count++;
		}
		System.out.println("배열의 총 합은? " + sum1);
		System.out.println("배열의 총 갯수는? " + count);
		System.out.println("배열의 평균값은? " + (double)sum1/count);
		// 평균은 실수형이므로 둘중에 하나를 실수형으로 캐스팅(기본형형변환, 자동형변환) 해주면 실수형으로 계산된다.
		System.out.println((double)sum1/num.length);
		// 렝스값을 알면 카운트 만들어줄 필요 없이 평균값 구하기 가능
		System.out.println("----------------------------");
		// count 변수 없이 num 배열의 크기를 활용해서도 평균을 구할 수 있다.
		
		// 최대값 최소값 구하기
		// 1. for문으로 구하기
		int max = num[0];
		// 초기값을 0으로 하지 않는 이유는 배열에 음수값으로만 이루어져 있으면 모든 배열값이 0보다 작아 잘못된 값이 나온다.
		int min = num[0];
		// 위와 같은 이유로 변수들은 0이 아닌 배열의 첫번째 값으로 초기화 시켜준다.
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {// 반복문을 돌려서 배열의 인덱스 순번의 값이 max 보다 클때는
				max = num[i]; // 큰 값을 max에 넣어준다.
			}
		}System.out.println("배열의 최대값은 " + max);
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {// 반복문이 돌면서 배열의 인덱스 순번의 값이 min보다 작을때
				min = num[i]; // min에 num[i] 값을 넣는다.
			}
		}System.out.println("배열의 최소값은 " + min);
		System.out.println("----------------------------");
				
		// Arrays의 기능을 사용하여 최대값 최소값 찾기 
		Arrays.sort(num); // 배열을 오름차순으로 정리!
		System.out.println("배열의 최소값은? " + num[0]); // 오름차순으로 첫번째 순번의 배열값이 최소값
		System.out.println("배열의 최대값은? " + num[num.length - 1]); // 배열의 마지막 순번의 값이 최대
	}

}
