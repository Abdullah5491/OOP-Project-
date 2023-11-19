import java.util.ArrayList;
import java.util.Scanner;

public class BusManagement {
    ArrayList<Passenger> passengers = new ArrayList<>();
    public static ArrayList<Bus> buses = new ArrayList<>();

    public void displayBuses() {
        for (Bus b : buses) {
            System.out.println(b);
        }
    }

    public void displayPassengers() {
        for (Passenger p : passengers) {
            System.out.println(p);
        }
    }


    public void bookTicket(int SeatId, int passengerID, String BusName) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getName().equals(BusName)) {
                for (int j = 0; j < 10; j++)
                    for (int k = 0; k < 2; k++)
                        if (buses.get(i).getSeats()[j][k].getSeatID() == SeatId && !buses.get(i).getSeats()[j][k].getReserved()) {
                            for (int l = 0; l < passengers.size(); l++) {
                                if (passengers.get(l).getId() == passengerID) {
                                    passengers.get(l).Bookedseats.add(BusManagement.buses.get(i).getSeats()[j][k]);
                                    buses.get(i).getSeats()[j][k].setReserved(true);
                                }
                            }
                        }
            }

        }
    }

    public void CancelTicket(int pessengerID, int SeatID, String BusName) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getName().equals(BusName)) {
                for (int j = 0; j < 10; j++)
                    for (int k = 0; k < 2; k++)
                        if (buses.get(i).getSeats()[j][k].getSeatID() == SeatID && buses.get(i).getSeats()[j][k].getReserved()) {
                            for (int l = 0; l < passengers.size(); l++) {
                                if (passengers.get(l).getId() == pessengerID) {
                                    passengers.get(l).removeBookedSeat(buses.get(i).getSeats()[j][k]);
                                    buses.get(i).getSeats()[j][k].setReserved(false);
                                }
                            }
                        }
            }

        }

    }

    public void UpdateTicket() {

    }

    public void showTicketDetails(int passengerID) {
       for (int i=0;i<buses.size();i++)
              for (int j=0;j<10;j++)
                for (int k=0;k<2;k++)
                     for (int l=0;l<passengers.size();l++)
                          if (passengers.get(l).getId()==passengerID )
                            if(passengers.get(l).Bookedseats.contains(buses.get(i).getSeats()[j][k])){
                                System.out.println(passengers.get(l));
                                System.out.println(buses.get(i));
                                System.out.println(buses.get(i).getSeats()[j][k]);
                            }

    }



}


