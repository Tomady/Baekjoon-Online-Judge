package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        // silver4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int test_case = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<test_case; i++) {
            String str = br.readLine();

            if(str.length() > 5) {
                queue.add(Integer.parseInt(str.substring(5)));
                continue;
            } else if(str.equals("pop")) {
                if(queue.size() == 0) {
                    result = -1;
                } else {
                    result = queue.poll();
                }
            } else if(str.equals("size")) {
                result = queue.size();
            } else if(str.equals("empty")) {
                if(queue.isEmpty()) {
                    result = 1;
                } else {
                    result = 0;
                }
            } else if(str.equals("front")) {
                if(queue.isEmpty()) {
                    result = -1;
                } else {
                    result = queue.peek();
                }
            } else if(str.equals("back")) {
                if(queue.isEmpty()) {
                    result = -1;
                } else {
                    result = (int) queue.toArray()[queue.size()-1];
                }
            }

            System.out.println(result);
        }
    }
}
