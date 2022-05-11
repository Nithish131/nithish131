package week1.day4;

public class fibonacciseries {
	public static void main(String[] args) {
		int n = 8;
		int f = 0;
		int s = 1;
		int t;
		System.out.println(f);
		System.out.println(s);
		for (int i = 2; i<n; i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		
		
	}

}
