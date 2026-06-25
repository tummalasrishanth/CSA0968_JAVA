public class Q15 {
    public static void main(String[] args) {

        int arr[] = {16,18,27,16,23,21,19};

        int countComposite = 0;

        for(int num : arr) {

            int factors = 0;

            for(int i=1;i<=num;i++) {
                if(num % i == 0)
                    factors++;
            }

            if(factors > 2)
                countComposite++;
        }

        System.out.println("Composite Numbers = " + countComposite);
    }
}