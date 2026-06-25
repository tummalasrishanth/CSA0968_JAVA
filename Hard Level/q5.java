import java.util.ArrayList;

public class q5 {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int lower = 1; // Direct Input
        int upper = 40; // Direct Input

        if (lower < 0 || upper < 0 || lower > upper) {
            System.out.println("Invalid Input");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i && digitSum(i) < 10) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}