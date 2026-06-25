public class q14 {

    static int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {

        String s = "III"; // Direct Input

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            if (current == -1) {
                System.out.println("Invalid Input");
                return;
            }

            if (i < s.length() - 1) {
                int next = value(s.charAt(i + 1));

                if (current < next)
                    result -= current;
                else
                    result += current;
            } else {
                result += current;
            }
        }

        System.out.println(result);
    }
}