package io.turntabl;

public class Client {

    private String clientName;
    private int clientID;
    enum ServiceLevel {Gold, Platinum, Premium}
    private ServiceLevel servicelevel;
    AccountManager manager;


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
    }

    public AccountManager getManager() {
        return manager;
    }

    public void setManager(AccountManager manager) {
        this.manager = manager;
    } // End of setters and getters


    // Overloaded constructor for client
    public Client(String clientName, int clientID, ServiceLevel servicelevel, AccountManager manager) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.servicelevel = servicelevel;
        this.manager = manager;
    }

    public Client(int clientID, ServiceLevel servicelevel, AccountManager manager) {
        this.clientID = clientID;
        this.servicelevel = servicelevel;
        this.manager = manager;
    } // End of constructor

    //Display client information
    public void displayClientInfo(Client client){
        int index = Register.clientRegister.indexOf(client);
        System.out.println("Client name: " + Register.clientRegister.get(index).getClientName());
        System.out.println("Client id:  " + Register.clientRegister.get(index).getClientID());
        System.out.println("Client level: " + Register.clientRegister.get(index).getServicelevel());
        System.out.println("Client manager: " + Register.clientRegister.get(index).getManager().managerName);
        System.out.println("Client managerID: " + Register.clientRegister.get(index).getManager().managerID);
        System.out.println();
    }

}
