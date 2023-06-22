package com.mycompany.shpecal;


public class Triangle implements Shape
{
    private float height,base,side1,side2;
    
    public Triangle(float height,float base,float side1,float side2)
    {
        this.height=height;
        this.base=base;
        this.side1=side1;
        this.side2=side2;
    }
    
    public void setHeight(float height)
    {
        this.height=height;
    }
    public void setBase(float base)
    {
        this.base=base;
    }
    public float getHeight()
    {
        return height;
    }
    public float getBase()
    {
        return base;
    }
    
    public void setSide1(float side1)
    {
        this.side1=side1;
    }
    public void setSide2(float side2)
    {
        this.side2=side2;
    }
    
    public float getSide1()
    {
        return side1;
    }
    
    public float getSide2()
    {
        return side2;
    }
    
    
    @Override
    public double calculateArea()
    {
        return 0.5*base*height;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return side1+side2+base;
    }
}
