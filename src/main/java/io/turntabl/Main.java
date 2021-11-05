package io.turntabl;

public class Main {

    public static void main(String[] args) {

        //Create new account managers
        AccountManager manager1 = new AccountManager("Emmanuel Adiba", 901);
        AccountManager manager2 = new AccountManager("Hadi Amin", 902);

        // Create new corporate and private client
        Client cClient1 = new CorporateClient(111, Client.ServiceLevel.Premium, manager1);
        Client pClient1 = new PrivateClient("Godric Dolphine", 112, Client.ServiceLevel.Platinum, manager2);

        // Add clients to register
        Register.clientRegister.add(cClient1);
        Register.clientRegister.add(pClient1);

        //display client information
        cClient1.displayClientInfo(cClient1);
        System.out.println();
        pClient1.displayClientInfo(pClient1);

    }
}
