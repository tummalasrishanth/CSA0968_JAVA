public class Q30 {
    public static void main(String[] args) {

        int age = 7;

        if(age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("You are allowed to vote after "
                    + (18-age) + " years");
    }
}