import java.util.*;

public class A08_EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        List<Integer> evens = new ArrayList<>(), odds = new ArrayList<>();
        for (int num : arr) { if (num % 2 == 0) evens.add(num); else odds.add(num); }
        System.out.println("Even elements: " + evens);
        System.out.println("Odd elements : " + odds);
        sc.close();
    }
}
