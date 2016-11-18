package com.kyle;



/**
 * Created by Kyle on 18/11/2016.
 */
public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
