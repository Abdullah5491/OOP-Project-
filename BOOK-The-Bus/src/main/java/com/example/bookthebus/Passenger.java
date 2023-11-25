package com.example.bookthebus;

import java.util.ArrayList;

public class Passenger {
    private String name;
    private String Id;
    private String gender;
    private Accounts account;
   public ArrayList<Seat> Bookedseats=new ArrayList<>();

//    public Passenger(String name, String id,String gender) {
//        this.name = name;
//        this.Id = id;
//        this.gender=gender;
//
//    }

    public Passenger(String name, String id, String gender, String emailAddress, String contactNumber, String password) {
        this.name = name;
        Id = id;
        this.gender = gender;
        this.account = new Accounts(emailAddress, contactNumber, password);

    }
//    public Passenger(String name, long id, String gender, String contactNumber, String password) {
//        this.name = name;
//        Id = id;
//        this.gender = gender;
//        this.account = new Accounts(contactNumber, password);
//
//    }
//    public Passenger(String name, String emailAddress,long id, String gender,  String password) {
//        this.name = name;
//        Id = id;
//        this.gender = gender;
//        this.account = new Accounts(emailAddress, password);
//
//    }


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Accounts getAccount() {
        return account;
    }

    public ArrayList<Seat> getBookedseats() {
        return Bookedseats;
    }

    public void setBookedseats(ArrayList<Seat> bookedseats) {
        Bookedseats = bookedseats;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public String toString(){
        return String.format("Passenger Name: %s, Passenger Id: %d, Gender: %s",name,Id,gender);
    }

    public void removeBookedSeat(Seat s){
            s.setReserved(false);
            Bookedseats.remove(s);
        }
        public void displayBookedSeats(){
            for(Seat s:Bookedseats){
                System.out.println(s);
            }
        }


}
