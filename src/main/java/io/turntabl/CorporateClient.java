package io.turntabl;

public class CorporateClient extends Client implements AccountManager{

    //Getting client name
    @Override
    public String getClientName() {
        return AccountManager.managerName;
    }

    // CorporateClient constructor
    public CorporateClient(int clientID, ServiceLevel servicelevel) {
        super(clientID, servicelevel);
    } // End of constructor


}
