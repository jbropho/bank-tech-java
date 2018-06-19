package com.makers.app;

import com.makers.app.Statement;

public class Account {
  private int balance;
  private Statement statement;
  
  public Account(int initBalance, Statement accStatement) {
    balance = initBalance;
    statement = accStatement;
  }

  public void printStatement() 
  {
    statement.printHistory();
  }

  public int getBalance() {
    return this.balance;
  }

  public void deposit(int amount) {
    this.balance += amount;
    statement.addTransaction(Integer.toString(amount), "deposit");
  }

  public void withdraw(int amount) {
    this.balance -= amount;
  }
}