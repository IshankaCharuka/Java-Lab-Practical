

package com.mycompany.exceptionlab2;


public class ExceptionLab2 {

    public static void main(String[] args) {
        int arr[]={1,2,3};
        
        try{
            System.out.println("Index"+arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           // System.out.println(e.getMessage());
            System.out.println("Erorr : invalid index is accessed");
        }
        
            }
}
