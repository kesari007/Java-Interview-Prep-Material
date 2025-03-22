package lld.elevator;

public class Elevator {
    int elevatorId;
    int capacity;
    int currentFloor;
    Direction direction;
    Status status;

    public Elevator(int elevatorId, int capacity, int currentFloor, Direction direction, Status status) {
        this.elevatorId = elevatorId;
        this.capacity = capacity;
        this.currentFloor = currentFloor;
        this.direction = direction;
        this.status = status;
    }
}
