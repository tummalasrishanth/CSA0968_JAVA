public class Q10 {
    public static void main(String[] args) {

        String str = "we can play the game";

        String result = "";

        for(int i=0;i<str.length();i++) {

            char ch = str.charAt(i);

            if("AEIOUaeiou".indexOf(ch)==-1)
                result += ch;
        }

        System.out.println(result);
    }
}
