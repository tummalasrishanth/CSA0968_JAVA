public class Q8 {
     public static void main(String[] args) {

        String str = "I am a programmer";
        char search = 'p';

        boolean found = false;

        for(int i=0;i<str.length();i++) {

            if(str.charAt(i)==search) {
                System.out.println("Found at index : " + i);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Character not found");
    }
}
