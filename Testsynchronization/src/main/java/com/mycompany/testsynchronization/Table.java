
package com.mycompany.testsynchronization;


public class Table {
     synchronized void printTable(int n)
    {//method not synchronized 
        for(int i=1;i<=5;i++){
        System.out.println(n*i);
          try{
          Thread.sleep(100);
          }catch(Exception e){ 
              System.out.println(e);
          } 
        }
}
    
}
