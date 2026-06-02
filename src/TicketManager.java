import java.util.ArrayList;

public class TicketManager {
    private ArrayList<Ticket> Tickets;
    private int nextId;

    public TicketManager(){
        Tickets = new ArrayList<>();
        nextId = 1;
    }

    public void addTicket(String agencyName, String reporterName, String productArea, String severity, String status, String issueDescription){
        Ticket ticket = new Ticket(nextId, agencyName, reporterName, productArea, severity, status, issueDescription);
        Tickets.add(ticket);
        nextId++;

        System.out.println("Ticket added successfully.");
    }

    public void viewAllTickets(){
        if(Tickets.isEmpty()){
            System.out.println("No Tickets currently logged.");
            return;
        }

        for (Ticket ticket : Tickets) {
            System.out.println(ticket);
            System.out.println("-------------------------");
        }
    }
    public void setTickets(ArrayList<Ticket> tickets) {
        this.Tickets = tickets;

        int highestId = 0;

        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() > highestId) {
                highestId = ticket.getTicketId();
            }
        }

        nextId = highestId + 1;
    }

    public void saveTickets() {
        FileHandler.saveTickets(Tickets);
    }

    public void filterBySeverity(String severity){
        boolean found = false;

        for(Ticket ticket: Tickets){
            if (ticket.getSeverity().equalsIgnoreCase(severity)) {
                System.out.println(ticket);
                System.out.println("-------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No faults found with that status.");
        }
    }
}
