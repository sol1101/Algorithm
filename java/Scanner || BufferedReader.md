# Scanner와 BufferedReader

문법
---
Scanner sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

차이
---
BufferedReader 다음에 나온 것이 Scanner 클래스이며 Scanner의 속도가 훨씬 느리다.
Scanner가 최신이긴하나 둘의 차이점이 명확히 있으므로 용도에 맞게 사용하는 것이 바람직하다.

1. Scanner의 버퍼 크기는 1024 chars, 반면 BufferReader의 버퍼 크기는 8192 chars이다.
2. BufferReader는 문자열을 단순히 읽고 저장, Scanner는 문자열을 구분(파싱)하여 분석할 수 있다.
3. BufferReader는 동기화가 가능하기때문에 멀티쓰레드에 안전하다.
4. BufferReader는 컴파일러 수준에서 예외처리가 나올 수 있기 때문에 따로 예외처리를 해야하는 반면 Scanner는 예외처리를 요구하지 않는다.
