package com.example.bookthebus;

public class Tickets {
    private String Passengername;
    private String PassengerID;
    private String Busname;
    private String Cityfrom;
    private String Cityto;
    private String Date;
    private String TotalPrice;
    private String TotalDiscount;
    private String seatcategory;
    private String seatnumber;
    private String seatprice;
    private String Discountcode;
    public  int ticketID;
    private String BusID;
    private String Passengeremail;

    public String getPassengername() {
        return Passengername;
    }

    public void setPassengername(String passengername) {
        Passengername = passengername;
    }

    public String getPassengerID() {
        return PassengerID;
    }

    public void setPassengerID(String passengerID) {
        PassengerID = passengerID;
    }

    public String getBusname() {
        return Busname;
    }

    public void setBusname(String busname) {
        Busname = busname;
    }

    public String getCityfrom() {
        return Cityfrom;
    }

    public String getBusID() {
        return BusID;
    }

    public void setBusID(String busID) {
        BusID = busID;
    }

    public void setCityfrom(String cityfrom) {
        Cityfrom = cityfrom;
    }

    public String getCityto() {
        return Cityto;
    }

    public void setCityto(String cityto) {
        Cityto = cityto;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        TotalDiscount = totalDiscount;
    }

    public String getSeatcategory() {
        return seatcategory;
    }

    public String getPassengeremail() {
        return Passengeremail;
    }

    public void setPassengeremail(String passengeremail) {
        Passengeremail = passengeremail;
    }

    public void setSeatcategory(String seatcategory) {
        this.seatcategory = seatcategory;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getSeatprice() {
        return seatprice;
    }

    public void setSeatprice(String seatprice) {
        this.seatprice = seatprice;
    }

    public String getDiscountcode() {
        return Discountcode;
    }

    public void setDiscountcode(String discountcode) {
        Discountcode = discountcode;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Tickets(String passengername, String passengerID, String passengeremail ,String BusID,String busname, String cityfrom, String cityto, String date, String totalPrice, String totalDiscount, String seatcategory, String seatnumber, String seatprice, String discountcode,int ticketID) {
        Passengername = passengername;
        PassengerID = passengerID;
        Busname = busname;
        Cityfrom = cityfrom;
        Cityto = cityto;
        Date = date;
        TotalPrice = totalPrice;
        TotalDiscount = totalDiscount;
        this.seatcategory = seatcategory;
        this.seatnumber = seatnumber;
        this.seatprice = seatprice;
        Discountcode = discountcode;
        Passengeremail=passengeremail;
        this.BusID=BusID;
        this.ticketID=ticketID;
    }


}
