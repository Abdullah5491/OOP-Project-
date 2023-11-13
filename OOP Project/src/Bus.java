public class Bus {
    private String name;
    private String Id;
    private int [] Seats;
    private String DepartureTime , ArrivalTime;
    private boolean status;

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public Bus(String name, String id, int[] seats, String departureTime, String arrivalTime, boolean status) {
        this.name = name;
        Id = id;
        Seats = seats;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int[] getSeats() {
        return Seats;
    }

    public void setSeats(int[] seats) {
        Seats = seats;
    }

    public void BookSeat(){

    }


    public boolean isAvailable() {
        return isAvailable();
    }
}
