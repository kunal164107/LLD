package com.kunal.designpatterns.SolidPrinciples.OpenClosedPrinciple;

public class SaveToDB implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        System.out.println(invoice.getClass() + " saved to DB");
    }
}
