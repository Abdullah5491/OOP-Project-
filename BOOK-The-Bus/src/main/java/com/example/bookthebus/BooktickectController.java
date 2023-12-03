package com.example.bookthebus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BooktickectController {
    @FXML
    private GridPane seatGrid;
    @FXML
    private Label SeatsMessage;

    @FXML
    private Button Applycode;

    @FXML
    private Button Back;

    @FXML
    private Label Busname;

    @FXML
    private Label Cityfrom;

    @FXML
    private Label Cityto;

    @FXML
    private Label Date;

    @FXML
    private TextField Discountcode;

    @FXML
    private Label PassengerID;

    @FXML
    private Label Passengername;

    @FXML
    private AnchorPane TicketDetails;

    @FXML
    private Label TotalDiscount;

    @FXML
    private Label TotalPrice;

    @FXML
    private Button cancel;

    @FXML
    private Button confirm;

    @FXML
    private Label seatcategory;

    @FXML
    private Label seatnumber;
    @FXML
    private AnchorPane seatbooking;
    @FXML
    private Label seatprice;
    private String DCode;
    public static String filename;



    public static String busID;
    public static String passengeremail;
    public static String passengername;
    public static String passengerid;
    public static int ticketID;

    PessengerMenuController a=new PessengerMenuController();
    BusManagement b=new BusManagement();




    @FXML
    public void initialize() {
        BusManagement.getSeats(busID);
        System.out.println(busID);
        System.out.println("Seats: " + BusManagement.seats.size());
        Bus bus = BusManagement.getBusDetails(busID);



        for (Seat seat : BusManagement.seats) {


            Button seatButton = new Button(String.valueOf(seat.getSeatID()));
            if (seat.getReserved()) {
                seatButton.setStyle("-fx-background-color: red;");
            } else {
                seatButton.setStyle("-fx-background-color: green;");
            }


            seatButton.setOnAction(e -> {

                if (!seat.getReserved()) {
                    {
                        Passengername.setText(passengername);
                        PassengerID.setText(passengerid);
                        TicketDetails.setVisible(true);
                        seatbooking.setVisible(false);
                        assert bus != null;
                        Busname.setText(bus.getName());
                        Cityfrom.setText(bus.getDepartureTerminal().toString());
                        Cityto.setText(bus.getArrivalTerminal().toString());
                        Date.setText(bus.getDate());
                        seatnumber.setText(String.valueOf(seat.getSeatID()));
                        seatcategory.setText(seat.getCategory());
                        DCode = Discountcode.getText();
                        seatprice.setText(String.valueOf(seat.getSeatPrice()));
                        TotalPrice.setText(String.valueOf(seat.getSeatPrice()));

                        Applycode.setOnAction(event -> {
                            TotalDiscount.setText(String.valueOf(b.Discountedprice(busID,seat.getSeatID(),DCode)));
                            TotalPrice.setText(String.valueOf(seat.getSeatPrice()));
                        });
                        confirm.setOnAction(event -> {
                            TicketDetails.setVisible(false);
                            seatbooking.setVisible(true);
                            seat.setReserved(true);
                            BusManagement.setAvailableseat(busID);
                           ticketID= PessengerMenuController.ticketid++;
                            SeatsMessage.setText("Seat " + seat.getSeatID() + " is Successfully Booked.");
                            seatButton.setStyle("-fx-background-color: red;");
                            Tickets ticket = new Tickets(passengername,passengerid,passengeremail,busID,bus.getName(),Cityfrom.getText(),Cityto.getText(),Date.getText(),TotalPrice.getText(),TotalDiscount.getText(),seat.getCategory(),String.valueOf(seat.getSeatID()),String.valueOf(seat.getSeatPrice()),DCode,ticketID);

                            BusManagement.addTicket(ticket);
                        });

                        cancel.setOnAction(event -> {
                            TicketDetails.setVisible(false);
                            seatbooking.setVisible(true);
                        });


                    }



                }
                else {
                    SeatsMessage.setText("Seat " + seat.getSeatID() + " is Already Booked.");
                }});


            seatButton.setPrefSize(30, 30);
            seatGrid.add(seatButton, seat.getSeatID() % 4, seat.getSeatID() / 4);
            seatGrid.setVgap(10);
            seatGrid.setHgap(10);
        }




    }

    public void backbuttononaction(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(filename));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    public void open(ActionEvent e) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Bookticket.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
