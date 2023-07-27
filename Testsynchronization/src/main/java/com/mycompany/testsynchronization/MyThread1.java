/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testsynchronization;

/**
 *
 * @author ishankacharuka
 */
public class MyThread1 extends Thread
{
    Table t;
      MyThread1(Table t){
        this.t=t;
      }
    @Override
      public void run(){
      t.printTable(5);
    }
}
