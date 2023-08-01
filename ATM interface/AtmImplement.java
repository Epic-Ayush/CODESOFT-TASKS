import java.util.Scanner;

interface AtmInt {
    void withdrawing(int amt);

    void depositing(int amt);

    void checkingBalance();
}

class ATM implements AtmInt {
    int tAmt;

    public void withdrawing(int amt) {
        if (tAmt <= 0) {
            System.out.println("not sufficient balance for withdrawals");
        } else {

            if (amt >= tAmt) {
                System.out.println("not sufficient balance for withdrawals");
            } else {
                tAmt = tAmt - amt;
                System.out.println("Withdraw Successfully");
            }

        }
    }

    public void depositing(int amt) {
        tAmt = tAmt + amt;
        System.out.println("Diposit Successfully");
    }

    public void checkingBalance() {
        System.out.println("Total balance is : " + tAmt);
    }

}

public class AtmImplement {
    public static void main(String[] args) {
        ATM obj = new ATM();
        boolean b = true;
        String chk;
        int amt;
        int choice;
        Scanner sc = new Scanner(System.in);

        while (b) {
            System.out.println("Enter the choice \nPress 1 : For Withdrawing\nPress 2 : For Deposit\nPress 3 : For Checking Balance");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw : ");
                    amt = sc.nextInt();
                    obj.withdrawing(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit : ");
                    amt = sc.nextInt();
                    obj.depositing(amt);
                    break;
                case 3:
                    obj.checkingBalance();
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;

            }
            System.out.println("Again ?(yes/no)");
            chk = sc.next();
            if (!(chk.equals("yes") || chk.equals("Yes"))) {
                b = false;
            }
        }
    }
}