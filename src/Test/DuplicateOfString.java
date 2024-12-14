package Test;

public class DuplicateOfString {

    public static void main(String[] args) {

        String original = "Good morning Good evening Good";
        String[] split = original.split(" ");
        System.out.println("Total words: " + split.length);

        boolean hasDuplicates = false;

        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].trim().equalsIgnoreCase(split[j].trim())) {
                    hasDuplicates = true;
                    System.out.println("Duplicate word found: " + split[i]);
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
