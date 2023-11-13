public class Bus {
    private String name;
    private String Id;
    private int [] Seats;

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

    public Bus(String name, String id, int[] seats) {
        this.name = name;
        Id = id;
        Seats = seats;
    }
}
