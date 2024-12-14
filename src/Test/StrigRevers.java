package Test;

public class StrigRevers {
	public static void main(String[] args) {

		String s = "GUPSHUP";
		StringBuilder b = new StringBuilder();
		System.out.println(s.length());

		for (int i = s.length() - 1; i >= 0; i--) {

			b.append(s.charAt(i));

		}
		System.out.println(b.toString());
	}

}
