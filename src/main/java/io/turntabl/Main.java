package io.turntabl;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // Create new corporate and private client
        Client cClient1 = new CorporateClient(111, Client.ServiceLevel.Premium);
        Client pClient1 = new PrivateClient("Godric Dolphine", 112, Client.ServiceLevel.Platinum);

        // Add clients to register
        Register.clientRegister.add(cClient1);
        Register.clientRegister.add(pClient1);


        pClient1.displayClientInfo(pClient1);

    }
}
