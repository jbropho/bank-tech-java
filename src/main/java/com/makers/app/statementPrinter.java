package com.makers.app;

import java.util.ArrayList;

public abstract class statementPrinter {

  public static void 
    printStatement(ArrayList<Class<Transaction>> statements) {  
     int length = statements.size();

     for ( int i = 0; i < length; i++ ) {
       statementPrinter.printTransaction( statements.get(i) );
     }
  }

  private static void 
     printTransaction(Class<Transaction> transaction) {
     System.out.println( transaction );
  }
}
