package day4strings;

public class StringProblems {

    // 1. Reverse a string
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 2. Check palindrome
    static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    // 3. Check anagram
    static boolean isAnagram(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        // Reverse
        System.out.println("Reverse of 'hello': " + reverse("hello"));

        // Palindrome
        System.out.println("Is 'madam' a palindrome? " + isPalindrome("madam"));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));

        // Anagram
        System.out.println("Are 'listen' and 'silent' anagrams? " + isAnagram("listen", "silent"));
        System.out.println("Are 'hello' and 'world' anagrams? " + isAnagram("hello", "world"));
    }
}