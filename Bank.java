import java.util.*;

class BankAccount {
    String bankName;
    String name;
    String accountNumber;
    double balance;
    double minimumBalance;

    BankAccount(String bankName, String name, String accountNumber,
                double balance, double minimumBalance) {

        this.bankName = bankName;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {

        if (balance - amount >= minimumBalance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Withdrawal not allowed.");
            System.out.println("You must maintain minimum balance of Rs."
                    + minimumBalance);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + maskAccountNumber());
        System.out.println("Balance: Rs." + balance);
        System.out.println("Minimum Balance: Rs." + minimumBalance);
    }

    String maskAccountNumber() {
        return accountNumber.replaceAll(".(?=.{4})","X");
    }
}

public class Bank{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, BankAccount> accounts = new HashMap<>();

        while (true) {

            System.out.println("\nBANK MENU");
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

                    System.out.println("\n SELECT BANK");
                    System.out.println("1. SBI");
                    System.out.println("2. HDFC Bank");
                    System.out.println("3. ICICI Bank");
                    System.out.println("4. Axis Bank");
                    System.out.println("5. Canara Bank");

                    System.out.print("Choose your bank: ");
                    int bankChoice = sc.nextInt();
                    sc.nextLine();

                    String bankName;
                    double minimumBalance;

                    switch (bankChoice) {

                        case 1:
                            bankName = "SBI";
                            minimumBalance = 1000;
                            break;

                        case 2:
                            bankName = "HDFC Bank";
                            minimumBalance = 5000;
                            break;

                        case 3:
                            bankName = "ICICI Bank";
                            minimumBalance = 2000;
                            break;

                        case 4:
                            bankName = "Axis Bank";
                            minimumBalance = 1500;
                            break;

                        case 5:
                            bankName = "Canara Bank";
                            minimumBalance = 500;
                            break;

                        default:
                            System.out.println("Invalid bank choice.");
                            continue;
                    }

                    System.out.println("Selected Bank: " + bankName);
                    System.out.println("Minimum Balance Required: Rs."
                            + minimumBalance);

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {

                        System.out.println("Account already exists.");

                    } else {

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                    
                        if (balance < minimumBalance) {

                            System.out.println(
                                    "Account cannot be created.");
                            System.out.println(
                                    "Minimum balance required is Rs."
                                            + minimumBalance);

                        } else {

                            BankAccount account = new BankAccount(bankName,name,accNo,balance,minimumBalance);
                            accounts.put(accNo, account);

                            System.out.println("Account created successfully.");

                            System.out.println( "Bank: " + bankName);

                            System.out.println(  "Account Number:"+ account.maskAccountNumber());
                        }
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

                    System.out.println(
                            "Thank you for using the bank.");

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}