package com.makers.app;

import org.junit.*;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.any;

public class AccountTest {
    
    Statement statement;
    Account testAccount;
   
    @Before  
    public void setUp() {
      testAccount = new Account(0, statement);
      statement = mock(Statement.class);
    }
    
    @Test
    public void testAccount() { 
      int expected = 0;

      assertEquals(testAccount.getBalance(), expected);
    }
  
    @Test public void depositAddsAmount() {
      int expected = 10;
      testAccount.deposit(10);

      assertEquals(testAccount.getBalance(), expected);
    }

    @Test public void withdrawRemovesAmount() {
      int expected = -10;

      testAccount.withdraw(10);
      assertEquals(testAccount.getBalance(), expected);
    }

    @Test public void depositCallsAddTransaction(){
      testAccount.deposit(0);

      verify(statement).addTransaction(any(Transaction.class));
    }

    @Test public void testWithdrawCallsAddTransaction(){
      testAccount.withdraw(0);
      
      verify(statement).addTransaction(any(Transaction.class));
    }
}


