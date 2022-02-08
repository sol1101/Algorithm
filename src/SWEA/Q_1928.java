package SWEA;

import java.util.Base64;
import java.util.Scanner;

public class Q_1928 {

	public static void main(String[] args) {
		// Base64 Decoder
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			String encoding = sc.next();
			String decoding = new String(Base64.getDecoder().decode(encoding));
			
			System.out.println("#"+i+" " + decoding);
		}
		

	}

}
