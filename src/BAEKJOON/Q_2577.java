package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2577 {

	public static void main(String[] args) throws IOException {
		//3���� �ڿ����� �Է¹޾� ���� ������� 0~9 ������ ���ڰ� ���� ��� �������� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int x = A*B*C;
		int result[] = new int[10];
		while(x>0) {
			result[x%10]++;
			x /= 10;
		}
		for(int i = 0; i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
