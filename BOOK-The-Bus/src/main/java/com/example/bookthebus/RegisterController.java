package com.example.bookthebus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {

    @FXML
    private PasswordField ConfirmPass;

    @FXML
    private TextField ContactNumber;

    @FXML
    private TextField FullName;

    @FXML
    private RadioButton Maleradio;

    @FXML
    private TextField emailaddress;

    @FXML
    private RadioButton femaleradio;

    @FXML
    private PasswordField registrationPassword;

    @FXML
    private Button registrationpagesignin;

    @FXML
    private Button signupconfirm;

    @FXML
    private CheckBox termandcondition;
    @FXML
    private Label Displaymessage;
    @FXML
    private TextField CNIC;
    private String Gender ="Female";

    public void signinbuttononaction(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void initialize() {
        ToggleGroup group = new ToggleGroup();
        Maleradio.setToggleGroup(group);
        femaleradio.setToggleGroup(group);
    }

    public void setSignupaction(ActionEvent e) {
        if (FullName.getText().isBlank() && emailaddress.getText().isBlank() && ContactNumber.getText().isBlank() && registrationPassword.getText().isBlank() && ConfirmPass.getText().isBlank()) {
            Displaymessage.setText("Please Enter all the fields");
        } else if (FullName.getText().isBlank()) {
            Displaymessage.setText("Please Enter Full Name");
        } else if (emailaddress.getText().isBlank()) {
            Displaymessage.setText("Please Enter Email Address");
        } else if (ContactNumber.getText().isBlank()||ContactNumber.getText().length()!=11) {
            Displaymessage.setText("Please Enter a valid Contact Number");
        } else if (CNIC.getText().isBlank()||CNIC.getText().length()!=13) {
            Displaymessage.setText("Please Enter valid CNIC number");
        } else if (registrationPassword.getText().isBlank()||registrationPassword.getText().length()<8) {
            Displaymessage.setText("Please Enter Password");
        } else if (ConfirmPass.getText().isBlank()) {
            Displaymessage.setText("Please Confirm the Password");
        } else if (!registrationPassword.getText().equals(ConfirmPass.getText())) {
            Displaymessage.setText("Password does not match");
        } else if (!Maleradio.isSelected() && !femaleradio.isSelected()) {
            Displaymessage.setText("Please select the gender");
        } else if (!termandcondition.isSelected()) {
            Displaymessage.setText("Please Accept Terms and Conditions");
        } else {
            if (Maleradio.isSelected()){
                this.Gender ="Male";
                System.out.println(Gender);
            }
            Accounts a1 = new Accounts(emailaddress.getText(), registrationPassword.getText());
            Passenger p1 = new Passenger(FullName.getText(), CNIC.getText(),Gender, emailaddress.getText(), ContactNumber.getText(), registrationPassword.getText());
            if (!BusManagement.addPassenger(p1)) {
                Displaymessage.setText("Email Address already exists");
            }else {

                Displaymessage.setText("Signup Successful");
            }
        }


    }
}



