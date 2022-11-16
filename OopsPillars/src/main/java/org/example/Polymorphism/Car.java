package org.example.Polymorphism;

public class Car {
    public int speed;
    public Boolean status;

    public Car(int speed, Boolean status) {
        this.speed = speed;
        this.status = status;
    }
    public void horn()
    {
        System.out.println("Horn OK");
    }
    // This is static Binding, Compile time Polymorphism
    public void horn(Boolean val)
    {
        if(val.booleanValue()==Boolean.TRUE)
        {
            System.out.println("Horn OK");
        }else
        {
            System.out.println("Horn NO");
        }
    }
    // Method overriding is dynamic polymorphism


}
