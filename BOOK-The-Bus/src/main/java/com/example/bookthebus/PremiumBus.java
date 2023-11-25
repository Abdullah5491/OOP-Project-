package com.example.bookthebus;

public class PremiumBus extends Bus{
    private Seat [][] Seats=new Seat[8][4];

    public PremiumBus(String name, String id, String departureTime, String arrivalTime, String Date, Terminals departureTerminal, Terminals arrivalTerminal, BusCategory category, String departureDate) {
        super(name, id, departureTime, arrivalTime, Date, departureTerminal, arrivalTerminal, category, departureDate);
    }


    @Override
    public Seat[][] getSeats() {
        return Seats;
    }

    @Override
    public void setSeats(Seat[][] seats) {
        Seats = seats;
    }

    {  int counter=1;
        for(int i=0;i<8;i++){
            for(int j=0;j<4;j++){
                Seats[i][j]=new Seat();
                Seats[i][j].setSeatID(counter++);
                Seats[i][j].setSeatPrice(getLuxuryPrice());
                Seats[i][j].setCategory("luxury");
                if (i>=4){
                    Seats[i][j].setSeatPrice(getEconomyPrice());
                    Seats[i][j].setCategory("economy");}
                Seats[i][j].setReserved(false);
            }
        }
    }


    public void ShowSeats(){
        for(int i=0;i<8;i++){
            for(int j=0;j<4;j++){
                System.out.println(Seats[i][j]);
            }
        }
    }
}
