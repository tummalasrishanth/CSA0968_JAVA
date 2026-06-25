public class Q7 {
    public static void main(String[] args) {

        String word = "Engineering";

        System.out.print("Vowels: ");

        for(int i=0;i<word.length();i++) {

            char ch = Character.toLowerCase(word.charAt(i));

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.print(ch + " ");
        }

        System.out.print("\nConsonants: ");

        for(int i=0;i<word.length();i++) {

            char ch = Character.toLowerCase(word.charAt(i));

            if(Character.isLetter(ch) &&
              !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                System.out.print(ch + " ");
        }
    }
}
