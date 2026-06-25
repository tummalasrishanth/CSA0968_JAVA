interface Marks {
    void calculate();
}

interface Grade {
    void displayGrade();
}

class Student implements Marks, Grade {

    int python, c, maths, physics, chemistry, ethics;
    int total;
    double aggregate;

    Student(int python, int c, int maths,
            int physics, int chemistry, int ethics) {

        this.python = python;
        this.c = c;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.ethics = ethics;
    }

    public void calculate() {

        if (python < 0 || python > 100 ||
                c < 0 || c > 100 ||
                maths < 0 || maths > 100 ||
                physics < 0 || physics > 100 ||
                chemistry < 0 || chemistry > 100 ||
                ethics < 0 || ethics > 100) {

            System.out.println("Invalid Input");
            return;
        }

        total = python + c + maths + physics + chemistry + ethics;
        aggregate = total / 6.0;

        System.out.println("Total = " + total);
        System.out.printf("Aggregate = %.2f\n", aggregate);

        displayGrade();
    }

    public void displayGrade() {

        if (aggregate > 75)
            System.out.println("Class: DISTINCTION");
        else if (aggregate >= 60)
            System.out.println("Class: FIRST DIVISION");
        else if (aggregate >= 50)
            System.out.println("Class: SECOND DIVISION");
        else if (aggregate >= 40)
            System.out.println("Class: THIRD DIVISION");
        else
            System.out.println("Class: FAIL");
    }
}

public class q18 {
    public static void main(String[] args) {

        Student s = new Student(
                90, 91, 92,
                93, 92, 93);

        s.calculate();
    }
}