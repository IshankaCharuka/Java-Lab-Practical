

package com.mycompany.trafficlight;


public class Trafficlight {

    public static void main(String[] args) {
       RedLightThread r1=new RedLightThread();
       GreenLightThread g1=new GreenLightThread();
       YellowLightThread y1=new YellowLightThread();
       
       r1.start();
       g1.start();
       y1.start();
       
       
       
    }
}
