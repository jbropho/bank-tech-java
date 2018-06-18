package com.makers.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountTest
   extends TestCase
{
    public void testApp()
    { 
      int expected = 0;
      Account testAccount = new Account(0);
      assertEquals(testAccount.getBalance(), expected);
    }

    public void testDeposit()
    {
      int expected = 10;
      Account testAccount = new Account(0);
      testAccount.deposit(10);
      assertEquals(testAccount.getBalance(), expected);
    }
}
