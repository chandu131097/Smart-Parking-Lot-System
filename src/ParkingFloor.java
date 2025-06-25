import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ParkingFloor {
    private int id;
    private HashMap<Boolean, Set<ParkingSpot>> parkingSpots;
    private int totalSpots;
    private int availableSpots;
    private int occupiedSpots;

    public ParkingFloor(int id) {
        this.id = id;
        this.parkingSpots = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public HashMap<Boolean, Set<ParkingSpot>> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(HashMap<Boolean, Set<ParkingSpot>> parkingSpots) {
        this.parkingSpots = parkingSpots;
        setTotalSpots();
        setAvailableSpots();
        setOccupiedSpots();
    }

    public int getTotalSpots() {
        return totalSpots;
    }

    public void setTotalSpots() {
        this.totalSpots = (parkingSpots != null) ? parkingSpots.values().stream().mapToInt(Set::size).sum() : 0;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots() {
        this.availableSpots = (parkingSpots != null && parkingSpots.containsKey(true))
            ? parkingSpots.get(true).size()
            : 0;
    }

    public int getOccupiedSpots() {
        return occupiedSpots;
    }

    public void setOccupiedSpots() {
        this.occupiedSpots = this.totalSpots - this.availableSpots;
    }

    public ParkingSpot getAvailableParkingSpots() {
        Set<ParkingSpot> availableSpotsSet = parkingSpots.getOrDefault(true, Set.of());
        if (availableSpotsSet.isEmpty()) {
            return null;
        }
        else{
            return availableSpotsSet.iterator().next();
        }
    }
}
