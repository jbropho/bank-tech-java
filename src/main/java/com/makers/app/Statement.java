package com.makers.app;

import java.util.ArrayList;
import java.util.HashMap;

public class Statement {

  private ArrayList<HashMap<String, String>> history = 
    new ArrayList<HashMap<String, String>>();

  public HashMap<String, String>
     addTransaction(String amount, String type) 
  {
    HashMap<String,String> transaction = new HashMap<String,String>();  
    transaction.put("amount", amount);
    transaction.put("type", type);
    history.add(transaction);
    return transaction;
  }

  public void printHistory() 
  {
    System.out.println( history );
  }
}
