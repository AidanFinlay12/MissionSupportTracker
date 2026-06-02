import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TicketManager ticketManager = new TicketManager();

    public static void main(String[] args) {
        ticketManager.setTickets(FileHandler.loadTickets());
        boolean running = true;

        while (running) {
            showMenu();

            int choice = getIntInput("Choose an option: ");

            switch (choice) {
                case 1:
                    addTicket();
                    break;

                case 2:
                    ticketManager.viewAllTickets();
                    break;

                case 3:
                    System.out.println("Search tickets feature coming soon.");
                    break;

                case 4:
                    System.out.println("Filter by severity feature coming soon.");
                    break;

                case 5:
                    System.out.println("Filter by status feature coming soon.");
                    break;

                case 6:
                    System.out.println("Update ticket status feature coming soon.");
                    break;

                case 7:
                    System.out.println("Add investigation note feature coming soon.");
                    break;

                case 8:
                    System.out.println("View ticket details feature coming soon.");
                    break;

                case 9:
                    ticketManager.saveTickets();
                    System.out.println("Exiting Mission Support Tracker...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 9.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nMission Support Tracker");
        System.out.println("-----------------------");
        System.out.println("1. Log new ticket");
        System.out.println("2. View all tickets");
        System.out.println("3. Search tickets");
        System.out.println("4. Filter by severity");
        System.out.println("5. Filter by status");
        System.out.println("6. Update ticket status");
        System.out.println("7. Add investigation note");
        System.out.println("8. View ticket details");
        System.out.println("9. Save and exit");
    }

    private static int getIntInput(String message) {
        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static void addTicket(){
        System.out.print("Enter Agency Name: ");
        String agencyName = scanner.nextLine();

        System.out.print("Enter Reporter Name: ");
        String reporterName = scanner.nextLine();

        System.out.print("Enter Product Area: ");
        String productArea = scanner.nextLine();

        System.out.print("Enter Severity: ");
        String severity = scanner.nextLine();

        System.out.print("Enter Status: ");
        String status = scanner.nextLine();

        System.out.print("Enter Issue Description: ");
        String issueDescription = scanner.nextLine();

        ticketManager.addTicket(agencyName, reporterName, productArea, severity, status, issueDescription);


    }


}