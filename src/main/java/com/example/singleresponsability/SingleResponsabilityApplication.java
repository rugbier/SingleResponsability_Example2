package com.example.singleresponsability;

import com.example.singleresponsability.model.Customer;
import com.example.singleresponsability.model.Item;
import com.example.singleresponsability.service.BillCalculator;
import com.example.singleresponsability.service.ReportGenerator;

import java.util.ArrayList;
import java.util.List;

public class SingleResponsabilityApplication {

    public static void main(String [] args) {
        Item item1 = new Item("TV", 250.0);
        Item item2 = new Item("Laptop", 720.0);
        Item item3 = new Item("Fridge", 460.0);
        Item item4 = new Item("Washing Machine", 790.0);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        Customer customer1 =  new Customer("Jhon", 29);
        customer1.setListsOfItems(itemList);

        BillCalculator calculator = new BillCalculator();
        calculator.calculateBill(customer1, 0.21);

        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(customer1, "XML");
        generator.generateReport(customer1, "CSV");

    }
}
