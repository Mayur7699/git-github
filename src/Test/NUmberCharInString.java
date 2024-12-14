package Test;

public class NUmberCharInString {

	public static void main(String[] args) {

		String test = "   Hi  @  Good morning";

		int count = 0;

		for (int i = 0; i < test.length(); i++) {

			count++;

		}
		System.out.println(count);

	}

}
