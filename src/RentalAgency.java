import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();

    public void initializeVehicles() {
        fleet.add(new Car("C001", "Toyota Corolla", 50));
        fleet.add(new Motorcycle("M001", "Yamaha MT-07", 30));
        fleet.add(new Truck("T001", "Ford F-150", 100));
    }

    public void displayAllVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                if (vehicle instanceof Rentable rentable) {
                    rentable.rent(customer, days);
                    System.out.println("Rental cost: " + vehicle.calculateRentalCost(days));
                }
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }

    public void setFleet(List<Vehicle> fleet) {
        this.fleet = fleet;
    }
}
