package org.example;

public class ElevatorScreen {
    int floor;
    Direction direction;

    public void setFloor(int floor,Direction direction) {
        this.floor = floor;
        this.direction=direction;
    }
    public void showScreen()
    {
        System.out.println(floor);
        System.out.println(direction);
    }



}
