package bronze;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2232 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 지뢰 갯수
		int N = sc.nextInt();
		int[] p = new int[N];
		List<Integer> result = new ArrayList<Integer>();
		
		setting(p);
		System.out.println("====연쇄 폭발 시작====");
		
		while(!chk(p)) {
			System.out.println("---aa---");
			int index = maxVal(p);
			result.add(index);
			explosion(p, index);			
		}
		
		// 출력
		System.out.print("지뢰 충격 강도 : [ ");
		for(int num : p) {
			System.out.print(num + " ");
		}
		System.out.println("]");
		
		System.out.println("정답");
		result.sort(Comparator.naturalOrder());
		
		for(int num : result) {
			System.out.println(num + 1);
		}
	}
	
	public static void setting(int[] p) {
		for(int i=0; i<p.length; i++) {
			int num = sc.nextInt();
			
			p[i] = num;
		}
	}
	
	public static int maxVal(int[] p) {
		int max = 0;
		int index = 0;
		
		for(int i=0; i<p.length; i++) {
			if(max < p[i]) {
				max = p[i];
				index = i;
			}
		}
		
		// 출력
		System.out.print("지뢰 충격 강도 : [ ");
		for(int num : p) {
			System.out.print(num + " ");
		}
		System.out.println("]");
		
		System.out.println("최대 강도: " + max);
		System.out.println("최대 강도 위치: " + index);
		
		return index;
	}
	
	public static boolean chk(int[] p) {
		for(int num : p) {
			if(num != 0) {
				return false;
			}
		}
		
		return true;
	}
		
	public static void explosion(int[] p, int index) {
		System.out.println("인덱스: " + index);
		
		while(true) {
			try {
				if(index != 0) {
					if(p[index] > p[index-1]) {
						explosion(p, index-1);
					}					
				}
				
				if(p[index] > p[index+1]) {
					explosion(p, index+1);
				}
			} catch (IndexOutOfBoundsException e) {
				
			}
			
			p[index] = 0;
			
			break;
		}
	}
}