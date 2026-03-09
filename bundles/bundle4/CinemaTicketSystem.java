import java.util.Scanner;

public class CinemaTicketSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] seats = new int[5][10];
        int choice = 0;

        while (choice != 4) {

            System.out.println("\nMenu");
            System.out.println("1 Book Seat");
            System.out.println("2 Cancel Seat");
            System.out.println("3 Show Seats");
            System.out.println("4 Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter row (1-5): ");
                    int row = sc.nextInt();

                    System.out.println("Enter seat (1-10): ");
                    int col = sc.nextInt();

                    if (row >= 1 && row <= 5 && col >= 1 && col <= 10) {

                        if (seats[row - 1][col - 1] == 0) {
                            seats[row - 1][col - 1] = 1;
                            System.out.println("Seat booked successfully.");
                        } else {
                            System.out.println("Seat already booked.");
                        }

                    } else {
                        System.out.println("Invalid seat selection.");
                    }

                    break;

                case 2:
                    System.out.println("Enter row (1-5): ");
                    row = sc.nextInt();

                    System.out.println("Enter seat (1-10): ");
                    col = sc.nextInt();

                    if (row >= 1 && row <= 5 && col >= 1 && col <= 10) {

                        if (seats[row - 1][col - 1] == 1) {
                            seats[row - 1][col - 1] = 0;
                            System.out.println("Seat cancelled.");
                        } else {
                            System.out.println("Seat was not booked.");
                        }

                    } else {
                        System.out.println("Invalid seat selection.");
                    }

                    break;

                case 3:
                    System.out.println("\nSeat Map");

                    for (int i = 0; i < 5; i++) {

                        System.out.print("Row " + (i + 1) + ": ");

                        for (int j = 0; j < 10; j++) {
                            System.out.print(seats[i][j] + " ");
                        }

                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}