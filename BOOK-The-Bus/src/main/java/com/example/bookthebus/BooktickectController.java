package com.example.bookthebus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BooktickectController {
    @FXML
    private GridPane seatGrid;
    @FXML
    private Label SeatsMessage;

    public static String busID;
    public static String passengeremail;
    PessengerMenuController a=new PessengerMenuController();
    BusManagement b=new BusManagement();


    @FXML
    public void initialize() {
        BusManagement.getSeats(busID);
        System.out.println(busID);
        System.out.println("Seats: " + BusManagement.seats.size());



        for (Seat seat : BusManagement.seats) {


            Button seatButton = new Button(String.valueOf(seat.getSeatID()));
            if (seat.getReserved()) {
                seatButton.setStyle("-fx-background-color: red;");
            } else {
                seatButton.setStyle("-fx-background-color: green;");
            }


            seatButton.setOnAction(e -> {

                if (!seat.getReserved()) {
                    b.bookTicket(seat.getSeatID(), passengeremail, busID);
                    seat.setReserved(true);
                    SeatsMessage.setText("Seat " + seat.getSeatID() + " is Successfully Booked.");
                    seatButton.setStyle("-fx-background-color: red;");
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
        Parent root = FXMLLoader.load(getClass().getResource("PassengerDashboard.fxml"));
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
