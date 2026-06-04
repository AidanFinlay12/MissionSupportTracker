import java.util.ArrayList;

public class Ticket {
    private int ticketId;
    private String agencyName;
    private String reporterName;
    private String productArea;
    private String severity;
    private String status;
    private String issueDescription;
    private ArrayList<String> notes;

    public Ticket(int ticketId, String agencyName, String reporterName, String productArea,
                  String severity, String status, String issueDescription) {
        this.ticketId = ticketId;
        this.agencyName = agencyName;
        this.reporterName = reporterName;
        this.productArea = productArea;
        this.severity = severity;
        this.status = status;
        this.issueDescription = issueDescription;
        this.notes = new ArrayList<>();
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getReporterName() {
        return reporterName;
    }

    public String getProductArea() {
        return productArea;
    }

    public String getSeverity() {
        return severity;
    }

    public String getStatus() {
        return status;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public ArrayList<String> getNotes() {
        return notes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addNote(String note) {
        notes.add(note);
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        String result = "\nTicket ID: " + ticketId +
                "\nAgency Name: " + agencyName +
                "\nReporter Name: " + reporterName +
                "\nProduct Area: " + productArea +
                "\nSeverity: " + severity +
                "\nStatus: " + status +
                "\nIssue Description: " + issueDescription;

        if (notes.isEmpty()) {
            result += "\nNotes: No investigation notes added.";
        } else {
            result += "\nNotes:";
            for (String note : notes) {
                result += "\n- " + note;
            }
        }

        return result;
    }
}