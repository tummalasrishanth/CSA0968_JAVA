class BankAccount {
    int accNo;
    String name;
    char type;
    double balance = 10000;

    BankAccount(int accNo, String name, char type) {
        this.accNo = accNo;
        this.name = name;
        this.type = type;
    }

    void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Balance Amount: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number : " + accNo);
        System.out.println("Depositor Name : " + name);
        System.out.println("Account Type   : " + type);
        System.out.println("Balance Amount : " + balance);
    }
}

public class q8 {
    public static void main(String[] args) {

        int accNo = 100;
        String name = "Raja";
        char type = 'S';
        double withdrawAmount = 8000;

        if (!(type == 'S' || type == 'C')) {
            System.out.println("Invalid Account Type");
            return;
        }

        BankAccount acc = new BankAccount(accNo, name, type);

        acc.display();
        acc.withdraw(withdrawAmount);
    }
}