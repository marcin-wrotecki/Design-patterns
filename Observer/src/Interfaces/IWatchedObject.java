package Interfaces;

public interface IWatchedObject {
    void addObserver(IObserver o);

    void deleteObserver(IObserver o);

    void notifyObservers();

}
