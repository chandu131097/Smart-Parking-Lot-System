public class EntryPanel {
    private Long id;
    private DisplayPanel displayPanel;

    public EntryPanel(Long id, DisplayPanel displayPanel) {
        this.id = id;
        this.displayPanel = displayPanel;
    }
    public EntryPanel() {
    }
    public EntryPanel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DisplayPanel getDisplayPanel() {
        return displayPanel;
    }

    public void setDisplayPanel(DisplayPanel displayPanel) {
        this.displayPanel = displayPanel;
    }

    public boolean parkVehicle(Vehicle vehicle , ParkingFloor parkingFloor){

        if (vehicle == null || parkingFloor == null) {
            displayPanel.showMessage("Invalid vehicle or parking floor.");
            return false;
        }

        ParkingSpot parkingSpot = parkingFloor.findAvailableSpot(vehicle.getVehicleType());

        if (parkingSpot == null) {
            displayPanel.showMessage("No available parking spot for vehicle type: " + vehicle.getVehicleType());
            return false;
        }

        parkingSpot.parkVehicle(vehicle);
        displayPanel.showMessage("Vehicle with ID: " + vehicle.getId() + " parked successfully in spot ID: " + parkingSpot.getId());
        return true;
    }
}
