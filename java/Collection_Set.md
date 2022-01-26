# ✔Collection FrameWork
 데이터를 가장 간단하게 처리하는 방법 중 하나는 배열이다.<br>
 하지만 배열은 데이터 처리량에 대한 불분명함, 데이터 삭제에 대한 공간 낭비 등 많은 문제점이 있다.<br>
 이러한 문제점을 해결하기 위해 Collection FrameWork를 만들었다
 
 
- JAVA Collection FrameWork 주요 인터페이스 및 클래스
![image](https://user-images.githubusercontent.com/91520114/150637423-72c59c65-ea1b-41b9-8271-2fc2d003ef84.png)<br>

- JAVA Collection FrameWork 주요 인터페이스의 특징
![image](https://user-images.githubusercontent.com/91520114/150637858-2f751599-994f-4a73-9d24-1bfb17441810.png)<br>


📌HashSet
---
Set Collection 특징 : List 컬레션과 다르게 index로 관리되어지지 않으므로 저장 순서가 유지되어 지지 않으며 중복 저장이 되지 않는다.
인덱스가 존재하지 않으므로 속도가 List에 비해 느리다.<br>

- HashSet<br>
HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.<br>
```java
HashSet<Integer> set1 = new HashSet<Integer>();//HashSet생성
HashSet<Integer> set2 = new HashSet<>();//new에서 타입 파라미터 생략가능
HashSet<Integer> set3 = new HashSet<Integer>(set1);//set1의 모든 값을 가진 HashSet생성
HashSet<Integer> set4 = new HashSet<Integer>(10);//초기 용량(capacity)지정
HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f);//초기 capacity,load factor지정
HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
```
HashSet을 기본으로 생성했을때에는 initial capacity(16), load factor(0.75)의 값을 가진 HashSet객체가 생성된다.<br>
HashSet도 저장공간보다 값이 추가로 들어오면 List처럼 저장공간을 늘리는데 Set은 한 칸씩 저장공간을 늘리지 않고 저장용량을 약 두배로 늘린다. 여기서 과부하가 많이 발생한다.<br>
그렇기에 초기에 저장할 데이터 갯수를 알고 있다면 Set의 초기용량을 지정해주는 것이 좋다.<br>
<br>
```java
HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성

System.out.println(set); //전체출력 [1,2,3]
		
Iterator iter = set.iterator();	// Iterator 사용
while(iter.hasNext()) {//값이 있으면 true 없으면 false
    System.out.println(iter.next());
}

HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
System.out.println(set.contains(1)); //set내부에 값 1이 있는지 check : true
```
<br>

📌TreeSet
---
Set Collection 특징 : List 컬레션과 다르게 index로 관리되어지지 않으므로 저장 순서가 유지되어 지지 않으며 중복 저장이 되지 않는다.
인덱스가 존재하지 않으므로 속도가 List에 비해 느리다.<br>

- TreeSet<br>
TreeSet은 HashSet과 마찬가지로 중복 저장할 수 없고 순서가 유지되지 않는다.<br>
하지만 HashSet과 달리 TreeSet은 이진 탐색 트리 구조로 이루어져 있어서 데이터 추가와 삭제에 시간이 더 걸린다.<br>
TreeSet은 이진탐색트리 중에서도 성능을 향상시킨 레드-블랙 트리로 구현되어 있다.<br>
데이터가 들어올 때 값이 편향되게 들어올 경우 한쪽으로 크게 치우쳐진 트리가 되어 굉장히 비효율적인 퍼포먼스를 내기 때문에 이를 보완하기 위해 레드 블랙 트리가 등장했다.<br>
레드-블랙 트리는 부모노드보다 작은 값을 가지는 노드는 왼쪽, 큰 값을 가지는 노드는 오른쪽 자식으로 배치하여 데이터의 추가나 삭제시 트리의 균형을 맞춰준다.<br>
<br>
```java
TreeSet<Integer> set1 = new TreeSet<Integer>();//TreeSet생성
TreeSet<Integer> set2 = new TreeSet<>();//new에서 타입 파라미터 생략가능
TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1의 모든 값을 가진 TreeSet생성
TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
set.add(1); //값추가
set.remove(1);//값 1 제거


System.out.println(set); //전체출력 [2,3,4]
System.out.println(set.first());//최소값 출력
System.out.println(set.last());//최대값 출력
System.out.println(set.higher(3));//입력값보다 큰 데이터중 최소값 출력 없으면 null
System.out.println(set.lower(3));//입력값보다 작은 데이터중 최대값 출력 없으면 null
		
Iterator iter = set.iterator();	// Iterator 사용
while(iter.hasNext()) {//값이 있으면 true 없으면 false
    System.out.println(iter.next());
}
```



***

참고 : [https://coding-factory.tistory.com/554?category=758267](https://coding-factory.tistory.com/554?category=758267)
