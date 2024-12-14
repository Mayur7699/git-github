package Test;

public class CountCapitalWords {

	public static void main(String[] args) {

		String word = "HJnfyJYTHjehfehebnGood";

		// String[] split = word.split(" ");
		int counter = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {

				counter++;

			}

		}
		System.out.println("Total count is =" + counter);

	}
}
