package com.kunal.designpatterns.ObserverDesignPattern;

import com.kunal.designpatterns.ObserverDesignPattern.Observable.IphoneObservableImpl;
import com.kunal.designpatterns.ObserverDesignPattern.Observable.StocksObservable;
import com.kunal.designpatterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import com.kunal.designpatterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import com.kunal.designpatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String args[]) {

        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("8437593351", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(10);
        iphoneStocksObservable.setStockCount(0);
        iphoneStocksObservable.setStockCount(100);
    }
}
