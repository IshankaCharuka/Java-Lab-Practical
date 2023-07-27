
package com.mycompany.trafficlight;


public class RedLightThread extends Thread
{
    public void run()
    {
        try{
            while(true)
            {
                System.out.println("red light");
                Thread.sleep(5000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
