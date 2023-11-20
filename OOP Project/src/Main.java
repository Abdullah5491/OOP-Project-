public class Main {
    public static void main(String[] args) {
        Bus b1=new Bus("Faisal Movers","Fa 123","4:00","13:00","10/10/2023",Terminals.Lahore,Terminals.Karachi);
        Bus b3=new Bus("Faisal Movers","fa 124","6:00","14:00","10/10/2023",Terminals.Multan,Terminals.Karachi);

        Passenger p1=new Passenger("Abdullah",2323,"Male");
        Passenger p2=new Passenger("Alina",232,"Female");
        Bus b2=new Bus("Daewoo","Da 125","2:00","13:00","10/10/2023",Terminals.Karachi,Terminals.Islamabad);

        BusManagement M1=new BusManagement();
       M1.buses.add(b1);
       M1.buses.add(b2);
         M1.buses.add(b3);
       M1.passengers.add(p1);
       M1.passengers.add(p2);
     // M1.displayBuses();
      // M1.displayPassengers();

        M1.bookTicket(1,2323,"Fa 123");
        M1.bookTicket(2,2323,"Da 125");
        M1.bookTicket(3,233,"Fa 124");
        M1.bookTicket(4,2323,"Fa 123");
        //p1.displayBookedSeats();
      //  M1.showAvailableBuses("Lahore","Karachi");

M1.sortBuses();
M1.displayBuses();



    }
}