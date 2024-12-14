package Test;

public class SecondLargestNUMinArray {

	public static void main(String[] args) {

		int[] array = { 5, 1, 3, 8, 9, 0, 2, 6, 4 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

				}
				System.out.println(array[i]);

			}

		}

	}

}
