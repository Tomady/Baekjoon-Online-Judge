package bronze;

import java.util.Scanner;

public class Baekjoon1259 {
    public static void main(String[] args) {
        // bronze1
        Scanner sc = new Scanner(System.in);
        String str = "";
        String result = "yes";

        while (true) {
            str = sc.nextLine();

            if(str.equals("0")) {
                break;
            }

            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == str.charAt(str.length()-i-1)) {
                    result = "yes";
                } else {
                    result = "no";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
