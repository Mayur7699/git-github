package Test;

public class Generateaabbbcccc {
	
	public static void main(String[] args) {
		
        String input = "a2b3c4";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                char nextChar = input.charAt(i + 1);
                int repeat = Character.getNumericValue(nextChar);
                for (int j = 0; j < repeat; j++) {
                    output.append(currentChar);
                }
                i++; // Skip the numeric character
            }
        }

        System.out.println(output.toString());
    }
}
