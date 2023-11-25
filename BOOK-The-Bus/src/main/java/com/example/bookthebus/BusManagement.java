package com.example.bookthebus;

import java.util.ArrayList;
import java.util.Scanner;

public class BusManagement {
    public static ArrayList<Passenger> passengers = new ArrayList<>();
    public  static ArrayList<Bus> buses = new ArrayList<>();
    public static ArrayList<Discounts> discounts = new ArrayList<>();
    public static ArrayList<BusStaff> busStaff = new ArrayList<>();
    public int bookingcounter=0;

public void addBus(Bus bus){
    for (int i=0;i<buses.size();i++)
        if (buses.get(i).getId().equals(bus.getId())&&buses.get(i).getDate().equals(bus.getDate())){
            System.out.println("Bus with this ID already exists");
            return;
        }
      buses.add(bus);

}
public void addPassenger(Passenger passenger){
    for (int i=0;i<passengers.size();i++)
        if (passengers.get(i).getId()==passenger.getId()){
            System.out.println("Passenger with this ID already exists");
            return;
        }
    passengers.add(passenger);}
 public void addDiscount(String DiscountCode, double DiscountPercentage) {
     for (int i=0;i<discounts.size();i++)
         if (discounts.get(i).getDiscountCode().equals(DiscountCode)){
             System.out.println("Discount with this code already exists");
             return;
         }
        discounts.add(new Discounts(DiscountCode, DiscountPercentage));
    }
    public void addStaff(BusStaff staff){
        for (int i=0;i<busStaff.size();i++)
            if (busStaff.get(i).getStaffId()==staff.getStaffId()){
                System.out.println("Staff with this ID already exists");
                return;
            }
        busStaff.add(staff);
    }
    public void assignstaffduty(String BusId, int staffID, StaffRoles role) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getId().equals(BusId)) {
                for (int j = 0; j < busStaff.size(); j++) {
                    if (busStaff.get(j).getStaffId() == staffID) {
                        if (role == StaffRoles.Driver) {
                            buses.get(i).setDriver(busStaff.get(j));
                            busStaff.get(j).buseDuties.add(buses.get(i));

                        } else if (role == StaffRoles.BusHostess) {
                            buses.get(i).setBusHostess(busStaff.get(j));
                            busStaff.get(j).buseDuties.add(buses.get(i));
                        }
                    }
                }
            }
        }
    }

