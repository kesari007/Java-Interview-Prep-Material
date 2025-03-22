package lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance ;
    private List<Level> levels;

    private ParkingLot() {
        levels = new ArrayList<>();
    }

    /**
     * There should be only one implementation of the parking lot class. (Singleton Design pattern)
     * @return
     */
    public static synchronized ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLevel(Level level){
        levels.add(level);
    }

}
