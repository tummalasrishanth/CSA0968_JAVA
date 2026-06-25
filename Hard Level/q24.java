public class q24 {
    public static void main(String[] args) {
        String s = "aabbc";

        int cuts = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i += 2; // palindrome pair
            } else {
                i++;
            }
            if (i < s.length())
                cuts++;
        }

        System.out.println("Output = " + cuts);
    }
}