import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Telephone Number (with STD code): ");
        String telephone = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Head of the Family: ");
        String head = sc.nextLine();

        System.out.print("Enter Unique ID Number: ");
        String uniqueId = sc.nextLine();

        System.out.println("\n----- DIRECTORY INFORMATION -----");
        System.out.println("Name             : " + name);
        System.out.println("Address          : " + address);
        System.out.println("Telephone Number : " + telephone);
        System.out.println("Mobile Number    : " + mobile);
        System.out.println("Head of Family   : " + head);
        System.out.println("Unique ID Number : " + uniqueId);

        sc.close();
    }
}