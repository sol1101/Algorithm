package SWEA;

import java.util.Scanner;

public class Q_1936 {

	public static void main(String[] args) {
		// 1��1 ����������
		
		Scanner sc = new Scanner(System.in);
		//���� 1, ���� 2, �� 3
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A ==1 && B==2) System.out.println("B");
		else if(A==1 && B==3) System.out.println("A");

		if(A ==2 && B==3) System.out.println("B");
		else if(A==2 && B==1) System.out.println("A");

		if(A ==3 && B==1) System.out.println("B");
		else if(A==3 && B==2) System.out.println("A");
		
		
	}

}
