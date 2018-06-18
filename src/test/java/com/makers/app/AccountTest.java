package com.makers.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountTest
   extends TestCase
{

    public void shouldInitWithBalance()
    { 
      int expected = 0;
      Account testAccount = new Account(0);
      assertEquals(testAccount.balance, expected);
    }
}
