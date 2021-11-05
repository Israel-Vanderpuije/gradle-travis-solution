package io.turntabl;

public class AccountManager {

    String managerName;
    int managerID;

    //Getters and setters
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    } //End of  getters and setters


    //AccountManager constructor
    public AccountManager(String managerName, int managerID) {
        this.managerName = managerName;
        this.managerID = managerID;
    }
}
