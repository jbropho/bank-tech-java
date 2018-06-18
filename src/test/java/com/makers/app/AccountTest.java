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
      Account testAccount = new Account();
      assertEquals(testAccount.balance, expected);
    }
   }