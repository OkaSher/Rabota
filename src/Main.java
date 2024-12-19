public class Main {
    public static void main(String[] args) {
        // Create Flights
        Flight flight1 = new Flight("F123", "New York", 50);
        Flight flight2 = new Flight("F456", "London", 20);

        // Create Passengers
        Passenger passenger1 = new Passenger("Vasya Pupkin", "A12345678");
        Passenger passenger2 = new Passenger("Jane Smith", "B98765432");

        // Create Bookings
        Booking booking1 = new Booking(passenger1, flight1);
        Booking booking2 = new Booking(passenger2, flight2);

        // Output Details
        System.out.println("Available Flights:");
        System.out.println(flight1);
        System.out.println(flight2);

        System.out.println("\nPassenger Details:");
        System.out.println(passenger1);
        System.out.println(passenger2);

        System.out.println("\nBookings:");
        System.out.println(booking1);
        System.out.println(booking2);

        // Compare Objects
        System.out.println("\nAre bookings equal? " + booking1.equals(booking2));
    }
}
