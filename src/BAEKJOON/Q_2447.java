package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Q_2447 {
	
	static char[][] arr;
	public static void main(String[] args) {
		// �����
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new char[n][n];
		// �迭 ����ó��
		for(int i = 0; i<n; i++) {
			Arrays.fill(arr[i], ' ');
		}
		// �޼ҵ� ����
		check(0,0,n);
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}

	
	}
	
	static void check(int x, int y, int num) { // ����� �޼ҵ�
		//�������� ������ * ����
		if(num == 1) {
			arr[x][y] = '*';
			return;
		}
		int s = num/3;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i==1 && j==1) {
					continue;
				}
				check(x+s*i, y+s*j, s);
			}
		}
	}
}
