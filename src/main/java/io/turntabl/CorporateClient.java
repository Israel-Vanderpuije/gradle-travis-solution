package io.turntabl;

public class CorporateClient extends Client{

    //Getting client name
    @Override
    public String getClientName() {
        return manager.managerName;
    }

    // CorporateClient constructor
    public CorporateClient(int clientID, ServiceLevel servicelevel, AccountManager manager) {
        super(clientID, servicelevel, manager);
    } // End of constructor

}
