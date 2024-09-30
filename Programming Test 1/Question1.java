import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][][] myArray = new String[3][3][2]; // Use 2 for car and bike accidents
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[][] numberOfCars = {{155, 178, 112}, {121, 145, 89}}; // Store car and bike accidents separately

        // Get the input for missing accident data
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number of car accidents for " + cities[i] + ": ");
            myArray[i][0][0] = scanner.nextLine();
            System.out.println("Enter the number of bike accidents for " + cities[i] + ": ");
            myArray[i][0][1] = scanner.nextLine();
        }

        System.out.println("---------------------------------------\n");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("-----------------------------------------\n");

        // Display the array with all its findings
        System.out.println("CITY  CAR ACCIDENTS  BIKE ACCIDENTS");
        for (int i = 0; i < 3; i++) {
            System.out.println(cities[i] + "  " + myArray[i][0][0] + "  " + myArray[i][0][1]);
        }

        System.out.println("-----------------------------------------\n");

        // Display the total accidents for each city
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        for (int i = 0; i < 3; i++) {
            int totalAccidents = Integer.parseInt(myArray[i][0][0]) + Integer.parseInt(myArray[i][0][1]);
            System.out.println("Total accidents for " + cities[i] + ": " + totalAccidents);
        }

        // Find the city with the most accidents
        int maxAccidents = 0;
        String cityWithMostAccidents = "";
        for (int i = 0; i < 3; i++) {
            int totalAccidents = Integer.parseInt(myArray[i][0][0]) + Integer.parseInt(myArray[i][0][1]);
            if (totalAccidents > maxAccidents) {
                maxAccidents = totalAccidents;
                cityWithMostAccidents = cities[i];
            }
        }
        System.out.println("City with the most accidents: " + cityWithMostAccidents);
    }
}