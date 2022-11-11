package com.algo.spinner;

import java.time.LocalDate;

public class Transaction {
    private int transactionAmount;
    private LocalDate transactionDate;


    public Transaction(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Transaction(int transactionAmount, LocalDate transactionDate) {
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
