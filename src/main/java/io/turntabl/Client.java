package io.turntabl;

public class Client {

    private String clientName;
    private int clientID;
    enum ServiceLevel {Gold, Platinum, Premium}
    private ServiceLevel servicelevel;


    // Setters and Getters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public ServiceLevel getServicelevel() {
        return servicelevel;
    }

    public void setServicelevel(ServiceLevel servicelevel) {
        this.servicelevel = servicelevel;
    } // End of setters and getters


    // Overloaded constructor for client
    public Client(String clientName, int clientID, ServiceLevel servicelevel) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.servicelevel = servicelevel;
    }

    public Client(int clientID, ServiceLevel servicelevel) {
        this.clientID = clientID;
        this.servicelevel = servicelevel;
    } // End of constructor
}
