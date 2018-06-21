package com.makers.app;

import com.makers.app.Transaction;

import java.util.ArrayList;

public class Statement {
  
  private ArrayList<Transaction> history =
    new ArrayList<Transaction>();
  
  public void addTransaction(int amount, String type, Class<Transaction> Transaction)  {
    history.add(createTransaction(amount, type, Transaction.class));
  }

  public Transaction 
  createTransaction(int amount, String type, Class<Transaction> Transaction) {
    Transaction transaction = new Transaction(type, amount);
    return transaction;
  }

  public ArrayList<Transaction> getHistory() {
    return history;
  }

  public void printHistory() {
    System.out.println( history );
  }
}
