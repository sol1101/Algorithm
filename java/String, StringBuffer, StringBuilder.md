# ✔String, StringBuffer, StringBuilder

📌문법 및 사용법
---
- String클래스<br>
생성되면서 값이 설정되면 메모리 일정 번지수에 해당 값이 저장된다.<br>
값이 변경되면 메모리의 새로운 공간에 값이 저장되며, 기존 메모리에 할당된 값은 Garbage Collector로 빠지게 된다.
```java
String A = "11"; // String A 선언
System.out.println(A); // String A 출력
System.out.println("A hashCode : " + A.hashCode()); // String A의 hashcode값 출력

output : 11
output : A hashCode : 1568

A = A + 1;
System.out.println(A);
System.out.println("A hashCode : " + A.hashCode());

output : 111
output : 48657
```

- StringBuffer, StringBuilder<br>
두 클래스의 사용방법은 동일하며, append 메서드를 통해 값을 추가할 수 있다.<br>
할당된 공간에 값이 추가되기 때문에, 값이 변경돼도 메모리 낭비가 없다.
```java
StringBuffer sbf = new StringBuffer("Java"); //StringBuffer 선언 선언
System.out.println(sbf);
System.out.println("sbf hashCode : " + sbf.hashCode());
		
sbf.append(" Practice"); //선언 된 StringBuffer에 문자열 추가
		
System.out.println(sbf);
System.out.println("sbf hashCode : " + sbf.hashCode());
//값이 변경되었지만 hashCode는 그대로인 것을 확인할 수 있다
```

📌차이
---
![image](https://user-images.githubusercontent.com/91520114/150126596-95d304f4-d70c-4b9d-b826-99de07d356f4.png)<br>
값이 자주 변경되는 문자열의 경우 String 대신 StringBuffer나 StringBuilder를 사용해 주는 것이 좋다.<br>
DB의 쿼리문을 만들어줄때 String보다는 StringBuffer나 StringBuilder를 주로 사용한다.<br>

**정리**<br>
String : 문자열 연산이 적은 경우<br>
StringBuffer : 문자열 연산이 많고 멀티 스레드 환경에서 사용하기 좋음<br>
StringBuilder : 문자열 연산이 많고 단일 스레드 환경이나 동기화를 고려하지 않아도 되는 환경에서 사용하기 좋음
***

참고 : [https://blog.naver.com/hongganz/222504333789](https://blog.naver.com/hongganz/222504333789)
