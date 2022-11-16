package org.example.Inheritance;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Tesla extends Car{

    public Boolean Alloys;
    public Tesla(int wheels, Boolean status,Boolean alloys) {
        super(wheels, status);
        this.Alloys=alloys;
    }

    @Override
    public void stop()
    {
        super.status=false;
        System.out.println("Alloy car Stoped");
    }


}
