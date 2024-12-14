package Test;

public class ReverseArray {

	public static void main(String[] args) {

		int[] test = { 3, 6, 8, 4, 3, 2, 2, 2, 7, 9, 6 };

		int t = test.length;

		System.out.println(t);

		for (int i = t - 1; i > 0; i--) {

			System.out.println(test[i]);

		}
	}

}
