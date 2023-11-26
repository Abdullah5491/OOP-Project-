package com.example.bookthebus;

import java.util.ArrayList;
import java.util.Arrays;

public class Bus {
    private String name;
    private String Id;
    private Seat[][] Seats = new Seat[8][4];
    private String DepartureTime, ArrivalTime;
    private String Date;
    private Terminals DepartureTerminal, ArrivalTerminal;
    private BusStaff driver;
    private BusStaff busHostess;
    private BusCategory category;
    private double EconomyPrice = 1000;
    private double LuxuryPrice = 1500;
    public ArrayList<Double> Sales=new ArrayList<>();
    public ArrayList<Double> Discounts=new ArrayList<>();
    private double TotalSales;
    private double TotalDiscount;
    private double OtherExpenses;
    private double TotalExpense;
    private double TotalProfit;
    private String DepartureDate;
    private int AvailableSeats=32;


    public Bus(String name, String id, String departureTime, String arrivalTime, String Date, Terminals departureTerminal, Terminals arrivalTerminal, BusCategory category, String departureDate) {
        this.name = name;
        Id = id;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        DepartureTerminal = departureTerminal;
        ArrivalTerminal = arrivalTerminal;
        this.Date = Date;
        this.category = category;
        this.DepartureDate = departureDate;
    }
    public void calculateTotalSales(){
        double sum=0;
        for (Double sale:Sales){
            sum+=sale;
        }
        TotalSales=sum;
    }
    public void calculateTotalDiscount(){
        double sum=0;
        for (Double discount:Discounts){
            sum+=discount;
        }
        TotalDiscount=sum;
    }
    public void calculateTotalExpense(){
        TotalExpense=OtherExpenses+((driver.getSalary()+busHostess.getSalary())/30);
    }
    public void calculateTotalProfit(){
        TotalProfit=TotalSales-TotalExpense;
    }

    public double getOtherExpenses() {
        return OtherExpenses;
    }

    public void setOtherExpenses(double otherExpenses) {
        OtherExpenses = otherExpenses;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(String departureDate) {
        DepartureDate = departureDate;
    }

    public double getTotalProfit() {
        return TotalProfit;
    }
    public void addSales(double sale){
        Sales.add(sale);
    }

    public void setTotalProfit(double totalProfit) {
        TotalProfit = totalProfit;
    }

    public ArrayList<Double> getSales() {
        return Sales;
    }

    public void setSales(ArrayList<Double> sales) {
        Sales = sales;
    }

    public ArrayList<Double> getDiscounts() {
        return Discounts;
    }

    public void setDiscounts(ArrayList<Double> discounts) {
        Discounts = discounts;
    }


    public double getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(double totalSales) {
        TotalSales = totalSales;
    }

    public double getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        TotalDiscount = totalDiscount;
    }

    public double getTotalExpense() {
        return TotalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        TotalExpense = totalExpense;
    }

    public int getAvailableSeats() {
        return AvailableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        AvailableSeats = availableSeats;
    }

    public BusStaff getDriver() {
        return driver;
    }

    public void setDriver(BusStaff driver) {
        this.driver = driver;
    }

    public BusStaff getBusHostess() {
        return busHostess;
    }

    public void setBusHostess(BusStaff busHostess) {
        this.busHostess = busHostess;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Terminals getDepartureTerminal() {
        return DepartureTerminal;
    }

    public void setDepartureTerminal(Terminals departureTerminal) {
        DepartureTerminal = departureTerminal;
    }

    public Terminals getArrivalTerminal() {
        return ArrivalTerminal;
    }

    public void setArrivalTerminal(Terminals arrivalTerminal) {
        ArrivalTerminal = arrivalTerminal;
    }

    public void setSeats(Seat[][] seats) {
        Seats = seats;
    }

    public BusCategory getCategory() {
        return category;
    }

    public void setCategory(BusCategory category) {
        this.category = category;
    }

    public double getEconomyPrice() {
        return EconomyPrice;
    }

    public void setEconomyPrice(double economyPrice) {
        EconomyPrice = economyPrice;
    }

    public double getLuxuryPrice() {
        return LuxuryPrice;
    }

    public void setLuxuryPrice(double luxuryPrice) {
        LuxuryPrice = luxuryPrice;
    }

    {
        int counter = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                Seats[i][j] = new Seat();
                Seats[i][j].setSeatID(counter++);
                Seats[i][j].setSeatPrice(EconomyPrice);
                Seats[i][j].setCategory("economy");
                Seats[i][j].setReserved(false);
            }
        }
    }

    public void ShowSeats() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(Seats[i][j]);
            }
        }
    }


    @Override
    public String toString() {
        return String.format("Bus Name: %s, BUS Id: %s, Departure Time: %s, Arrival Time: %s, Bus Category: %s", name, Id, DepartureTime, ArrivalTime, category);
    }


}
