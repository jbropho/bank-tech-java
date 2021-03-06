package com.makers.app;

import com.makers.app.Statement;
import com.makers.app.Transaction;

public class Account {
  private int balance;
  private Statement statement;
  
  public Account(int initBalance, Statement accStatement)  {
    balance = initBalance;
    statement = accStatement;
  }

  public void printStatement() {
    statement.printHistory();
  }

  public int getBalance() {
    return this.balance;
  }

  public void deposit(int amount) {
    this.balance += amount;
    statement.addTransaction(amount, "deposit", Transaction.class);
  }

  public void withdraw(int amount) {
    this.balance -= amount;
    statement.addTransaction(amount, "withdraw", Transaction.class);
  }
}
