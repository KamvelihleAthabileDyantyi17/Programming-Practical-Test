import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input   
 for road accident details{
        System.out.println("Enter vehicle type:");
        String vehicleType = scanner.nextLine();
        System.out.println("Enter city:");
        String city = scanner.nextLine();
        System.out.println("Enter total number of accidents:");
        int totalAccidents = scanner.nextInt();

        // Create a RoadAccident object this is kinda like the combiner of the code 
        RoadAccident roadAccident = new RoadAccident(vehicleType, city, totalAccidents);

        // Create a RoadAccidentReport object and print the report
        RoadAccidentReport roadAccidentReport = new RoadAccidentReport(roadAccident);
        roadAccidentReport.printAccidentReport();
    }
}
}