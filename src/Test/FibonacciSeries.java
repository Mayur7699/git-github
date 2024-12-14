package Test;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8

		int n1 = 0;
		int n2 = 1;
		int temp = 0;

		System.out.println(n1);
		System.out.println(n2);

		for (int i = 0; i < 10; i++) {

			temp = n1 + n2;
			System.out.println(temp);

			n1 = n2;
			n2 = temp;

		}

	}

}
