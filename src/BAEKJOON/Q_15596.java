package BAEKJOON;

public class Q_15596 {
		//정수 N개의 합
		
		long sum(int[] a) {
			long sum = 0;
			for(int i = 0; i<a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
	}


