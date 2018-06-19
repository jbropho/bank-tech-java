package com.makers.app;

import java.util.HashMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StatementTest
  extends TestCase
{
  public void testaddTransaction() 
  {
    Statement testStatement = new Statement();
    HashMap<String, String> actual = testStatement.addTransaction("100", "withdraw");

    HashMap<String, String> expected = new HashMap<String, String>();
    expected.put("amount", "100");
    expected.put("type", "withdraw");

    assertEquals(expected, actual);
  }
}