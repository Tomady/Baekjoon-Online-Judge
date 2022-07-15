package bronze;

import java.util.Scanner;

public class Baekjoon2908 {
    public static void main(String[] args) {
        // bronze2
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int revers1 = num1%100%10*100 + num1%100/10*10 + num1/100;
        int revers2 = num2%100%10*100 + num2%100/10*10 + num2/100;

        System.out.println(revers1 > revers2 ? revers1 : revers2);
    }
}
