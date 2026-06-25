public class q15 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);

            if (!Character.isLetter(ch)) {
                return false;
            }

            count[Character.toLowerCase(ch) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (!Character.isLetter(ch)) {
                return false;
            }

            count[Character.toLowerCase(ch) - 'a']--;

            if (count[Character.toLowerCase(ch) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";

        System.out.println(canConstruct(ransomNote, magazine));
    }
}