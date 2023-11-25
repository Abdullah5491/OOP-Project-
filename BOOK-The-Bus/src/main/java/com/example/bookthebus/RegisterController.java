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
    private Label Displaymessage;

    public void signinbuttononaction(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void setSignupaction(ActionEvent e) {
        if (FullName.getText().isBlank() && emailaddress.getText().isBlank() && ContactNumber.getText().isBlank() && registrationPassword.getText().isBlank() && ConfirmPass.getText().isBlank()) {
            Displaymessage.setText("Please Enter all the fields");
        } else if (FullName.getText().isBlank()) {
            Displaymessage.setText("Please Enter Full Name");
        }
        else if (emailaddress.getText().isBlank()){
            Displaymessage.setText("Please Enter Email Address");
        }
        else if (ContactNumber.getText().isBlank()){
            Displaymessage.setText("Please Enter Contact Number");
        }


    }


}
