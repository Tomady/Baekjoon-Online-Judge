package bronze;

import java.util.*;

public class Baekjoon1157 {

	public static void main(String[] args) {
		// bronze1
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int[] arr = new int[26];
		int max = -1;
		char result = '?';

		for(int i=0; i<str.length(); i++) {
			int index = str.charAt(i)-65;

			arr[index]++;

			if(max < arr[index]) {
				max = arr[index];
				result = str.charAt(i);
			} else if(max == arr[index]) {
				result = '?';
			}
		}

		System.out.println(result);

		sc.close();
	}
}
