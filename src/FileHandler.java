import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "Ticket.txt";

    public static void saveTickets(ArrayList<Ticket> tickets) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Ticket ticket : tickets) {
                writer.println(ticket.getTicketId() + "|" +
                        ticket.getAgencyName() + "|" +
                        ticket.getReporterName() + "|" +
                        ticket.getProductArea() + "|" +
                        ticket.getSeverity() + "|" +
                        ticket.getStatus() + "|" +
                        ticket.getIssueDescription() + "|" +
                        String.join("~", ticket.getNotes()));
            }

            System.out.println("Tickets saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving tickets: " + e.getMessage());
        }
    }

    public static ArrayList<Ticket> loadTickets() {
        ArrayList<Ticket> tickets = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return tickets;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|", -1);

                if (parts.length >= 7) {
                    int ticketId = Integer.parseInt(parts[0]);
                    String agencyName = parts[1];
                    String reporterName = parts[2];
                    String productArea = parts[3];
                    String severity = parts[4];
                    String status = parts[5];
                    String issueDescription = parts[6];

                    Ticket ticket = new Ticket(
                            ticketId,
                            agencyName,
                            reporterName,
                            productArea,
                            severity,
                            status,
                            issueDescription
                    );

                    if (parts.length >= 8 && !parts[7].isEmpty()) {
                        ArrayList<String> notes = new ArrayList<>();
                        String[] savedNotes = parts[7].split("~");

                        for (String note : savedNotes) {
                            notes.add(note);
                        }

                        ticket.setNotes(notes);
                    }

                    tickets.add(ticket);
                }
            }

        } catch (Exception e) {
            System.out.println("Error loading tickets: " + e.getMessage());
        }

        return tickets;
    }
}