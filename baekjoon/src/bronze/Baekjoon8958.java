package bronze;

import java.util.Scanner;

public class Baekjoon8958 {

	public static void main(String[] args) {
		//bronze2
		Scanner sc = new Scanner(System.in);
		int t_case = sc.nextInt();
		sc.nextLine();
		String[] arr_str = new String[t_case];
		int sum = 1;
		int result = 0;
		
		for(int i=0; i<t_case; i++) {
			arr_str[i] = sc.nextLine();
			
			for(int k=0; k<arr_str[i].length(); k++) {
				if(arr_str[i].charAt(k) == 'O') {
					result += sum;
					sum++;
				} else {
					sum = 1;
				}
			}
			
			System.out.println(result);
			
			sum = 1;
			result = 0;
		}
		
		sc.close();
	}
}
