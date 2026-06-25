import java.util.*;

public class q16 {
    public static void main(String[] args) {

        int[][] mat = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 }
        };

        int k = 3;

        int m = mat.length;

        int[][] rows = new int[m][2];

        for (int i = 0; i < m; i++) {
            int soldiers = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    soldiers++;
            }

            rows[i][0] = soldiers;
            rows[i][1] = i;
        }

        Arrays.sort(rows, (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        System.out.print("[");

        for (int i = 0; i < k; i++) {
            System.out.print(rows[i][1]);

            if (i < k - 1)
                System.out.print(",");
        }

        System.out.println("]");
    }
}