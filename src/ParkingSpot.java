public class ParkingSpot {
    private Long id;
    private boolean isAvailable;

    public ParkingSpot(Long id, boolean isAvailable) {
        this.id = id;
        this.isAvailable = isAvailable;
    }
    public ParkingSpot() {
    }

    public ParkingSpot(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
