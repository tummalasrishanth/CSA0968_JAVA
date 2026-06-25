public class q17 {

    public static void main(String[] args) {

        int num = 14; // Direct Input

        if (num < 0) {
            System.out.println("Invalid Input");
            return;
        }

        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }

        System.out.println(steps);
    }
}