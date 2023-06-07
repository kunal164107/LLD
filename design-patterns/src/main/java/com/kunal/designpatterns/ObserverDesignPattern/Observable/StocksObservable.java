package com.kunal.designpatterns.ObserverDesignPattern.Observable;

import com.kunal.designpatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();
}
