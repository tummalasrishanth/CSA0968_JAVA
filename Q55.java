class Overload {

    void display(int a) {
        System.out.println("One Value = " + a);
    }

    void display(int a, int b) {
        System.out.println("Two Values = "
                + a + " " + b);
    }

    void display(int a, int b, int c) {
        System.out.println("Three Values = "
                + a + " " + b + " " + c);
    }
}

public class Q55 {
    public static void main(String[] args) {

        Overload obj = new Overload();

        obj.display(10);
        obj.display(10,20);
        obj.display(10,20,30);
    }
}