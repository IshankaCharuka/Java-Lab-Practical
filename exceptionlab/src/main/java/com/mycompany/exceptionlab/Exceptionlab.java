
package com.mycompany.exceptionlab;
import java.util.Scanner;


public class Exceptionlab {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,ans;
        System.out.println("Enter 1st number:");
        n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        n2=sc.nextInt();
        try{
            ans=n1/n2;
            System.out.println("Division is "+ans);
        }
        catch(ArithmeticException e)
        {
           // System.out.println(e.getMessage());
            System.out.println("Error : divided by 0 \n"+e);
        }
        
            }
}
