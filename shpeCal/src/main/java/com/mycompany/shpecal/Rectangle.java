
package com.mycompany.shpecal;


public class Rectangle implements Shape{
    private float width,length;
    
    public Rectangle(float w,float l)
    {
        width=w;
        length=l;  
    }
    public void setWidth(float w)
    {
        width=w;
    }
    public void setLength(float l)
    {
        length=l;
    }
    public float getWidth()
    {
        return width;
    }
    public float getLength()
    {
        return length;
    }
    @Override
    public double calculateArea()
    {
        return width*length;
    }

    
    @Override
    public double calculatePerimeter()
    {
         return 2*(width+length);
    }
    
    
    
}
