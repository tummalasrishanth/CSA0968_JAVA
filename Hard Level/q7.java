public class q7 {

    public static void main(String[] args) {

        int lower = 45; // Direct Input
        int upper = 49; // Direct Input

        if (lower < 0 || upper < 0 || lower > upper) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.print("[");

        for (int i = lower; i <= upper; i++) {
            System.out.print("(" + i + ", " + (i * i) + ")");

            if (i < upper) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}