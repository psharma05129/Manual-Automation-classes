package StringDataType;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello How are you doing Today?";
        int vowelCount = 0;

        // Convert to lowercase to handle both upper and lower case
        //input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
    }

	}


