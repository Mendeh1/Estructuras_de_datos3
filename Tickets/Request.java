public class Request {
    private String personName;
    private int numTickets;

    public Request(String personName, int numTickets) {
        this.personName = personName;
        this.numTickets = numTickets;
    }

    public String getPersonName() {
        return personName;
    }

    public int getNumTickets() {
        return numTickets;
    }
}
