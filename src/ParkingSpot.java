public class ParkingSpot {
    private Long id;
    public ParkingSpot(Long id) {
        this.id = id;
    }
    public ParkingSpot() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void parkVehicle(Vehicle vehicle) {
        System.out.println("Vehicle parked in parking spot with ID: " + id + " Vehicle ID: " + vehicle.getId());
    }

}
