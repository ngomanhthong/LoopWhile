package basic.dev;

import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		// 11.1.Viết chương trình tính tổng các sốtừ1 đến 100
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int tong = 0;
		while (i <= 100) {
			tong += i;
			i++;
		}
		/**
		 * 11.2.Viết chương tình nhập vào một sốtựnhiên n. Tính tổng các
		 * sốchia hết cho 3 béhơn n.
		 **/
		System.out.println(tong);
		System.out.println("----------");
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		int a = 0;
		int tong2 = 0;
		while (a < n) {
			a++;
			if (a % 3 == 0) {
				tong2 += a;
			}
		}

		System.out.println(tong2);
		// 11.3.Viết chương trình in ra 100sốFibonacciđầu tiên.
		int c = 100;
		long f0 = 0, f1 = 1, fn = 0;
		int f = 0;
		while (f <= c) {
			if (f < 2) {
				System.out.print(f + " ");
			} else {
				fn = f0 + f1;
				f0 = f1;
				f1 = fn;
				System.out.print(fn + " ");
			}
			f++;
		}

		/**
		 * 11.5.Viết chương trình liệt kê các sốtừ100 đến 999 cótổng các
		 * chữsốchia hết cho 3. Vídụ: 263cótổng: 2 + 6 + 3 = 9 chia hết cho 3,
		 * 135có1 + 3 + 5 = 9 chia hết cho 3
		 */
		int q = 1;
		int ketQua4;
		while (q <= 9) {
			int q1 = 0;
			while (q1 <= 9) {
				int q2 = 0;
				while (q2 <= 9) {
					ketQua4 = q + q1 + q2;
					if(ketQua4 % 3 == 0) {
						System.out.println(ketQua4);
					}
					q2++;
				}
				q1++;
			}
			q++;
		}
	}
}
