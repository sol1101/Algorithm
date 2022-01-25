package BAEKJOON;

import java.util.Scanner;

public class Q_1157 {

	public static void main(String[] args) {
		//알파벳 대소문자로 된 단어가 주어지면,
		//이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
		//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
		//단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; //알파뱃 배열
		String S = sc.next().toUpperCase(); //단어 입력
		int max = 0; //가장 많은 문자 갯수
		char result = ' ';
		
		for(int i = 0; i<S.length(); i++) {
			arr[S.charAt(i)-'A']++; //입력받은 단어 중 해당 알파벳 카운트
		}
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				result = (char)(i+'A');
			}else if(max == arr[i]) {
				result ='?';
			}
		}System.out.println(result);
	}


}
