package chapter11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		//hashCode를 추가하지 않을 경우: null값 출력 -> "홍길동"을 읽어올 수 없음
		//-> hashCode() 메소드를 추가해야 함
		System.out.println(value);
		
	}

}
