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

        for (Ticket fault : Tickets) {
            System.out.println(fault);
            System.out.println("-------------------------");
        }
    }
}
