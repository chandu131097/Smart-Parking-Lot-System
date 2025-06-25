public class DisplayPanel {
    private Long id;

    public DisplayPanel() {
    }
    public DisplayPanel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void showMessage(String message) {
        System.out.println("Display Panel ID: " + id + " - Message: " + message);
    }


}
