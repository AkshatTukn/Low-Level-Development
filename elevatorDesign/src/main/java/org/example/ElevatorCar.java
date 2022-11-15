package org.example;

public class ElevatorCar {
    int id;
    ElevatorScreen elevatorScreen;
    int currentFloor;
    Direction direction;
    ElevatorState elevatorState;
   InternalButtons internalButtons;
  ElevatorDoor elevatorDoor;


    public ElevatorCar(){
        elevatorScreen= new ElevatorScreen();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        direction = Direction.UP;
        elevatorDoor = new ElevatorDoor();

    }



}
