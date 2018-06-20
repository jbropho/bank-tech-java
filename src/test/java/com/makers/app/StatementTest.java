package com.makers.app;

import static org.mockito.Mockito.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StatementTest
  extends TestCase {
  public void testaddTransaction() {
    Statement testStatement = new Statement();
    testStatement.createTransaction(100 , "withdraw");
  }
}

