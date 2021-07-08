package study05;

public class 요일맞추기 {
	// 입력값을 사용하기 위한 메서드를 생성해준다.
	public void whatday(int a, int b) { // 요일을 계산하는 메서드 생성!
		String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		// 각 요일을 나타내는 배열 입력된 날짜에 맞는 배열값을 꺼내서 요일을 찍어줘야한다.
		// 1월 1일이 금요일이므로 인덱스 1번이 금요일이 되게 배열을 위치시킨다.
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 각 달별 총 일수를 나타내는 배열 윤달이기 때문에 2월은 29일로 넣는다.
		int sum = 0;
		// 총 일 수를 계산하기 위한 sum 해당 일수를 day배열의 length로 나누면 요일을 구할 수 있다.
		for (int i = 0; i < a-1; i++) {
			// 달을 입력하는 a가 1일때는 0보다 작다는 범위가 되므로 for문을 실행하지 않는다.
			sum = sum + month[i];
			// a가 1보다 크면 month[a-1]의 값들을 다 더해준다. 그럼 각 달별 총 일수가 계산된다.
		}
		sum = sum + b;
		// 이미 구해진 각 달별 일수의 합에 일을 입력한 b를 더해주면 총 몇일인지 구할 수 있다.
		System.out.println(day[sum % day.length]);
		// 총 날짜를 day의 length인 7로 나눈 나머지를 가지고 day의 index로 사용하여 요일을 구할 수 있다.
	}
	
	public static void main(String[] args) {
		// 2016년 a월 b일은 무슨 요일일까요?
		요일맞추기 day1 = new 요일맞추기();
		day1.whatday(2, 1);
		// whatday 메서드를 사용해서 2월 1일의 요일을 구할 수 있다.
	}

}
