package Implementations;

import Interfaces.IObserver;

public class User implements IObserver {

    private int numberOfNotification;
    private String username;

    public User(String username) {
        this.username = username;
        numberOfNotification = 0;
    }

    @Override
    public void update() {
        numberOfNotification++;
        if (numberOfNotification == 1)
            System.out.println(username + "! You have " + numberOfNotification + " notification");
        else
            System.out.println(username + "! You have " + numberOfNotification + " notification/s");
    }
}
