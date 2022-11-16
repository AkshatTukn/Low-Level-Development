package org.example.Inheritance;
//There are 5 different types of inheritance in java as follows:
//Single Inheritance: Class B inherits Class B using extends keyword
//Multilevel Inheritance: Class C inherits class B and B inherits class A using extends keyword
//Hierarchy Inheritance: Class B and C inherits class A in hierarchy order using extends keyword
//Hybrid Inheritance: Class D inherits class B and class C. Class B and C inherits A. [NOT IN JAVA]
//Multiple Inheritance:  Class C inherits Class A and B. [Not in java, but can use interface]
public class Car {
    public int wheels;
    public Boolean status;

    public Car(int wheels, Boolean status) {
        this.wheels = wheels;
        this.status = status;
    }
    public void stop()
    {
        status=false;
        System.out.println("Stop this car");
    }



}
