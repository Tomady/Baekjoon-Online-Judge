package bronze;

import java.util.Scanner;

public class Baekjoon2231 {
    public static void main(String[] args) {
        // bronze2
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String num = "";
        int result = 0;

        for(int i=N; i>0; i--) {
            num = Integer.toString(i);
            sum = 0;

            for(int k=0; k<num.length(); k++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(k)));
            }

            if(i + sum == N) {
                result = i;
            }
        }

        System.out.println(result);
    }
}
