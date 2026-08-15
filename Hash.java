import java.util.HashMap;
import java.util.Scanner;

class PhoneDirectory {
    public static void main(String[] args) {

        HashMap<String, String> phone = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        phone.put("Arun", "9876543210");
        phone.put("Kumar", "9876501234");
        phone.put("Ravi", "9123456780");

        int choice;

        do {
            System.out.println("\n1. Search Contact");
            System.out.println("2. Add Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    if (phone.containsKey(name)) {
                        System.out.println("Phone Number: " + phone.get(name));
                    } else {
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String number = sc.nextLine();

                    phone.put(newName, number);
                    System.out.println("Contact Added");
                    break;

                case 3:
                    System.out.print("Enter Name to Remove: ");
                    String removeName = sc.nextLine();

                    if (phone.containsKey(removeName)) {
                        phone.remove(removeName);
                        System.out.println("Contact Removed");
                    } else {
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 4:
                    System.out.println(phone);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}

