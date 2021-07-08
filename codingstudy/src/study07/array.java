package study07;

public class array {

	public static void main(String[] args) {
		// 배열 {3, 12, 45, 32, 53, 22}가 있을때 합계, 평균, 최댓값, 최솟값 구하기
		int[] array = {3, 12, 45, 32, 53, 22};
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {// 합계 구하기
			sum = sum + array[i];
		}
		System.out.println("총 합계는 " + sum); // 합계구하기
		System.out.println("평균은 " + ((double)sum / array.length)); // 평균구하기
		
		int max = 0;
		for (int i = 0; i < array.length; i++) {// 최대값 구하기
			if (max < array[i]) {// max값이 작을때만 max에 새로운 값을 넣어준다.
				max = array[i];
			}
		}
		System.out.println("배열의 최대값은 " + max);
		
		int min = array[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {// min값이 클때만 min에 새로운 값을 넣어준다.
				min = array[i];
			}
		}
		System.out.println("배열의 최소값은 " + min);
	}

}
