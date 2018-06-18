package com.makers.app;

public class Account {
  private int balance;

  public Account(int initBalance) {
    balance = initBalance;
  }

  public int getBalance() {
    return this.balance;
  }

  public void deposit(int amount) {
    this.balance += amount;
  }
}