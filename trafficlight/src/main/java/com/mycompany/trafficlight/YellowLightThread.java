
package com.mycompany.trafficlight;


public class YellowLightThread extends Thread
{
       public void run()
    {
        try{
            while(true)
            {
                System.out.println("yellow light");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
