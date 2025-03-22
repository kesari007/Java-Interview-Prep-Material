package lld.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    List<Elevator> elevators;
    int totalFloors ;
    int totalElevators;

    public ElevatorManager(int totalFloors, int totalElevators){

        this.totalFloors = totalFloors;
        this.totalElevators = totalElevators;
        initializeElevators();
    }
    public void initializeElevators(){
        for(int i=0; i<elevators.size();i++){
            elevators.add(new Elevator(i+1, 10, 0, Direction.UP, Status.ACTIVE));

        }
    }
}
