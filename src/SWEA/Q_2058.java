package SWEA;

import java.util.Scanner;

public class Q_2058 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
        
        System.out.println((N/1000) + (N%1000/100) + (N%100/10) + (N%10));

	}

}
