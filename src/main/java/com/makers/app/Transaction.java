package com.makers.app;

public class Transaction {
  private String transactionType;
  private int transactionAmount;

  public Transaction(String type, int amount) {
    transactionType = type;
    transactionAmount = amount;
  }

  public String getTransactionType() {
    return this.transactionType;
  }

  public int getTransactionAmount() {
    return this.transactionAmount;
  }
}
