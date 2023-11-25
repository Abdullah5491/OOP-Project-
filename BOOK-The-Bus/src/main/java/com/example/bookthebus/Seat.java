package com.example.bookthebus;

public class Seat {
    private int SeatID;
    private double SeatPrice;
    private String Category;
    private Boolean Reserved;
    private int BookingID;
    private String BookingDate;
    private String BookingTime;

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String bookingDate) {
        BookingDate = bookingDate;
    }

    public String getBookingTime() {
        return BookingTime;
    }

    public void setBookingTime(String bookingTime) {
        BookingTime = bookingTime;
    }

    public int getSeatID() {
        return SeatID;
    }

    public void setSeatID(int seatID) {
        SeatID = seatID;
    }

    public double getSeatPrice() {
        return SeatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        SeatPrice = seatPrice;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }


    public Boolean getReserved() {
        return Reserved;
    }

    public void setReserved(Boolean reserved) {
        Reserved = reserved;
    }
    public String toString(){
        return String.format("Seat ID: %d,  Seat Price: %.2f,  Category: %s,  Reserved: %b",SeatID,SeatPrice,Category,Reserved);
    }


}
