import java.util.Scanner;

class HotelBooking {

    Scanner sc = new Scanner(System.in);

    String[] customerName = new String[10];
    String[] checkInDate = new String[10];
    String[] roomType = new String[10];

    int[] days = new int[10];
    double[] roomPrice = new double[10];

    boolean[] booked = new boolean[10];

    void viewRooms() {

        System.out.println("\n ROOM STATUS");

        for (int i = 0; i < 10; i++) {

            if (booked[i]) {
                System.out.println("Room " + (i + 1) + " - Booked - " + roomType[i]);
            } else {
                System.out.println("Room " + (i + 1) + " - Available");
            }
        }
    }

    void checkIn() {

        viewRooms();

        System.out.print("\nEnter room number (1-10): ");
        int room = sc.nextInt();
        sc.nextLine();

        if (room < 1 || room > 10) {
            System.out.println("Invalid room number!");
            return;
        }

        if (booked[room - 1]) {
            System.out.println("Room is already booked!");
            return;
        }

        System.out.println("\n ROOM TYPES");
        System.out.println("1. Standard Room - Rs.2000/day");
        System.out.println("2. Deluxe Room   - Rs.3000/day");
        System.out.println("3. Suite Room    - Rs.4000/day");
        System.out.println("4. Villa         - Rs.5000/day");

        System.out.print("Choose room type: ");
        int type = sc.nextInt();
        sc.nextLine();

        switch (type) {

            case 1:
                roomType[room - 1] = "Standard Room";
                roomPrice[room - 1] = 2000;
                break;

            case 2:
                roomType[room - 1] = "Deluxe Room";
                roomPrice[room - 1] = 3000;
                break;

            case 3:
                roomType[room - 1] = "Suite Room";
                roomPrice[room - 1] = 4000;
                break;

            case 4:
                roomType[room - 1] = "Villa";
                roomPrice[room - 1] = 5000;
                break;

            default:
                System.out.println("Invalid room type!");
                return;
        }

        System.out.print("Enter customer name: ");
        customerName[room - 1] = sc.nextLine();

        System.out.print("Enter check-in date (DD-MM-YYYY): ");
        checkInDate[room - 1] = sc.nextLine();

        System.out.print("Enter number of days: ");
        days[room - 1] = sc.nextInt();

        booked[room - 1] = true;

        System.out.println("\nRoom booked successfully!");
        System.out.println("Room Type : " + roomType[room - 1]);
        System.out.println("Price     : Rs." + roomPrice[room - 1] + " per day");
    }

    void checkOut() {

        System.out.print("\nEnter room number for checkout: ");
        int room = sc.nextInt();

        if (room < 1 || room > 10) {
            System.out.println("Invalid room number!");
            return;
        }

        if (!booked[room - 1]) {
            System.out.println("Room is not booked!");
            return;
        }
        double total = roomPrice[room - 1] * days[room - 1];

        double discount = 0;

        if (days[room - 1] >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("\n HOTEL BILL");
        System.out.println("Customer      : " + customerName[room - 1]);
        System.out.println("Room Number   : " + room);
        System.out.println("Room Type     : " + roomType[room - 1]);
        System.out.println("Check-in Date : " + checkInDate[room - 1]);
        System.out.println("Days Stayed   : " + days[room - 1]);
        System.out.println("Price/Day     : Rs." + roomPrice[room - 1]);
        System.out.println("Total Amount  : Rs." + total);
        System.out.println("Discount      : Rs." + discount);
        System.out.println("Final Amount  : Rs." + finalAmount);

        booked[room - 1] = false;
        customerName[room - 1] = null;
        checkInDate[room - 1] = null;
        roomType[room - 1] = null;
        roomPrice[room - 1] = 0;
        days[room - 1] = 0;

        System.out.println("\nCheckout successful!");
        System.out.println("Room " + room + " is now available.");
    }

    public static void main(String[] args) {

        HotelBooking hotel = new HotelBooking();

        while (true) {

            System.out.println("\n HOTEL ROOM BOOKING");
            System.out.println("1. View Rooms");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = hotel.sc.nextInt();

            switch (choice) {

                case 1:
                    hotel.viewRooms();
                    break;

                case 2:
                    hotel.checkIn();
                    break;

                case 3:
                    hotel.checkOut();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}