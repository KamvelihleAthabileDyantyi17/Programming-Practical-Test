class RoadAccidentReport extends RoadAccident {
    private RoadAccident roadAccident;

    // Constructor
    public RoadAccidentReport(RoadAccident roadAccident) {
        this.roadAccident = roadAccident;
    }

    // Method to print the accident report
    public void printAccidentReport() {
        System.out.println("Road Accident Report");
        System.out.println("-------------------");
        System.out.println("Vehicle Type: " + roadAccident.getVehicleType());
        System.out.println("City: " + roadAccident.getCity());
        System.out.println("Total Number of Accidents: " + roadAccident.getTotalNumberOfAccidents());
        System.out.println("-------------------");
    }
}
