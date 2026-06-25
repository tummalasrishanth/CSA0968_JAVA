public class q13 {

    public static void main(String[] args) {

        String s = "Hello World"; // Direct Input

        s = s.trim();

        if (s.length() == 0) {
            System.out.println("Invalid Input");
            return;
        }

        String[] words = s.split("\\s+");
        String lastWord = words[words.length - 1];

        System.out.println(lastWord.length());
    }
}