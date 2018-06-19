package com.makers.app;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class statementPrinter 
{

  public static void 
    printStatement(ArrayList<HashMap<String, String>> statements) 
  {  
     int length = statements.size();

     for ( int i = 0; i < length; i++ ) 
     {
      statementPrinter.printTransaction( statements.get(i) );
     }
  }

  public static void 
     printTransaction(HashMap<String, String> transaction) 
  {
     System.out.println( transaction );
  }

}
