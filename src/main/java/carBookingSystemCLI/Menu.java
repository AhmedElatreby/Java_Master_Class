package carBookingSystemCLI;


import java.util.Scanner;

class Menu {
    public void menu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - Book Car");
            System.out.println("2 - View All User Booked Cars");
            System.out.println("3 - View All Bookings");
            System.out.println("4 - View Available Cars");
            System.out.println("5 - View Available Electric Cars");
            System.out.println("6 - View all users");
            System.out.println("7 - Exit");

            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 7) {
                break;
            }
        }
    }

}