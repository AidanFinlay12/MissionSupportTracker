import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "Ticket.txt";

    public static void saveTickets(ArrayList<Ticket> tickets){
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Ticket ticket : tickets) {
                writer.println(ticket.getTicketId() + "," +
                        ticket.getAgencyName() + "," +
                        ticket.getReporterName() + "," +
                        ticket.getProductArea() + "," +
                        ticket.getSeverity() + "," +
                        ticket.getStatus() + "," +
                        ticket.getIssueDescription() + "," +
                        ticket.toString().replace("\n", "|"));
            }

            System.out.println("Tickets saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving Tickets: " + e.getMessage());
        }
    }

}
