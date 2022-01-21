package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q_3052 {
	//42로 나눈 서로 다른 나머지의 갯수
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i<10;i++) {
			hs.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(hs.size());
	}

}
