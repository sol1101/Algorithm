package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2869 {

	public static void main(String[] args) throws IOException {
		/* �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
		 * �����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. 
		 * ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
		 * �����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ� */

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V-B) / (A-B);
		
		if((V-B)%(A-B) != 0) {
			day ++;
		}
		System.out.println(day);
		
		
	}

}
