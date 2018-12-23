package com.example.singleresponsability.model;

import java.util.List;

public class Customer {

    String name;
    int age;
    double bill;
    List<Item> listsOfItems;

    public Customer(String name,int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public List<Item> getListsOfItems() {
        return listsOfItems;
    }

    public void setListsOfItems(List<Item> listsOfItems) {
        this.listsOfItems = listsOfItems;
    }

}
