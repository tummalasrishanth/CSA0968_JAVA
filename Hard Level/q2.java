import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Users: ");
        int totalUsers = sc.nextInt();

        System.out.print("Staff Users: ");
        int staffUsers = sc.nextInt();

        if (totalUsers < 0 || staffUsers < 0) {
            System.out.println("Invalid Input");
            return;
        }

        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - (staffUsers + nonTeachingStaff);

        if (studentUsers < 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Student Users: " + studentUsers);
        }
    }
}