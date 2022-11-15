package org.example;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer>upMinq;
    PriorityQueue<Integer>downMaxq;
    ElevatorCar elevatorCar;
    ElevatorController(ElevatorCar elevatorCar){

        this.elevatorCar = elevatorCar;
        upMinq = new PriorityQueue<>();
        downMaxq = new PriorityQueue<>((a,b) -> b-a);

    }
    public void submitExternalRequest(int floor, Direction direction){

        if(direction == Direction.DOWN)
        {
            downMaxq.offer(floor);
        } else
        {
            upMinq.offer(floor);
        }
    }
    public void controlElevator() {
        while (true) {

            if (elevatorCar.direction == Direction.UP) {


            }
        }
       }



    }
