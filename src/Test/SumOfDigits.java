package Test;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 3532311;
		
	String l=	Integer.toString(num);
	
		int sum = 0;

		for (int i = 0; i < l.length(); i++) {
			int digit = num % 10;

			sum = sum + digit;
			num = num / 10;

		}
		System.out.println(sum);
	}

}
