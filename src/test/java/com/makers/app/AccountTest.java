package com.makers.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import org.junit.*;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.any;

public class AccountTest
   extends TestCase {

    public void testAccount() { 
      int expected = 0;

      Statement statement = mock(Statement.class);
      Account testAccount = new Account(0, statement);
      Transaction transaction = mock(Transaction.class);

      assertEquals(testAccount.getBalance(), expected);
    }

    public void testDeposit() {
      int expected = 10;

      Statement statement = mock(Statement.class);
      Account testAccount = new Account(0, statement);
      testAccount.deposit(10);

      assertEquals(testAccount.getBalance(), expected);
    }

    public void testDepositCallsAddTransaction(){
      Statement statement = mock(Statement.class);
      Account testAccount = new Account(0, statement);
      Transaction transaction = mock(Transaction.class);

      testAccount.deposit(0);

      verify(statement).addTransaction(any(Transaction.class));
    }

    public void testWithdrawCallsAddTransaction(){
      Statement statement = mock(Statement.class);
      Account testAccount = new Account(0, statement);
      Transaction transaction = mock(Transaction.class);

      testAccount.withdraw(0);

      verify(statement).addTransaction(any(Transaction.class));
    }
}


