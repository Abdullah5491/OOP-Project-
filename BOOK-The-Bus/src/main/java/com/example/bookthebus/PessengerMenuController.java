package com.example.bookthebus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.IOException;

public class PessengerMenuController {


    @FXML
    private ComboBox<String> Arival;

    @FXML
    private TableColumn<Bus, String> Arrivaltime;

    @FXML
    private TableColumn<Bus, String> Availableseats;

    @FXML
    private TableColumn<Bus, Double> Buisnessprice;

    @FXML
    private TableColumn<Bus, String> Busname;

    @FXML
    private TableView<Bus> Bustable;

    @FXML
    private DatePicker Datepicker;

    @FXML
    private ComboBox<String> Departure;

    @FXML
    private TableColumn<Bus, String> Departutetime;

    @FXML
    private Label DisplayMessage;

    @FXML
    private Button Logoutbutton;

    @FXML
    private Button Searchbutton;

    @FXML
    private TableColumn<Bus, Double> economyprice;




    @FXML
    public void initialize() {
        ObservableList<String> locations = FXCollections.observableArrayList("Lahore", "Islamabad", "Multan", "Karachi");
        Departure.setItems(locations);
        Arival.setItems(locations);
    }

    public void Searchbuttononaction(ActionEvent e) throws IOException {
        if (Departure.getValue() != null && Departure.getValue().equals(Arival.getValue())) {
            DisplayMessage.setText("Departure and Arrival can't be same");
        } else if (Datepicker.getValue() == null) {
            DisplayMessage.setText("Please select a date");
        } else  {
             String departure = Departure.getValue();
             String arrival = Arival.getValue();
             String date = Datepicker.getValue().toString();
             BusManagement.showAvailableBuses(departure, arrival, date);
             ObservableList<Bus> buses = FXCollections.observableArrayList(new Bus("Faisal Movers", "Fa 123", "4:00", "13:00", "10/10/2023", Terminals.Lahore, Terminals.Karachi, BusCategory.Gold, "12/10/2023"));

                Busname.setCellValueFactory(new PropertyValueFactory<>("name"));
                Departutetime.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
                Arrivaltime.setCellValueFactory(new PropertyValueFactory<>("ArrivalTime"));
                economyprice.setCellValueFactory(new PropertyValueFactory<>("EconomyPrice"));
                Buisnessprice.setCellValueFactory(new PropertyValueFactory<>("LuxuryPrice"));
//                Availableseats.setCellValueFactory(new PropertyValueFactory<>("AvailableSeats"));
                Bustable.setItems(buses);


             }
    }

    public void Logouttononaction(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
