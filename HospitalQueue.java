import java.util.LinkedList;

public class HospitalQueue {
    public static void main(String[] args) {

        LinkedList<String> patients = new LinkedList<>();

        patients.addLast("Ravi");
        patients.addLast("Priya");

        patients.addFirst("Arun");

        System.out.println("Patient Queue: " + patients);

        System.out.println("Consulting: " + patients.removeFirst());

        System.out.println("Remaining Queue: " + patients);
    }
}