public void showStaffDuties(int staffID){

        for (int i=0;i<busStaff.size();i++)
            if (busStaff.get(i).getStaffId()==staffID){
                System.out.println(busStaff.get(i).buseDuties);
            }
 }
 public void addBusExpense(String BusId, double expense){
     for (int i=0;i<buses.size();i++)
         if (buses.get(i).getId().equals(BusId)){
             buses.get(i).setOtherExpenses(expense);
         }
}

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


    public void bookTicket(int SeatId, int passengerID, String BusId) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getId().equals(BusId)) {
                for (int j = 0; j < 8; j++)
                    for (int k = 0; k < 4; k++)
                        if (buses.get(i).getSeats()[j][k].getSeatID() == SeatId && !buses.get(i).getSeats()[j][k].getReserved()) {
                            for (int l = 0; l < passengers.size(); l++) {
                                if (passengers.get(l).getId() == passengerID) {
                                    passengers.get(l).Bookedseats.add(BusManagement.buses.get(i).getSeats()[j][k]);
                                    buses.get(i).getSeats()[j][k].setReserved(true);
                                    buses.get(i).getSeats()[j][k].setBookingID(bookingcounter++);
                                    buses.get(i).addSales(buses.get(i).getSeats()[j][k].getSeatPrice());

                                }
                            }
                        }
            }

        }
    }

    public void bookTicket(int SeatId, int passengerID, String BusId,String Discountcode) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getId().equals(BusId)) {
                for (int j = 0; j < 8; j++)
                    for (int k = 0; k < 4; k++)
                        if (buses.get(i).getSeats()[j][k].getSeatID() == SeatId && !buses.get(i).getSeats()[j][k].getReserved()) {
                            for (int l = 0; l < passengers.size(); l++) {
                                if (passengers.get(l).getId() == passengerID) {
                                    passengers.get(l).Bookedseats.add(BusManagement.buses.get(i).getSeats()[j][k]);
                                    buses.get(i).getSeats()[j][k].setReserved(true);
                                    buses.get(i).getSeats()[j][k].setBookingID(bookingcounter++);
                                    buses.get(i).addSales(buses.get(i).getSeats()[j][k].getSeatPrice());

                                    for (int m=0;m<discounts.size();m++){
                                        if (discounts.get(m).getDiscountCode().equals(Discountcode)){
                                            buses.get(i).Discounts.add(buses.get(i).getSeats()[j][k].getSeatPrice()*discounts.get(m).getDiscountPercentage());
                                            buses.get(i).getSeats()[j][k].setSeatPrice(buses.get(i).getSeats()[j][k].getSeatPrice()-buses.get(i).getSeats()[j][k].getSeatPrice()*discounts.get(m).getDiscountPercentage());

                                        }
                                    }
                                }
                            }
                        }
            }

        }
    }
    public void CancelTicket(int pessengerID, int SeatID, String BusName) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getName().equals(BusName)) {
                for (int j = 0; j < 8; j++)
                    for (int k = 0; k < 4; k++)
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

    public void showAvailableBuses(String Departure, String Arrival) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getDepartureTerminal().toString().equals(Departure) && buses.get(i).getArrivalTerminal().toString().equals(Arrival)) {
                System.out.println(buses.get(i));
            }
        }
    }
    public void showAvailableBuses(String Departure, String Arrival,String Date) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getDepartureTerminal().toString().equals(Departure) && buses.get(i).getArrivalTerminal().toString().equals(Arrival) && buses.get(i).getDate().equals(Date)) {
                System.out.println(buses.get(i));
            }
        }
    }
    public void showAvailableBuses(String Departure, String Arrival,String Date,String DepartureTime) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getDepartureTerminal().toString().equals(Departure) && buses.get(i).getArrivalTerminal().toString().equals(Arrival) && buses.get(i).getDate().equals(Date) && buses.get(i).getDepartureTime().equals(DepartureTime)) {
                System.out.println(buses.get(i));
            }
        }
    }
    public void sortBuses(){
        for (int i=0;i<buses.size();i++)
            for (int j=0;j<buses.size()-1;j++)
                if (buses.get(j).getDepartureTime().compareTo(buses.get(j+1).getDepartureTime())>0){
                    Bus temp=buses.get(j);
                    buses.set(j,buses.get(j+1));
                    buses.set(j+1,temp);
                }
    }
    public void showTicketDetails(int passengerID) {
       for (int i=0;i<buses.size();i++)
              for (int j=0;j<8;j++)
                for (int k=0;k<4;k++)
                     for (int l=0;l<passengers.size();l++)
                          if (passengers.get(l).getId()==passengerID )
                            if(passengers.get(l).Bookedseats.contains(buses.get(i).getSeats()[j][k])){
                                System.out.println(passengers.get(l));
                                System.out.println(buses.get(i));
                                System.out.println(buses.get(i).getSeats()[j][k]);
                            }

    }

    public void getBusDetails(String BusId) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getId().equals(BusId)) {
                System.out.println(buses.get(i));
            }
        }
    }
    public void PassangerAccountDetails(int passengerID){
        for (int i=0;i<passengers.size();i++)
            if (passengers.get(i).getId()==passengerID){
                System.out.println(passengers.get(i).getAccount());
            }
    }
    public void StaffAccountDetails(int staffID){
        for (int i=0;i<busStaff.size();i++)
            if (busStaff.get(i).getStaffId()==staffID){
                System.out.println(busStaff.get(i).getAccount());
            }
    }


}


