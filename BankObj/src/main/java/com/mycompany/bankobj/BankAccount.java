package com.mycompany.bankobj;



public class BankAccount {
    private int accNum;
    private String accHolder;
    private String branch;
    private float balance=0.0f;
    
    public void BankAccount(int an,String ah,String br,float b)
    {
        accNum=an;
        accHolder=ah;
        branch=br;
        balance=b;
    }
    public float withdraw(float amount)
    {
        if(balance>amount)
        {
            balance=balance-amount;
            return balance;
        }
        else
        {
            System.out.println("insufficient credit");
            return balance;
        }
            
    }
    public float diposit(float amount)
    {
        balance=balance+amount;
        return balance;
    }
    public void displayDetails()
    {
        System.out.println("Account number is "+accNum);
        System.out.println("account name is "+accHolder);
        System.out.println("branch is "+branch);
        System.out.println("Current balance is "+balance);
        
                
    }
    
    
        
    
}
