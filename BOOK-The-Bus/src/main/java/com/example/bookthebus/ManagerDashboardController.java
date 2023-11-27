package com.example.bookthebus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    private ComboBox<?> bus_ID;

    @FXML
    private TableColumn<?, ?> bus_id;

    @FXML
    private TableColumn<?, ?> bus_loc;

    @FXML
    private ComboBox<?> bus_location;

    @FXML
    private ComboBox<?> bus_ticket;

    @FXML
    private TableColumn<?, ?> bus_typ;

    @FXML
    private ComboBox<?> bus_type;

    @FXML
    private TableColumn<?, ?> customer_busId;

    @FXML
    private TableColumn<?, ?> customer_customerno;

    @FXML
    private TableColumn<?, ?> customer_date;

    @FXML
    private TableColumn<?, ?> customer_first;

    @FXML
    private TableColumn<?, ?> customer_gender;

    @FXML
    private TableColumn<?, ?> customer_last;

    @FXML
    private TableColumn<?, ?> customer_location;

    @FXML
    private TableColumn<?, ?> customer_phone;

    @FXML
    private TextField customer_search;

    @FXML
    private AnchorPane customer_tableview;

    @FXML
    private TableColumn<?, ?> customer_ticket;

    @FXML
    private TableColumn<?, ?> customer_type;

    @FXML
    private Button customers;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private AnchorPane dash_form;

    @FXML
    private DatePicker date;

    @FXML
    private DatePicker date1;

    @FXML
    private Button delete;

    @FXML
    private TextField first_name;

    @FXML
    private ComboBox<?> gender;

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
    private TableColumn<?, ?> prices;

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
    public void switchForm(ActionEvent event){
        if(event.getSource() == Dashboard){
            dash_form.setVisible(true);
            available_buses_form.setVisible(false);
            booking_tickets_1.setVisible(false);
            booking_tickets_2.setVisible(false);
            customers_form.setVisible(false);
        } else if (event.getSource() == available_buses)  {
            dash_form.setVisible(false);
            booking_tickets_1.setVisible(false);
            booking_tickets_2.setVisible(false);
            customers_form.setVisible(false);
            available_buses_form.setVisible(true);
        } else if (event.getSource() == ticket_booking)  {
            dash_form.setVisible(false);
            available_buses_form.setVisible(false);
            customers_form.setVisible(false);
            booking_tickets_1.setVisible(true);
            booking_tickets_2.setVisible(true);
        } else if (event.getSource() == customers)  {
            dash_form.setVisible(false);
            available_buses_form.setVisible(false);
            booking_tickets_1.setVisible(false);
            booking_tickets_2.setVisible(false);
            customers_form.setVisible(true);
        }
    }

}