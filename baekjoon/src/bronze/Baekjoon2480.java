package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];
		int money = 0;
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		
		if(num[0] == num[1] && num[1] == num[2]) {
			money = 10000 + (num[0]*1000);
		} else if(num[0] == num[1]) {
			money = 1000 + (num[0]*100);
		} else if(num[0] == num[2]) {
			money = 1000 + (num[0]*100);
		} else if(num[1] == num[2]) {
			money = 1000 + (num[1]*100);
		} else {
			Arrays.sort(num);
			money = num[2]*100;
		}
		
		System.out.println(money);
		
		sc.close();
	}

}
