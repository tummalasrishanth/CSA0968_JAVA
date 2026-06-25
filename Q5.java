public class Q5 {public static void main(String[] args) {

        String str = "Saveetha@123#$";

        int count = 0;

        System.out.print("Special Characters: ");

        for(int i=0;i<str.length();i++) {

            char ch = str.charAt(i);

            if(!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nCount = " + count);
    }
}
