import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Bike extends Vehicle {

    Bike(String brand, int speed) {
        super(brand, speed);
    }

    void feature() {
        System.out.println("Feature: Disk Brake");
    }
}

class Car extends Vehicle {

    Car(String brand, int speed) {
        super(brand, speed);
    }

    void feature() {
        System.out.println("Feature: Air Conditioning");
    }
}

class Auto extends Vehicle {

    Auto(String brand, int speed) {
        super(brand, speed);
    }

    void feature() {
        System.out.println("Feature: Three Wheels");
    }
}
 class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" VEHICLE MENU ");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Auto");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                Bike b = new Bike("Yamaha", 120);

                System.out.println("\n Bike Details");
                b.display();
                b.feature();

                System.out.println("\nBike Options:");
                System.out.println("1. Start Bike");
                System.out.println("2. Stop Bike");

                System.out.print("Enter option: ");
                int bikeOption = sc.nextInt();

                switch (bikeOption) {
                    case 1:
                        System.out.println("Bike Started");
                        break;

                    case 2:
                        System.out.println("Bike Stopped");
                        break;

                    default:
                        System.out.println("Invalid Bike Option");
                }
                break;

            case 2:
                Car c = new Car("Toyota", 180);

                System.out.println("\n Car Details");
                c.display();
                c.feature();

                System.out.println("\nCar Options:");
                System.out.println("1. Start Car");
                System.out.println("2. Stop Car");

                System.out.print("Enter option: ");
                int carOption = sc.nextInt();

                switch (carOption) {
                    case 1:
                        System.out.println("Car Started");
                        break;

                    case 2:
                        System.out.println("Car Stopped");
                        break;

                    default:
                        System.out.println("Invalid Car Option");
                }
                break;

            case 3:
                Auto a = new Auto("Bajaj", 80);

                System.out.println("\n Auto Details ");
                a.display();
                a.feature();

                System.out.println("\nAuto Options:");
                System.out.println("1. Start Auto");
                System.out.println("2. Stop Auto");

                System.out.print("Enter option: ");
                int autoOption = sc.nextInt();

                switch (autoOption) {
                    case 1:
                        System.out.println("Auto Started");
                        break;

                    case 2:
                        System.out.println("Auto Stopped");
                        break;

                    default:
                        System.out.println("Invalid Auto Option");
                }
                break;

            case 4:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid Vehicle Choice");
        }

        sc.close();
    }
}