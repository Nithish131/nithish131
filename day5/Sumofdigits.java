package week1.day5;

public class Sumofdigits {
	public static void main(String[] args) {
		int input = 654,sum=0,rem;
	
       while (input>0) {
		rem = input%10;
		sum = sum+rem;
		input = input/10;
		
		
	}
		System.out.println(sum);
	}

}
