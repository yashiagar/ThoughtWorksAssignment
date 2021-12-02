import java.util.Scanner;

public class Bharatbank {
    private int balance;
    private final String type;

    Bharatbank(int balance, String type) {
        this.balance = balance;
        this.type = type;
    }

    public void deposite(int val) {
        this.balance += val;
    }

    public void withdraw(int val) {
        this.balance += quaterlyinterest();

        if (this.balance >= val) {
            this.balance -= val;
        } else {
            if (this.type.equalsIgnoreCase("current") && this.balance > 0 && val <= this.balance * 1.2) {
                this.balance -= val;
            } else {
                System.out.println("Not possible");
            }
        }
    }

    public double quaterlyinterest() {
        double savingrate = 3;
        if (this.type.equalsIgnoreCase("current")) {
            return 0;
        } else {
            return (this.balance * 0.03 * 0.25);
        }
    }

    public static void main(String args[]) {
        Bharatbank gopal = new Bharatbank(50000, "current");
        Bharatbank amrita = new Bharatbank(1000000, "saving");
        gopal.deposite(10000);
        System.out.println("Gopal balance:" + gopal.quaterlyinterest());
        gopal.withdraw(70000);
        amrita.withdraw(45000);
        System.out.println("Amrita balance:" + amrita.quaterlyinterest());
    }
}
