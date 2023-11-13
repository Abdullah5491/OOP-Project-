public class Bus {
    private String name;
    private String Id;
    private Seat [][] Seats=new Seat[10][2];
    private String DepartureTime , ArrivalTime;


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

    public Bus(String name, String id,  String departureTime, String arrivalTime) {
        this.name = name;
        Id = id;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
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

    public Seat[][] getSeats() {
        return Seats;
    }


    public void setSeats(Seat[][] seats) {
        Seats = seats;
    }
    public void intializeseats(){
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                Seats[i][j]=new Seat();
                Seats[i][j].setSeatID(i);
                Seats[i][j].setSeatPrice(100);
                Seats[i][j].setCategory("Economy");
                Seats[i][j].setReserved(false);
            }
        }
    }
}
