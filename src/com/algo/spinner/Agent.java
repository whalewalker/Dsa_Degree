package com.algo.spinner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Agent {
    private String id;
    private String name;
    private Category category;
    private int count;

    private final List<Transaction> transactions;

    public Agent(String name, Category value) {
        this.name = name;
        category = value;
        this.id = UUID.randomUUID().toString();
        transactions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
        count++;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }
}
