package BAEKJOON;

import java.util.Scanner;

public class Q_2798 {

	public static void main(String[] args) {
		// ����
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int [N];
		int max = 0; // �ִ�
		int sum = 0; // �� ���� ��
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N-2; i++) { // 3���� ī�带 ���ϱ� ó�� ī��� N-2���� Ȯ��
			for(int j = i+1; j<N-1; j++) { // ù��° ī�� �������� N-1���� Ȯ��
				for(int k = j+1; k<N; k++) { // �ι�° ī�� �������� N���� Ȯ��
					sum = arr[i] + arr[j] + arr[k];
					if(max < sum && sum <= M) max = sum;
				}
			}
		}System.out.println(max);
		

	}

}
