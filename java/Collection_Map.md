# ✔Collection FrameWork
 데이터를 가장 간단하게 처리하는 방법 중 하나는 배열이다.<br>
 하지만 배열은 데이터 처리량에 대한 불분명함, 데이터 삭제에 대한 공간 낭비 등 많은 문제점이 있다.<br>
 이러한 문제점을 해결하기 위해 Collection FrameWork를 만들었다
 
 
- JAVA Collection FrameWork 주요 인터페이스 및 클래스
![image](https://user-images.githubusercontent.com/91520114/150637423-72c59c65-ea1b-41b9-8271-2fc2d003ef84.png)<br>

- JAVA Collection FrameWork 주요 인터페이스의 특징
![image](https://user-images.githubusercontent.com/91520114/150637858-2f751599-994f-4a73-9d24-1bfb17441810.png)<br>


📌HashMap
---
Map Collection 특징 : 키(Key)와 값(Value)로 구성된 객체를 저장하는 구조, 하나의 키에 값이 저장되어 있으며 키의 값이 중복저장되지 않는다.<br>

- HashMap<br>
HashMap은 이름 그대로 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보입니다.<br>
```java
HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성
HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
HashMap<String,String> map6 = new HashMap<String,String>(){{//초기값 지정
    put("a","b");
}};

map.remove(1); //key값 1 제거
map.clear(); //모든 값 제거
```
HashMap은 저장공간보다 값이 추가로 들어오면 List처럼 저장공간을 한 칸씩 늘리지 않고 약 두배로 늘린다.<br>
그렇기에 초기에 저장할 데이터 개수를 알고 있다면 Map의 초기 용량을 지정해주는 것이 좋다.<br>
<br>
```java
HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
    put(1,"사과");
    put(2,"바나나");
    put(3,"포도");
}};
		
System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
System.out.println(map.get(1));//key값 1의 value얻기 : 사과
		
//entrySet() 활용
for (Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도

//KeySet() 활용
for(Integer i : map.keySet()){ //저장된 key값 확인
    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도

//entrySet().iterator()
Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
while(entries.hasNext()){
    Map.Entry<Integer, String> entry = entries.next();
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도
		
//keySet().iterator()
Iterator<Integer> keys = map.keySet().iterator();
while(keys.hasNext()){
    int key = keys.next();
    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도
```
<br>

📌TreeMap
---
Map Collection 특징 : 키(Key)와 값(Value)로 구성된 객체를 저장하는 구조, 하나의 키에 값이 저장되어 있으며 키의 값이 중복저장되지 않는다.<br>

- TreeMap<br>
TreeSet은 그냥 값만 저장한다면 TreeMap은 키와 값이 저장된 Map, Etnry를 저장한다.<br>
TreeMap은 일반적으로 Map으로써의 성능이 HashMap보다 떨어진다. (데이터를 저장할 때 즉시 정렬하기에 추가나 삭제가 HashMap보다 오래 걸린다<br>
TreeSet은 이진탐색트리 중에서도 성능을 향상시킨 레드-블랙 트리로 구현되어 있다.<br>
하지만 정렬된 상태로 Map을 유지해야 하거나 정렬된 데이터를 조회해야 하는 범위 검색이 필요한 경우 TreeMap을 사용하는 것이 효율성면에서 좋다.<br>
<br>

```java
TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();//TreeMap생성
TreeMap<Integer,String> map2 = new TreeMap<>();//new에서 타입 파라미터 생략가능
TreeMap<Integer,String> map3 = new TreeMap<>(map1);//map1의 모든 값을 가진 TreeMap생성
TreeMap<Integer,String> map6 = new TreeMap<Integer,String>(){{//초기값 설정
    put(1,"a");
}};
map.remove(1); //key값 1 제거
map.clear(); //모든 값 제거
```
 생성하는 명령어는 HashMap과 크게 다르지 않으나 선언 시 크기를 지정해줄 수는 없다.

```java
System.out.println(map); //전체 출력 : {1=사과, 2=복숭아, 3=수박}
System.out.println(map.get(1));//key값 1의 value얻기 : 사과
System.out.println(map.firstEntry());//최소 Entry 출력 : 1=사과
System.out.println(map.firstKey());//최소 Key 출력 : 1
System.out.println(map.lastEntry());//최대 Entry 출력: 3=수박
System.out.println(map.lastKey());//최대 Key 출력 : 3
		
//entrySet().iterator()
Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
while(entries.hasNext()){
    Map.Entry<Integer, String> entry = entries.next();
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:복숭아
//[Key]:3 [Value]:수박
		
//keySet().iterator()
Iterator<Integer> keys = map.keySet().iterator();
while(keys.hasNext()){
    int key = keys.next();
    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:복숭아
//[Key]:3 [Value]:수박
}
```
<br>



***

참고 : [https://coding-factory.tistory.com/557](https://coding-factory.tistory.com/557)
