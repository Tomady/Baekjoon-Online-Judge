package bronze;

import java.util.Scanner;

public class Baekjoon2920 {
    public static void main(String[] args) {
        // bronze2
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        String result = "";

        for(int i=0; i<8; i++) {
            num[i] = sc.nextInt();

            if(num[0] == 1) {
                result = "ascending";
            } else if(num[0] == 8) {
                result = "descending";
            }

            if(num[i] == i+1 && result.equals("ascending")) {
                result = "ascending";
            } else if(num[i] == 8-i && result.equals("descending")) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}
