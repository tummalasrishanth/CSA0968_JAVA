public class Q31 {
    static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        int arr[] = {16, 20};

        int gcdResult = arr[0];
        int lcmResult = arr[0];

        for(int i = 1; i < arr.length; i++) {
            gcdResult = gcd(gcdResult, arr[i]);
            lcmResult = lcm(lcmResult, arr[i]);
        }

        System.out.println("GCD = " + gcdResult);
        System.out.println("LCM = " + lcmResult);
    }
}