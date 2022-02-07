# ✔Collection FrameWork
 데이터를 가장 간단하게 처리하는 방법 중 하나는 배열이다.<br>
 하지만 배열은 데이터 처리량에 대한 불분명함, 데이터 삭제에 대한 공간 낭비 등 많은 문제점이 있다.<br>
 이러한 문제점을 해결하기 위해 Collection FrameWork를 만들었다
 
 
- JAVA Collection FrameWork 주요 인터페이스 및 클래스
![image](https://user-images.githubusercontent.com/91520114/150637423-72c59c65-ea1b-41b9-8271-2fc2d003ef84.png)<br>

- JAVA Collection FrameWork 주요 인터페이스의 특징
![image](https://user-images.githubusercontent.com/91520114/150637858-2f751599-994f-4a73-9d24-1bfb17441810.png)<br>


📌List
---
List Collection의 특징 : 순서를 유지하고 저장, 중복저장 가능<br>
- ArrayList<br>
ArrayList는 일반 배열과 다르게 크기가 유동적이다.
```java
import java.util.ArrayList;
ArrayList<String> AL = new ArrayList<String>(); //ArrayList 선언

AL.add("Hello");AL.add("World"); //add

String s = AL.get(0); //리스트의 값 가져오기
AL.set(0,"HelloHello"); //0번째 인덱스의 값 수정
AL.remove(0);AL.remove("World"); //remove
AL.clear(); //모든 인덱스 제거
```
ArrayList는 저장용량이 default값이 10으로 설정되어있다.<br>
객체를 추가하여 저장용량이 초과하면 자동으로 값이 증가한다<br>
하지만, 다시 객체를 삭제한다고 해서 저장용량이 줄어들지는 않는다.<br>
<br>

- Vector<br>
Vector클래스는 ArrayList와 동일한 내부구조를 가지고 있으나 동기화된 메서드로 구성되어 있다.<br>
따라서 멀티스레드 환경에서 동시에 이 메서드에 접근할 수 없도록 구성되어 있다.(Thread safe)<br>
<br>

- LinkedList<br>
ArrayList와 사용법은 같지만 내부구조가 다르다.<br>
ArrayList는 index에 의해서 관리가 되지만, LinkedList는 인접해있는 노드를 연결해서 체인처럼 연결이 되어있다.<br>
![image](https://user-images.githubusercontent.com/91520114/150638644-f9647136-c527-4cc1-ade9-22b1887e3b48.png)<br>
검색이나 순차적으로 추가, 삭제를 할 상황이 많은 경우 ArrayList를<br>
중간에 데이터를 추가, 삭제 할 상황이 많은 경우 LinkedList를 사용하는 것이 좋다.


***

참고 : [https://dipa92.tistory.com/entry/JAVA-Collection-Framework-List-%EC%BB%AC%EB%A0%89%EC%85%98ArrayList-Vector-LinkList?category=726852](https://dipa92.tistory.com/entry/JAVA-Collection-Framework-List-%EC%BB%AC%EB%A0%89%EC%85%98ArrayList-Vector-LinkList?category=726852)
