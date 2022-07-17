package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon10866 {
    public static void main(String[] args) throws IOException {
        // silver4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        int result = 0;

        for(int i=0; i<test_case; i++) {
            String[] str = br.readLine().split(" ");

            if(str[0].equals("push_front")) {
                deque.addFirst(Integer.parseInt(str[1]));
                continue;
            } else if(str[0].equals("push_back")) {
                deque.addLast(Integer.parseInt(str[1]));
                continue;
            } else if(str[0].equals("pop_front")) {
                if(!deque.isEmpty()) {
                    result = deque.pollFirst();
                } else {
                    result = -1;
                }
            } else if(str[0].equals("pop_back")) {
                if(!deque.isEmpty()) {
                    result = deque.pollLast();
                } else {
                    result = -1;
                }
            } else if(str[0].equals("size")) {
                result = deque.size();
            } else if(str[0].equals("empty")) {
                if(!deque.isEmpty()) {
                    result = 0;
                } else {
                    result = 1;
                }
            } else if(str[0].equals("front")) {
                if(!deque.isEmpty()) {
                    result = deque.getFirst();
                } else {
                    result = -1;
                }
            } else if(str[0].equals("back")) {
                if(!deque.isEmpty()) {
                    result = deque.getLast();
                } else {
                    result = -1;
                }
            }

            System.out.println(result);
        }
    }
}
