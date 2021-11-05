package io.turntabl;

public class PrivateClient extends Client{


    // PrivateClient constructor
    public PrivateClient(String clientName, int clientID, ServiceLevel servicelevel, AccountManager manager) {
        super(clientName, clientID, servicelevel, manager);

//        addClientToList(new PrivateClient(clientName, clientID, servicelevel));
    } // End of constructor


}
