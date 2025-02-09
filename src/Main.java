// Kaden Jain
// Computer Programming 1 - Spring 2025
/* Purpose: A program that uses home maintenance costs for each of
the four seasons and returns the total yearly maintenance costs */

public class Main {
    public static void main(String[] args) {

        // declare variables
        double springCost = 134.32;
        double summerCost = 98.50;
        double fallCost = 111.12;
        double winterCost = 150.37;
        double totalMaintenanceCost;

        // logic
        totalMaintenanceCost = springCost + summerCost + fallCost + winterCost;

        // print output
        System.out.println("The maintenance cost for Spring was: $" + springCost);
        System.out.println("The maintenance cost for Summer was: $" + summerCost);
        System.out.println("The maintenance cost for Fall was: $" + fallCost);
        System.out.println("The maintenance cost for Winter was: $" + winterCost);
        System.out.println("The total maintenance cost for the year was: $" + totalMaintenanceCost);

    }
}