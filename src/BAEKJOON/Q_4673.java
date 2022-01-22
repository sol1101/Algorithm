package BAEKJOON;

public class Q_4673 {


	public static void main(String[] args) {
		// ¼¿ÇÁ³Ñ¹ö
		int [] self = new int[10001];
		
		for(int i = 1; i<=10000; i++) {
			int n = d(i);
			if(n<=10000) {
				self[n] = 1;
			}
		}
		for(int i = 1; i<=10000; i++) {
			if(self[i] == 0) {
				System.out.println(i);
			}
		}
		

	}

	
	static int d(int n) {
		int sum = n;
		
		while(n>0) {
			sum += (n%10);
			n /= 10;
		}
		return sum;
	}
}
