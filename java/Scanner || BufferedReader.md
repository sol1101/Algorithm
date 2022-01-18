# ✔Scanner와 BufferedReader

버퍼 : 데이터를 전송할때 일시적으로 그 데이터를 보관하는 메모리 영역
짐을 옮길때 물건을 하나씩 옮기는게 Scanner, 박스에 담아서 옮기는게 buffer라고 비유

📌차이
---
BufferedReader 다음에 나온 것이 Scanner 클래스이며 Scanner의 속도가 훨씬 느리다.
Scanner가 최신이긴하나 둘의 차이점이 명확히 있으므로 용도에 맞게 사용하는 것이 바람직하다.

1. Scanner의 버퍼 크기는 1024 chars, 반면 BufferReader의 버퍼 크기는 8192 chars이다.
2. BufferReader는 문자열을 단순히 읽고 저장, Scanner는 문자열을 구분(파싱)하여 분석할 수 있다.

||Scanner|BufferedReader|
|---|---|---|
|사용|쉽다|복잡하다(형변환,파싱)|
|속도|느리다|빠르다|
|예외처리|자체 예외처리|자체 예외처리가 없어서 따로 해줘야됨|
|효율(데이터 양이 많은 경우)|상대적으로 비효율|보다 효율|

📌문법 및 사용법
---
Scanner
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

BufferedReader,Writer
|메소드|역할|
|---|---|
|read()|스트림으로부터 문자를 하나 읽어 유니코드로 반환. '1'입력 → 49반환(int)
|readLine()|한 줄 읽고 반환.(String)
|close()|스트림 닫음
|flush()|남아있는 데이터 모두 출력

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

	public static void main(String[] args) throws IOException {
  /* try catch문으로 예외처리를 하거나 이처럼 그냥 던져버리기(throws)도 함.
  throw하는 이유로는 예외처리할 필요가 없다고 판단될 경우, 다른 개발자에게 원하는 처리를 하도록 기회를 줄 경우 등이 있다 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
    
		String a = br.readLine(); // 문자열 입력
		int b = Integer.parseInt(br.readLine()); // 정수형 입력 (형변환)
    
		System.out.println(a);
		System.out.println(b); // 문자열a, 정수 b 출력
		bw.write("Hello World"); // 버퍼에 있는 값 출력

		bw.flush(); // 남아있는 데이터 모두 출력
		bw.close(); //스트림 닫음

}

```

많은 양의 데이터를 출력할 경우 Buffer를 활용하는 BufferedWriter를 쓰는게 System.out.print()를 쓰는 것 보다 성능이 좋다

***

[참고1 https://blog.naver.com/masichyun77/222376782534](https://blog.naver.com/masichyun77/222376782534)

[참고2 https://blog.naver.com/masichyun77/222376782534](https://blog.naver.com/lyg0108/222251927061)
