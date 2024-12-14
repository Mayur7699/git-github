package Test;

public class Swap2Strings {

	public static void main(String[] args) {

		String first = "GUPSHUP";
		String second = "META";

		String temp = "";

		temp = first;
		first = second;
		second = temp;

		System.out.println(temp);
		System.out.println(first);

		System.out.println(second);

	}
}
