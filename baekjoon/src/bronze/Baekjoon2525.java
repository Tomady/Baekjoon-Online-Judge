package bronze;

import java.util.Scanner;

public class Baekjoon2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int add = sc.nextInt();
		
		hour = hour + add/60;
		min = min + add%60;
		
		if(min >= 60) {
			min = min - 60;
			hour = hour + 1;
		}
		
		if(hour >= 24) {
			hour = hour%24;
		}
		
		System.out.println(hour + " " + min);
		
		sc.close();
	}

}
