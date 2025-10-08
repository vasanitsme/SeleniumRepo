package week2.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

        // Split the string into words
        String[] words = text.split(" ");

        int count; // to track duplicate occurrences

        // Outer loop for each word
        for (int i = 0; i < words.length; i++) {
            count = 1;  // reset count for each word

            // Inner loop to compare with remaining words
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    count++;
                    // Replace duplicate word with empty string
                    words[j] = "";
                }
            }

            // If count > 1, it means duplicates were found
            if (count > 1 && !words[i].equals("")) {
                System.out.println("Duplicate word found: " + words[i]);
            }
        }

        // Print the final string with duplicates removed (empty replaced)
        System.out.println("\nOutput after removing duplicates:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

}
