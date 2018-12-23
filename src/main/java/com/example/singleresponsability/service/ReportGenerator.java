package com.example.singleresponsability.service;

import com.example.singleresponsability.model.Customer;

public class ReportGenerator {
    public void generateReport(Customer customer, String reportType) {
        if(reportType.equalsIgnoreCase("CSV")) {
            System.out.println("|" + customer.getName() + "|" + customer.getAge() + "|" + customer.getBill() + "|");
        }
        if(reportType.equalsIgnoreCase("XML")) {
            System.out.println("<customer><name>" + customer.getName() + "</name><age>" + customer.getAge() + "</age><bill>" + customer.getBill() + "</bill></customer>");
        }

    }
}
