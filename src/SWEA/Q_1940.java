package SWEA;

import java.util.Scanner;

public class Q_1940 {

	public static void main(String[] args) {
		// RCī
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt(); // command , ��
			int speed = 0;
			int distance = 0;
			
			for(int i = 0; i<N; i++) {
				int state = sc.nextInt(); // ���� ����
				
				if(state == 1) speed += sc.nextInt();
				else if(state == 2) speed -= sc.nextInt();
				else if(state == 0);
				if(speed<0) speed = 0;
				distance += speed;
			}
	
			System.out.println("#" + tc + " " + distance);
		}
	}

}
