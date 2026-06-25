public class Q45 {
    public static void main(String[] args) {

        int num = 6561;

        int root = (int)Math.sqrt(num);

        if(root * root == num) {
            System.out.println("Square Root = " + root);
            System.out.println("Square Root = -" + root);
        }
        else {
            System.out.println("Not a Perfect Square");
        }
    }
}