
import java.util.Scanner;

public class Main {
    // Vehicle properties
    private String vehicleId;
    private float speed;
    private float fuelLevel;

    // Method to update vehicle status
    public void updateVehicleStatus(String id, float newSpeed, float newFuelLevel) {
        // Implement the logic to update vehicle status here
        while (true){
            try {
                if ((newSpeed > -1) && (newFuelLevel > -1)) {
                    this.fuelLevel = newFuelLevel;
                    this.speed = newSpeed;
                    this.vehicleId = id;
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Só pode ser numero.");
            }
        }
    }

    // Method to display vehicle status
    public String getVehicleStatus() {

        return "Vehicle " + this.vehicleId + ": " + "Speed = " + this.speed + " km/h, Fuel = " + this.fuelLevel + "%";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        Main vehicle = new Main();
        vehicle.updateVehicleStatus(parts[0], Float.parseFloat(parts[1]), Float.parseFloat(parts[2]));
        System.out.println(vehicle.getVehicleStatus());

        scanner.close();
    }
}