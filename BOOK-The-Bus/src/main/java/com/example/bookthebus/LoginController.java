package com.example.bookthebus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;
import java.security.spec.MGF1ParameterSpec;
import java.util.EventObject;

public class LoginController {
    BusManagement M1 = new BusManagement();
    Passenger p1=new Passenger("Ali",36401,"Male","ali","03246882133","123456");
    {
        M1.passengers.add(p1);
    }



    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField Password;

    @FXML
    private Button Signup;

    @FXML
    private TextField Username;

    @FXML
    private Button forgotPassword;

    @FXML
    private Label Displaymessage;




    public void loginbuttononaction(ActionEvent e) {
        if (Username.getText().isBlank() && Password.getText().isBlank()) {
            Displaymessage.setText("Please Enter Username and Password");
        } else if (Username.getText().isBlank()) {
            Displaymessage.setText("Please Enter Username");
        } else if (Password.getText().isBlank()) {
            Displaymessage.setText("Please Enter Password");
        } else {
            for (int i = 0; i < BusManagement.passengers.size(); i++) {
                if (BusManagement.passengers.get(i).getAccount().getEmailAddress().equals(Username.getText()) && !BusManagement.passengers.get(i).getAccount().getEmailAddress().isEmpty() && !BusManagement.passengers.get(i).getAccount().getPassword().isEmpty() && BusManagement.passengers.get(i).getAccount().getPassword().equals(Password.getText())) {
                    Displaymessage.setText("Login Successful");
                }
                else {
                    Displaymessage.setText("Invalid Username or Password");
                }


            }
        }
    }

    public void signupbuttononaction(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }



}