package Test;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n;
		int n1 = 0;
		int nTotal = 0;
		int num = 153;
		while (num >= 1) {

			n = num % 10;
			nTotal = nTotal + (n * n * n);
			num = num / 10;

		}

		System.out.println(nTotal);

	}
}
