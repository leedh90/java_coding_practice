package study01;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 컬렉션은 4가지 종류가 있다.
		// 1. List형 -> ArrayList 사용, 순서가 있는 자료이다(index사용가능)
		// - 등수 나타낼때 ArratList 사용 가능
		// 2. set형 -> Hashset 사용, 순서가 없고, 중복값을 허용하지 않는다.
		// - 로또만들기 가능
		// 3. Queue -> LinkedList 사용, 선입선출, FIFO 먼저 들어온것이 먼저 나가는 형태
		// - 상한우유 또는 먼저 들어갔다가 먼저 나가야하는 것! 편의점 음식
		// 4. Map형 -> HashMap 사용, key - value 형태를 가지고 있다.
		// - 핸드폰 단축번호 같은 매칭값이 있는경우 사용

		// 로또를 만들기 위해서는 중복되는 값이 들어가지 않고 6개의 숫자를 넣어야한다.
		// 중복되는 값이 들어가지 않는 형태는 컬렉션의 셋형을 사용할 수 있다.
		Random r = new Random(); // 범위 미설정시 -21억~21억까지의 난수를 반환한다.
		// 랜덤으로 값을 넣기 위해 Random 객체 생성

		HashSet lotto = new HashSet(); // 중복값을 넣을 수 없는 set형의 HashSet 객채생성
		// lotto에는 중복값을 넣을 수 없다.

		// 반복문을 통해서 lotto에 값을 계속 해서 넣어줘야한다.
		while (lotto.size() < 6) { // 횟수가 정해져 있는 for문 보다는 무한 반복문은 while이 적당
			// 6보다 작을때로 잡아 준것은 6이랑 같아 버리면 갯수가 6개일때도 반복문이 돌기 때문에 최종적으로 7개의 값이
			// 들어간다.
			lotto.add(r.nextInt(45)+1);
			// nextInt(인트수)는 0부터 인트수 -1 를 의미하기 때문에 0~44까지이고 거기에 1을 더해서 1~45까지
			// 만든다.
		}
		System.out.println(lotto);

	}

}
