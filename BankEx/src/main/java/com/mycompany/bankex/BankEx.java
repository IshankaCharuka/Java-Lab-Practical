
package com.mycompany.bankex;



public class BankEx {

    public static void main(String[] args) {
        
        
        SavingAccount s1=new SavingAccount();
        s1.setBalance(100);
        s1.calculateInterest();
        
        CheckingAccount c1=new CheckingAccount();
        c1.setBalance(100);
        c1.calculateInterest();
        
        
        
    }
}
