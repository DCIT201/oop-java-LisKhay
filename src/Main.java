public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        agency.initializeVehicles();
        
        // Example: Renting a car
        Customer customer = new Customer("John Doe", "johndoe@gmail.com");
        agency.rentVehicle("C001", customer, 5);
        agency.displayAllVehicles();
    }
}
