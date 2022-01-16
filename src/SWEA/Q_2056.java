package SWEA;

import java.util.Scanner;

public class Q_2056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String ymd = sc.next();
			int y = Integer.parseInt(ymd.substring(0,4));
			int m = Integer.parseInt(ymd.substring(4,6));
			int d = Integer.parseInt(ymd.substring(6,8));
			
			switch(m) {
			case 1:case 3: case 5: case 7: case 8: case 10: case 12:
				if(d < 1 || d>31) {
					System.out.println("#" + test_case +" "+ "-1");
					break;
				}
			case 2:
				if(d<1 || d>28) {
					System.out.println("#" + test_case +" "+ "-1");
					break;
				}
			case 4: case 6: case 9:case 11:
				if(d<1 || d>30) {
					System.out.println("#" + test_case +" "+ "-1");
					break;
				}
			default:
				if(m<1 || m>12) {
					System.out.println("#" + test_case +" "+ "-1");
					break;
				}
				System.out.printf("#%d %04d/%02d/%02d\n", test_case, y, m, d);
			}

		}
	}

}
