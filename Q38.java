public class Q38 {
    public static void main(String[] args) {

        String date = "04/11/1947";

        String parts[] = date.split("/");

        int year = Integer.parseInt(parts[2]);

        if((year % 400 == 0) ||
           (year % 4 == 0 && year % 100 != 0))
            System.out.println("Given year is Leap Year");
        else
            System.out.println("Given year is Non Leap Year");
    }
}