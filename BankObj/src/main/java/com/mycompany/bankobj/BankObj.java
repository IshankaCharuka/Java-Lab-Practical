
package com.mycompany.bankobj;

public class BankObj {

    public static void main(String[] args) {
       BankAccount b1 = new BankAccount();
       b1.displayDetails();
       b1.BankAccount(123,"abc","colombo", 5000.0f);
       b1.displayDetails();
       b1.diposit(500.f);
       b1.displayDetails();
       b1.withdraw(300.0f);
       b1.displayDetails();
       
       
    }
}
