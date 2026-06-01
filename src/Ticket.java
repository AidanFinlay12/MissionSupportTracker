public class Ticket {
    private int ticketId;
    private String agencyName;
    private String reporterName;
    private String productArea;
    private String severity;
    private String status;
    private String issueDescription;

    public Ticket(int ticketId, String agencyName, String reporterName, String productArea,
                  String severity, String status, String issueDescription) {
        this.ticketId = ticketId;
        this.agencyName = agencyName;
        this.reporterName = reporterName;
        this.productArea = productArea;
        this.severity = severity;
        this.status = status;
        this.issueDescription = issueDescription;
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

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nTicket ID: " + ticketId +
                "\nAgency Name: " + agencyName +
                "\nReporter Name: " + reporterName +
                "\nProduct Area: " + productArea +
                "\nSeverity: " + severity +
                "\nStatus: " + status +
                "\nIssue Description: " + issueDescription;
    }
}