public class Q29 {
    public static void main(String[] args) {

        int num = 11;

        String binary = Integer.toBinaryString(num);

        String rev = "";

        for(int i=binary.length()-1;i>=0;i--)
            rev += binary.charAt(i);

        int result = Integer.parseInt(rev,2);

        System.out.println(result);
    }
}