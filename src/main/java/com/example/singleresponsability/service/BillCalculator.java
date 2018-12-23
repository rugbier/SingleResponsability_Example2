package com.example.singleresponsability.service;

import com.example.singleresponsability.model.Customer;
import com.example.singleresponsability.model.Item;

import java.util.List;

public class BillCalculator {

    public void calculateBill(Customer customer, double tax) {
        double bill = 0;
        List<Item> listsOfItems = customer.getListsOfItems();
        for (Item item:listsOfItems) {
            bill += item.getPrice();
        }

        bill *= (1 + tax);
        customer.setBill(bill);
    }
}
