package bronze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baekjoon3052 {
	public static void main(String[] args) {
		// bronze2
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add(sc.nextInt()%42);			
		}
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(set.size());
	}
}
