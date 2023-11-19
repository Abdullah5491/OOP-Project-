import java.util.Arrays;

public class Bus {
    private String name;
    private String Id;
    private Seat [][] Seats=new Seat[10][2];
    private String DepartureTime , ArrivalTime;
    private String Date;
    private Terminals DepartureTerminal,ArrivalTerminal;

    public Bus(String name, String id, String departureTime, String arrivalTime,String Date ,Terminals departureTerminal, Terminals arrivalTerminal) {
        this.name = name;
        Id = id;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        DepartureTerminal = departureTerminal;
        ArrivalTerminal = arrivalTerminal;
        this.Date=Date;
    }

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
    {  int counter=1;
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                Seats[i][j]=new Seat();
                Seats[i][j].setSeatID(counter++);
                Seats[i][j].setSeatPrice(1000);
                Seats[i][j].setCategory("luxury");
                if (i>=4)
                    Seats[i][j].setCategory("economy");
                Seats[i][j].setReserved(false);
            }
        }
    }
   public void ShowSeats(){
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                System.out.println(Seats[i][j]);
            }
        }
    }


    @Override
    public String toString() {
        return String.format("Bus Name: %s, BUS Id: %s, Departure Time: %s, Arrival Time: %s",name,Id,DepartureTime,ArrivalTime);
    }
}
