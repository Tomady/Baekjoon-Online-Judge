package bronze;

public class Baekjoon15596 {
	public static void main(String[] args) {
		long[] num = {10, 20, 30, 40, 50};
		
		System.out.println("결과값 : " + sum(num));
	}
	
	public static long sum(long[] a) {
		/* 이 부분을 코드 작성하시오 */
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		return sum;	
	}
}

