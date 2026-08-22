import java.util.*;

class BankAccount {
    String name;
    String accountNumber;
    double balance;

    BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + maskAccountNumber());
        System.out.println("Balance: Rs." + balance);
    }

    String maskAccountNumber() {
        return "xxxxxxxx" + accountNumber.substring(accountNumber.length() - 4);
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // HashMap stores multiple bank accounts
        HashMap<String, BankAccount> accounts = new HashMap<>();

        while (true) {

            System.out.println("\n BANK MENU");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        System.out.println("Account already exists.");
                    } else {
                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        BankAccount account =
                                new BankAccount(name, accNo, balance);

                        accounts.put(accNo, account);

                        System.out.println("Account created successfully.");
                        System.out.println("Account Number: " +
                                account.maskAccountNumber());
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();

                        accounts.get(accNo).deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                 }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextDouble();

                        accounts.get(accNo).withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        accounts.get(accNo).checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        accounts.get(accNo).display();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the bank.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}