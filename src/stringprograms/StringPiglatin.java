package stringprograms;

public class StringPiglatin {
    public static void main(String[] args) {
        String input = "Hello world";
        String[] words = input.split(" ");
        StringBuilder pigLatin = new StringBuilder();

        for (String word : words) {
            pigLatin.append(encodeToPigLatin(word)).append(" ");
        }

        System.out.println(pigLatin.toString().trim());
    }

    public static String encodeToPigLatin(String word) {
        char firstLetter = word.charAt(0);
        String pigLatinWord = word.substring(1) + firstLetter + "ay";
        return pigLatinWord.toLowerCase();
    }
}
