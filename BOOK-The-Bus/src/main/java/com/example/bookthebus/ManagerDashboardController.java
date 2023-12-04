package com.example.bookthebus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerDashboardController {

    @FXML
    private TextField Call;

    @FXML
    private Button Dashboard;

    @FXML
    private TextField ID_bus;

    @FXML
    private Button add;

    @FXML
    private Label available;

    @FXML
    private Button available_buses;

    @FXML
    private AnchorPane available_buses_form;

    @FXML
    private AnchorPane booking_tickets_1;

    @FXML
    private AnchorPane booking_tickets_2;

    @FXML
    private TextField customer_search;

    @FXML
    private AnchorPane customer_tableview;


    @FXML
    private Button customers;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private AnchorPane dash_form;

    @FXML
    private DatePicker DatePicker ;

    @FXML
    private DatePicker date1;

    @FXML
    private Button delete;

    @FXML
    private ComboBox<?> genderSelection;

    @FXML
    private TextField id;

    @FXML
    private TextField last_name;

    @FXML
    private TextField locationField;

    @FXML
    private TextField location2;

    @FXML
    private TextField name_1;

    @FXML
    private TextField name_2;

    @FXML
    private Button pay;

    @FXML
    private TextField phone_no;

    @FXML
    private TextField price;


    @FXML
    private Button receipt;

    @FXML
    private Button reset;

    @FXML
    private Button reset_button;

    @FXML
    private TextField search_passenger;

    @FXML
    private Button select_button;

    @FXML
    private Button signout_btn;

    @FXML
    private ComboBox<?> status;

    @FXML
    private Button ticket_booking;

    @FXML
    private TextField ticket_bus;

    @FXML
    private Label todayincome;

    @FXML
    private Label totalincome;

    @FXML
    private TextField type_bus;

    @FXML
    private Button update;
    @FXML
    private AnchorPane AddBus;
    @FXML
    private AnchorPane DeleteBus;
    @FXML
    private AnchorPane SearchTicket;
    @FXML
    private Button Searchbutton;
    @FXML
    private Button view;

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
        private ComboBox<String> addDeparture;
        @FXML
        private ComboBox<String> AddArival;
        @FXML
        private DatePicker AddDate;
        @FXML
        private TextField AddBusID;
        @FXML
        private TextField AddBusname;
        @FXML
        private TextField AddDepartureTime;
        @FXML
        private TextField addArivaltime;
        @FXML
        private Button AddBusbtn;
        @FXML
        private Label AddBusMessage;
        @FXML
        private AnchorPane SearchBuses;
        @FXML
        private Label searchbuslabel;

    @FXML
    private TableColumn<Bus, String> BusID;
    @FXML
    private ComboBox<String> addDepartue;
    @FXML
    private TableColumn<Bus, Double> economyprice;
    @FXML
    private Label Deletemessage;
    @FXML
    private Button DeleteBusbtn;
    @FXML
    private ComboBox<String> DeleteBusID;
    @FXML
    private DatePicker DeleteDate;
    @FXML
    private ComboBox<String> BookDeparture;
    @FXML
    private ComboBox<String> BookArival;
@FXML
private DatePicker BookDate;
@FXML
private Button BookSearch;
@FXML
private TableView<Bus> Bustable1;
@FXML
private TableColumn<Bus, String> Busname1;
@FXML
private TableColumn<Bus, String> Departutetime1;
@FXML
private TableColumn<Bus, String> Arrivaltime1;
@FXML
private TableColumn<Bus, Double> economyprice1;
@FXML
private TableColumn<Bus, Double> Buisnessprice1;
@FXML
private TableColumn<Bus, Integer> AvailableSeats1;
@FXML
private TableColumn<Bus, String> BusID1;
@FXML
private Label DisplayMessage1;
@FXML
private TextField Fullname;
@FXML
private TextField CoustomerEmail;
@FXML
private TextField CoustomerCnic;
@FXML
private ComboBox<String> gender;
@FXML
private Button SelectBtn;
@FXML
private AnchorPane bookticket;
@FXML
private AnchorPane CustomerInformation;
@FXML
private Button viewticket;
@FXML
    private AnchorPane Ticketpan;
@FXML
private TableView<Tickets> CancelTicket;
@FXML
private TableColumn<Tickets, String> BUSNAME;
@FXML
private TableColumn<Tickets, String> DepartureCity;
@FXML
private TableColumn<Tickets, String> ArrivalCity;
@FXML
private TableColumn<Tickets, String> BUSID;
@FXML
private TableColumn<Tickets, String> SeatID;
@FXML
private TableColumn<Tickets, Integer> TicketNO;
@FXML
private TableColumn<Tickets, Double> TicketPrice;
@FXML
private TextField passengeremailforsearch;
@FXML
private Button searchTicketbtn;
@FXML
private AnchorPane confirmation;
private Button confirmbtn;
private Button cancelbtn;
@FXML
private TableView<Passenger> CoustomersTable;
@FXML
private TableColumn<Passenger, String> Cname;
@FXML
private TableColumn<Passenger, String> Cemail;
@FXML
private TableColumn<Passenger, String> Ccnic;
@FXML
private TableColumn<Passenger, String> Cphone;
@FXML
private TableColumn<Passenger, String> Cgender;




    @FXML
    public void initialize() {
        ObservableList<String> locations = FXCollections.observableArrayList("Lahore", "Islamabad", "Multan", "Karachi");
        ObservableList<String> gen= FXCollections.observableArrayList("Male","Female");
        gender.setItems(gen);
        Departure.setItems(locations);
        Arival.setItems(locations);
        addDepartue.setItems(locations);
        AddArival.setItems(locations);
        BookDeparture.setItems(locations);
        BookArival.setItems(locations);
        BusManagement.addBus(new Bus("Faisal Movers", "Fa 123", "4:00", "13:00", "2023-11-26", Terminals.Lahore, Terminals.Karachi, BusCategory.Gold));
        BusManagement.addBus(new Bus("Faisal Movers", "fa 124", "6:00", "14:00", "2023-11-26", Terminals.Lahore, Terminals.Karachi, BusCategory.Gold));



    }



    public void viewButtononaction(){
        SearchTicket.setVisible(true);
        AddBus.setVisible(false);
        DeleteBus.setVisible(false);


    }
    public void addButtononaction(){
        SearchTicket.setVisible(false);
        AddBus.setVisible(true);
        DeleteBus.setVisible(false);

    }
    public void deleteButtononaction(){
        SearchTicket.setVisible(false);
        AddBus.setVisible(false);
        DeleteBus.setVisible(true);
        Deletemessage.setText("");
        for (Bus bus : BusManagement.buses) {
            if (DeleteBusID.getItems().contains(bus.getId()))
                continue;
            else
                DeleteBusID.getItems().add(bus.getId());
        }
        DeleteBusbtn.setOnAction(e -> {
            if (DeleteBusID.getValue() == null) {
                Deletemessage.setText("Please select a bus");
            }
            else if (DeleteDate.getValue() == null) {
                Deletemessage.setText("Please select a date");
            }
            else {
                String id = DeleteBusID.getValue();
                String date = DeleteDate.getValue().toString();
                BusManagement.removeBus(id, date);
                Deletemessage.setText("Bus Deleted Successfully");
                DeleteBusID.getItems().remove(id);
            }
        });

    }
    public void searchButtononaction() {
        if (Departure.getValue() != null && Departure.getValue().equals(Arival.getValue())) {
            DisplayMessage.setText("Departure and Arrival can't be same");
        } else if (Datepicker.getValue() == null) {
            DisplayMessage.setText("Please select a date");
        } else {

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

        }
    }

    public void addbusonaction()

    {
        if (AddBusname.getText().isEmpty() || AddBusID.getText().isEmpty() || AddDepartureTime.getText().isEmpty() || addArivaltime.getText().isEmpty() || AddDate.getValue().toString().isEmpty() || addDepartue.getValue().isEmpty() || AddArival.getValue().isEmpty()) {
            AddBusMessage.setText("Please fill all the fields");
        }
        else if (AddArival.getValue().equals(addDepartue.getValue())){
            AddBusMessage.setText("Departure and Arrival can't be same");
        }
       else {

            AddBusMessage.setText("Bus Added Successfully");

            String name = AddBusname.getText();
            String id = AddBusID.getText();
            String departure = AddDepartureTime.getText();
            String arrival = addArivaltime.getText();
            Terminals departureterminal = null;
            Terminals arrivalterminal = null;
            String date = AddDate.getValue().toString();
            if (AddArival.getValue().equals("Lahore")||AddArival.getValue().equals("lahore")) {
                arrivalterminal = Terminals.Lahore;
            } else if (AddArival.getValue().equals("Islamabad")||AddArival.getValue().equals("islamabad")) {
                arrivalterminal = Terminals.Islamabad;
            } else if (AddArival.getValue().equals("Multan")||AddArival.getValue().equals("multan")) {
                arrivalterminal = Terminals.Multan;
            } else if (AddArival.getValue().equals("Karachi")||AddArival.getValue().equals("karachi")) {
                arrivalterminal = Terminals.Karachi;
            }
            if (addDepartue.getValue().equals("Lahore")||addDepartue.getValue().equals("lahore")) {
                departureterminal = Terminals.Lahore;
            } else if (addDepartue.getValue().equals("Islamabad")||addDepartue.getValue().equals("islamabad")) {
                departureterminal = Terminals.Islamabad;
            } else if (addDepartue.getValue().equals("Multan")||addDepartue.getValue().equals("multan")) {
                departureterminal = Terminals.Multan;
            } else if (addDepartue.getValue().equals("Karachi")||addDepartue.getValue().equals("karachi")) {
                departureterminal = Terminals.Karachi;
            }
            BusManagement.addBus(new Bus(name, id, departure, arrival, date,departureterminal , arrivalterminal, BusCategory.Gold));
        }
    }
    public void BookingbuttononAction(ActionEvent e) throws IOException {
        if (BookDeparture.getValue() != null && BookDeparture.getValue().equals(BookArival.getValue())) {
            DisplayMessage1.setText("Departure and Arrival can't be same");
        } else if (BookDate.getValue() == null) {
            DisplayMessage1.setText("Please select a date");
        } else {

            String departure = BookDeparture.getValue();
            String arrival = BookArival.getValue();
            String date = BookDate.getValue().toString();
            System.out.println(date);
            BusManagement.showAvailableBuses(departure, arrival, date);
            Busname1.setCellValueFactory(new PropertyValueFactory<>("name"));
            Departutetime1.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
            Arrivaltime1.setCellValueFactory(new PropertyValueFactory<>("ArrivalTime"));
            economyprice1.setCellValueFactory(new PropertyValueFactory<>("EconomyPrice"));
            Buisnessprice1.setCellValueFactory(new PropertyValueFactory<>("LuxuryPrice"));
            AvailableSeats1.setCellValueFactory(new PropertyValueFactory<>("AvailableSeats"));
            BusID1.setCellValueFactory(new PropertyValueFactory<>("Id"));
            Bustable1.setItems(BusManagement.Availablebuses);
            Bustable1.setOnMouseClicked((MouseEvent event) -> {
                if (event.getClickCount() == 2 && (!Bustable1.getSelectionModel().isEmpty())) {
                    Bus selectedBus = Bustable1.getSelectionModel().getSelectedItem();
                    String busID = selectedBus.getId();
                    BooktickectController b=new BooktickectController();
                    BooktickectController.busID=busID;
                    BooktickectController.filename="ManagerDashboard.fxml";

                    try {
                        b.open(e);
                    } catch (IOException ex) {
                        ex.printStackTrace();}

                }
            });


        }

    }
    public void selectbtnonaction(){
        String name=Fullname.getText();
 String email=CoustomerEmail.getText();
 String cnic=CoustomerCnic.getText();
 String Phone=phone_no.getText();
String genger=gender.getValue();
 Passenger p=new Passenger(name,cnic,genger,email,Phone);


        bookticket.setVisible(true);
        BooktickectController.passengername=Fullname.getText();
        BooktickectController.passengeremail=CoustomerEmail.getText();
        BooktickectController.passengerid=CoustomerCnic.getText();

    }
     public void TicketviewButtonaction(){
        CustomerInformation.setVisible(false);
       Ticketpan.setVisible(true);
         BUSNAME.setCellValueFactory(new PropertyValueFactory<>("Busname"));
         DepartureCity.setCellValueFactory(new PropertyValueFactory<>("Cityfrom"));
         ArrivalCity.setCellValueFactory(new PropertyValueFactory<>("Cityto"));
         BUSID.setCellValueFactory(new PropertyValueFactory<>("BusID"));
         SeatID.setCellValueFactory(new PropertyValueFactory<>("seatnumber"));
         TicketNO.setCellValueFactory(new PropertyValueFactory<>("ticketID"));
         TicketPrice.setCellValueFactory(new PropertyValueFactory<>("TotalPrice"));
         CancelTicket.setItems(BusManagement.Tickets);
         searchTicketbtn.setOnAction(e->{
             BusManagement.showTickets(passengeremailforsearch.getText());
             BUSNAME.setCellValueFactory(new PropertyValueFactory<>("Busname"));
             DepartureCity.setCellValueFactory(new PropertyValueFactory<>("Cityfrom"));
             ArrivalCity.setCellValueFactory(new PropertyValueFactory<>("Cityto"));
             BUSID.setCellValueFactory(new PropertyValueFactory<>("BusID"));
             SeatID.setCellValueFactory(new PropertyValueFactory<>("seatnumber"));
             TicketNO.setCellValueFactory(new PropertyValueFactory<>("ticketID"));
             TicketPrice.setCellValueFactory(new PropertyValueFactory<>("TotalPrice"));
             CancelTicket.setItems(BusManagement.PTicket);
         });
         CancelTicket.setOnMouseClicked((MouseEvent event) -> {
             if (event.getClickCount() == 2 && (!CancelTicket.getSelectionModel().isEmpty())) {
                 Tickets selectedTicket = CancelTicket.getSelectionModel().getSelectedItem();
                 CancelTicket.setVisible(false);
                 confirmation.setVisible(true);
                 confirmbtn.setOnAction(ActionEvent -> {
                     BusManagement Management=new BusManagement();
                     int ticketID = selectedTicket.getTicketID();
                     Management.CancelTicket(selectedTicket.getPassengeremail(), Integer.parseInt(selectedTicket.getSeatnumber()), selectedTicket.getBusID());
                     CancelTicket.getItems().remove(selectedTicket);
                     BusManagement.removeTicket(ticketID);
                     BusManagement.PTicket.remove(selectedTicket);
                     CancelTicket.refresh();
                     confirmation.setVisible(false);
                     CancelTicket.setVisible(true);
                 });
                 cancelbtn.setOnAction(ActionEvent -> {
                     confirmation.setVisible(false);
                     CancelTicket.setVisible(true);
                 });
             }
         });

     }


     public void Bookingbtnonaction(){
        CustomerInformation.setVisible(true);
        Ticketpan.setVisible(false);
     }


    @FXML
    public void switchForm(ActionEvent event){
        if(event.getSource() == Dashboard){
            dash_form.setVisible(true);
            available_buses_form.setVisible(false);
            booking_tickets_1.setVisible(false);
            customers_form.setVisible(false);
            Dashboard.setStyle("-fx-background-color: #034b45");
            available_buses.setStyle("-fx-background-color: #804d00");
            ticket_booking.setStyle("-fx-background-color: #804d00");
            customers.setStyle("-fx-background-color: #804d00");

        } else if (event.getSource() == available_buses)  {
            dash_form.setVisible(false);
            booking_tickets_1.setVisible(false);
            customers_form.setVisible(false);
            available_buses_form.setVisible(true);
            available_buses.setStyle("-fx-background-color: #034b45");
            Dashboard.setStyle("-fx-background-color: #804d00");
            ticket_booking.setStyle("-fx-background-color: #804d00");
            customers.setStyle("-fx-background-color: #804d00");

        } else if (event.getSource() == ticket_booking)  {
            dash_form.setVisible(false);
            available_buses_form.setVisible(false);
            customers_form.setVisible(false);
            booking_tickets_1.setVisible(true);
            ticket_booking.setStyle("-fx-background-color: #034b45");
            Dashboard.setStyle("-fx-background-color: #804d00");
            available_buses.setStyle("-fx-background-color: #804d00");
            customers.setStyle("-fx-background-color: #804d00");
        } else if (event.getSource() == customers)  {
            dash_form.setVisible(false);
            available_buses_form.setVisible(false);
            booking_tickets_1.setVisible(false);
            customers_form.setVisible(true);
            customers.setStyle("-fx-background-color: #034b45");
            Dashboard.setStyle("-fx-background-color: #804d00");
            available_buses.setStyle("-fx-background-color: #804d00");
            ticket_booking.setStyle("-fx-background-color: #804d00");
            Cname.setCellValueFactory(new PropertyValueFactory<>("name"));
            Cemail.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
            Ccnic.setCellValueFactory(new PropertyValueFactory<>("Id"));
            Cphone.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
            Cgender.setCellValueFactory(new PropertyValueFactory<>("gender"));
            CoustomersTable.setItems(BusManagement.passengers);

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