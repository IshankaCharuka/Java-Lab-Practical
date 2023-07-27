

package com.mycompany.filehandling;
import java.io.*;


public class Filehandling {

    public static void main(String[] args) 
    {
        try
        {
            boolean newFile=false;
            File file1=new File("/Users/ishankacharuka/Downloads/sample.txt");
            System.out.println(file1.exists());
            newFile=file1.createNewFile();
            System.out.println(newFile);
            System.out.println(file1.exists());
         
        }
        catch(Exception e)
                {
                    System.out.println(e.getMessage()); 
                }
      
    }
}
