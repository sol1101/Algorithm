# ✔String = " " || new String 

Java에서 String 문자열 생성 방식
```java
String s1 = new String("Hello World");
String s2 = "Hello World";
String s3 = "Hello World";
```


📌두 방식의 차이
---
s1 -> Heap영역에서 메모리 관리<br>
s2,s3 -> Heap영역 안에 있는 String Constant Pool 영역에 같은 레퍼런스를 가짐(같은 객체를 바라 봄)

![image](https://user-images.githubusercontent.com/91520114/153198489-6382071a-a105-468c-9ef6-dc9bfb971c0e.png)
<br>

```java
System.out.println(s1.equals(s2)); //true
System.out.println(s1 == s2); // false
System.out.println(s2 == s3); // true
```
equals 연산자는 단순 문자열을 비교하여 s1과 s2를 비교하여도 true가 출력되지만,<br>
== 연산자는 주소값을 비교하기 때문에 s1과 s2를 비교하였을때 false가 출력된다.


***

참고 : [https://ict-nroo.tistory.com/18](https://ict-nroo.tistory.com/18)
