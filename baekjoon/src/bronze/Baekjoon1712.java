package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1712 {
    public static void main(String[] args) throws IOException {
        // bronze2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        long A = Long.parseLong(num[0]);
        long B = Long.parseLong(num[1]);;
        long C = Long.parseLong(num[2]);;
        long cnt = 1;
        long result = 0;

        if(B >= C) {
            result = -1;
        } else {
            result = A/(C-B)+1;
        }

        System.out.println(result);
    }
}
