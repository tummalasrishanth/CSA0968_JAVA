public class q25 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1 };

        int ones = 0;
        for (int x : arr)
            ones += x;

        if (ones % 3 != 0) {
            System.out.println("[-1, -1]");
            return;
        }

        if (ones == 0) {
            System.out.println("[0, " + (arr.length - 1) + "]");
            return;
        }

        int k = ones / 3;
        int first = -1, second = -1, third = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count == 1)
                    first = i;
                if (count == k + 1)
                    second = i;
                if (count == 2 * k + 1)
                    third = i;
            }
        }

        while (third < arr.length &&
                arr[first] == arr[second] &&
                arr[second] == arr[third]) {
            first++;
            second++;
            third++;
        }

        if (third == arr.length)
            System.out.println("[" + (first - 1) + ", " + second + "]");
        else
            System.out.println("[-1, -1]");
    }
}