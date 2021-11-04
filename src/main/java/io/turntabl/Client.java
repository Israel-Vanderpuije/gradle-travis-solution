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

    public void displayClientInfo(Client client){
        int index = Register.clientRegister.indexOf(client);
        System.out.println("First client name: " + Register.clientRegister.get(index).getClientName());
        System.out.println("First client id:  " + Register.clientRegister.get(index).getClientID());
        System.out.println("First client level: " + Register.clientRegister.get(index).getServicelevel());
    }

//    public void addClientToList(PrivateClient Client){
//        Register.clientRegister.add(new PrivateClient(clientName, clientID, servicelevel));
//    }
//
//    public void addClientToList(CorporateClient client){
//        Register.clientRegister.add(new CorporateClient(clientID, servicelevel));
//    }

}
