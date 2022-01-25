package BAEKJOON;

import java.util.Scanner;


public class Q_5622 {

	public static void main(String[] args) {
		//´ÙÀÌ¾ó
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toUpperCase();
		int time = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char check = s.charAt(i);
			
			if(check == 'A' || check == 'B' || check =='C')
				time +=3;
			else if(check == 'D' || check == 'E' || check =='F')
				time +=4;
			else if(check == 'G' || check == 'H' || check =='I')
				time +=5;
			else if(check == 'J' || check == 'K' || check =='L')
				time +=6;
			else if(check == 'M' || check == 'N' || check =='O')
				time +=7;
			else if(check == 'P' || check == 'Q' || check =='R' ||check == 'S')
				time +=8;
			else if(check == 'T' || check =='U' ||check == 'V' )
				time +=9;
			else if(check == 'W' || check =='X' || check == 'Y' || check == 'Z')
				time +=10;
		}
		System.out.println(time);
		
	}

}
