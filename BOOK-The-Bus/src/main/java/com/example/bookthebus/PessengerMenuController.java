package com.example.bookthebus;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Window;

public class PessengerMenuController {


    @FXML
    private ComboBox<String> Arival;

    @FXML
    private TableColumn<Bus, String> Arrivaltime;

    @FXML
    private TableColumn<Bus, Integer> AvailableSeats;

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
    private TableColumn<Bus, String> BusID;




    @FXML
    public void initialize() {
        ObservableList<String> locations = FXCollections.observableArrayList("Lahore", "Islamabad", "Multan", "Karachi");
        Departure.setItems(locations);
        Arival.setItems(locations);

    }
    {
        BusManagement.addBus(new Bus("Faisal Movers", "Fa 123", "4:00", "13:00", "2023-11-26", Terminals.Lahore, Terminals.Karachi, BusCategory.Gold));
        BusManagement.addBus(new Bus("Faisal Movers", "fa 124", "6:00", "14:00", "2023-11-26", Terminals.Lahore, Terminals.Karachi, BusCategory.Gold));
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
             System.out.println(date);
             BusManagement.showAvailableBuses(departure, arrival, date);
                Busname.setCellValueFactory(new PropertyValueFactory<>("name"));
                Departutetime.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
                Arrivaltime.setCellValueFactory(new PropertyValueFactory<>("ArrivalTime"));
                economyprice.setCellValueFactory(new PropertyValueFactory<>("EconomyPrice"));
                Buisnessprice.setCellValueFactory(new PropertyValueFactory<>("LuxuryPrice"));
                AvailableSeats.setCellValueFactory(new PropertyValueFactory<>("AvailableSeats"));
                BusID.setCellValueFactory(new PropertyValueFactory<>("Id"));
                Bustable.setItems(BusManagement.Availablebuses);
            Bustable.setOnMouseClicked((MouseEvent event) -> {
                if (event.getClickCount() == 2 && (!Bustable.getSelectionModel().isEmpty())) {
                    Bus selectedBus = Bustable.getSelectionModel().getSelectedItem();
                    String busID = selectedBus.getId();
                    BooktickectController b=new BooktickectController();
                    BooktickectController.busID=busID;
                    try {
                        b.open(e);
                    } catch (IOException ex) {
                        ex.printStackTrace();}

                }
            });

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
