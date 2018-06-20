package com.makers.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountTest
   extends TestCase {
    public void testApp() { 
      int expected = 0;
      Statement statement = new Statement();
      Account testAccount = new Account(0, statement);
 
      assertEquals(testAccount.getBalance(), expected);
    }

    public void testDeposit() {
      int expected = 10;
      Statement statement = new Statement();
      Account testAccount = new Account(0, statement);
      testAccount.deposit(10);
      assertEquals(testAccount.getBalance(), expected);
    }

    public void testWithdraw() {
      int expected = 80;
      Statement statement = new Statement();
      Account testAccount = new Account(100, statement);
      testAccount.withdraw(20);
      assertEquals(testAccount.getBalance(), expected);
    }
}
