package BAEKJOON;

import java.util.Scanner;

public class Q_1316 {

	public static void main(String[] args) {
		// 그룹단어
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = N;
		
		for(int i = 0; i<N; i++) {
			String s = sc.next();
			int [] arr = new int[26];
			
			for(int j = 0; j<s.length(); j++) {
				if(arr[s.charAt(j) - 'a'] == 0) {
					arr[s.charAt(j) - 'a']++;
				}else if(j > 0 && s.charAt(j) != s.charAt(j-1)) {
					cnt --;
					break;
				}
			}
			
			
		}System.out.println(cnt);
		

	}

}
