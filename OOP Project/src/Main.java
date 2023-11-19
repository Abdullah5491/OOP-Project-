public class Main {
    public static void main(String[] args) {
        Bus b1=new Bus("Faisal Movers","123","12:00","12:00","10/10/2023",Terminals.Lahore,Terminals.Karachi);
        Bus b3=new Bus("Faisal Movers","123","12:00","12:00","10/10/2023",Terminals.Multan,Terminals.Karachi);

        Passenger p1=new Passenger("Abdullah",2323,"Male");
        Passenger p2=new Passenger("Alina",232,"Female");
        Bus b2=new Bus("Daewoo","125","12:00","12:00","10/10/2023",Terminals.Karachi,Terminals.Islamabad);

        BusManagement M1=new BusManagement();
       M1.buses.add(b1);
       M1.buses.add(b2);
         M1.buses.add(b3);
       M1.passengers.add(p1);
       M1.passengers.add(p2);
     // M1.displayBuses();
      // M1.displayPassengers();

        M1.bookTicket(1,2323,"Faisal Movers");
        M1.bookTicket(2,2323,"Daewoo");
        M1.bookTicket(3,233,"Faisal Movers");
        M1.bookTicket(4,2323,"Faisal Movers");
        //p1.displayBookedSeats();
        




    }
}