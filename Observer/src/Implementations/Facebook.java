package Implementations;

import Interfaces.IObserver;
import Interfaces.IWatchedObject;

import java.util.ArrayList;

public class Facebook implements IWatchedObject {
    private ArrayList<IObserver> observersList;

    public Facebook() {
        observersList = new ArrayList<>();

    }

    public void sendNotification() {
        System.out.println("New notification has been send");
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver o) {
        System.out.println("New user was added!");
        observersList.add(o);
    }

    @Override
    public void deleteObserver(IObserver o) {
        System.out.println("Implementations.User was removed");
        observersList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observersList)
            o.update();
    }
}
