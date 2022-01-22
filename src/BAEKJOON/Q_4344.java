package BAEKJOON;

import java.util.Scanner;

public class Q_4344 {

	public static void main(String[] args) {
		//평균을 넘는 학생들의 비율
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0; i<C; i++) {
			double sum = 0;
			double stu = 0;
			double [] N = new double[sc.nextInt()];
			
			for(int j = 0; j<N.length; j++) {
				N[j] = sc.nextDouble();
				sum += N[j];	
			}
			
			for(int j = 0; j<N.length; j++) {
				if(N[j] > (sum/N.length)) {
					stu ++;
				}
			}
			System.out.printf("%.3f%%\n", (stu/N.length)*100);
		}

	}

}
