package bronze;

import java.util.Scanner;

public class Baekjoon2475 {
    public static void main(String[] args) {
        // bronze5
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        for(int i=0; i<5; i++) {
            num[i] = sc.nextInt();
            sum = sum + (num[i] * num[i]);
        }

        System.out.println(sum%10);
    }
}
