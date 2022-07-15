package bronze;

import java.util.Scanner;

public class Baekjoon1085 {
    public static void main(String[] args) {
        // bronze3
        Scanner sc = new Scanner(System.in);
        int[] now = {sc.nextInt(), sc.nextInt()};
        int[] end = {sc.nextInt(), sc.nextInt()};
        int first = 0;
        int second = 0;

        first = now[0] < end[0] - now[0] ? now[0] : end[0] - now[0];
        second = now[1] < end[1] - now[1] ? now[1] : end[1] - now[1];

        System.out.println(first > second ? second : first);
    }
}
