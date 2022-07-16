package silver;

import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) {
        // silver5
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();

        for(int i=0; i<test_case; i++) {
            String str = sc.nextLine();
            list.add(str);
        }

        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        Collections.sort(list);
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

        for(String str : list) {
            System.out.println(str);
        }
    }
}
