class RoadAccident {
    private String vehicleType;
    private String city;
    private int totalNumberOfAccidents;

    // Constructor
    public RoadAccident(String vehicleType, String city, int totalNumberOfAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.totalNumberOfAccidents = totalNumberOfAccidents;
    }

    // Getters
    public String getVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getTotalNumberOfAccidents() {
        return totalNumberOfAccidents;
    }
}