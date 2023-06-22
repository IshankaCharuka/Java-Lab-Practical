
package com.mycompany.bankex;


public class SavingAccount extends BankAccount
{
    private static final double interestRate=0.12;
    
    @Override
    public void calculateInterest()
    {
        double interest = getBalance()*interestRate;
        System.out.println("Interest for the saving account: "+interest);
    }
    
    
}
