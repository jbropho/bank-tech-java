package com.makers.app;

import com.makers.app.Transaction;

import java.util.ArrayList;

public class Statement {

  private ArrayList<Transaction> history =
    new ArrayList<Transaction>();
    
  public void addTransaction(int amount, String type)  {
    history.add(createTransaction(amount, type));
  }

  public Transaction createTransaction(int amount, String type) {
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
