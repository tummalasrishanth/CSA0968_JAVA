public class Q53 {
    public static void main(String[] args) {

        int choice = 1;

        do {

            switch(choice) {

                case 1:
                    System.out.println(
                     "if(condition){ }");
                    break;

                case 2:
                    System.out.println(
                     "for(initialization;condition;increment){ }");
                    break;
            }

            choice++;

        } while(choice <= 2);
    }
}