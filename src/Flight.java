public class Flight {
    private String flightNumber;
    private String destination;
    private int seatsAvailable;

    public Flight(String flightNumber, String destination, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    @Override
    public String toString() {
        return "Flight [Number=" + flightNumber + ", Destination=" + destination + ", Seats Available=" + seatsAvailable + "]";
    }
}
