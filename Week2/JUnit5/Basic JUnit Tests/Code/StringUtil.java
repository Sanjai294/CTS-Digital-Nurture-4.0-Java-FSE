package Exercise2;

public class StringUtil {

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public int countVowels(String input) {
        if (input == null) return 0;
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
