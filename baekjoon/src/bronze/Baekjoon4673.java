package bronze;

public class Baekjoon4673 {
	public static void main(String[] args) {
		int num = 1;
		
		while(num < 100) {
			if(num < 10) {
				num = num + 2;
				System.out.println(num);
			} else if(num < 100) {
				num = num + num/10 + num%10;
				System.out.println(num);				
			}
		}
	}
}
