package org.example;

import org.example.Inheritance.Tesla;

public class Main {
    public static void main(String[] args) {

        Tesla tesla =new Tesla(3,true,false);
        tesla.stop();
        System.out.println(tesla.status);

    }
}