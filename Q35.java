public class Q35 {
    public static void main(String[] args) {

        int M = 50;
        int N = 100;
        int K = 7;

        for(int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + " ");
        }
    }
}