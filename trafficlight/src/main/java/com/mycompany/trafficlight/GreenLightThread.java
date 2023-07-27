
package com.mycompany.trafficlight;


public class GreenLightThread extends Thread
{
     public void run()
    {
        try{
            while(true)
            {
                System.out.println("green light");
                Thread.sleep(10000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
