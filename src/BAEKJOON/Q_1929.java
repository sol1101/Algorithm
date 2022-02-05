package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1929 {

	public static void main(String[] args) throws IOException {
		// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = M; i<=N; i++) {
			boolean check = true;
			
			for(int j = 2; j<=(int)Math.sqrt(i); j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
				
			}if(check == true && i!=1) System.out.println(i);
		}
		
	}

}
