package com.example.bookthebus;

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
import javafx.stage.Window;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LoginController {
    public String ManagerUsername = "abdullah@gmail.com";
    public String ManagerPassword="12345678";

    public String getManagerUsername() {
        return ManagerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        ManagerUsername = managerUsername;
    }

    public String getManagerPassword() {
        return ManagerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        ManagerPassword = managerPassword;
    }

    BusManagement M1 = new BusManagement();

    {
        try {
            Scanner scanner = new Scanner(new File("Passengers.txt"));
            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                String id = scanner.nextLine();
                String gender = scanner.nextLine();
                String emailAddress = scanner.nextLine();
                String contactNumber = scanner.nextLine();
                String password = scanner.nextLine();

                Passenger passenger = new Passenger(name, id, gender, emailAddress, contactNumber, password);

                BusManagement.addPassenger(passenger);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }


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





    public void loginbuttononaction(ActionEvent e) throws IOException {
        if (Username.getText().isBlank() && Password.getText().isBlank()) {
            Displaymessage.setText("Please Enter Username and Password");
        } else if (Username.getText().isBlank()) {
            Displaymessage.setText("Please Enter Username");
        } else if (Password.getText().isBlank()) {
            Displaymessage.setText("Please Enter Password");
        } else if(Username.getText().equals(ManagerUsername) && Password.getText().equals(ManagerPassword)){
            Displaymessage.setText("Login Successful");
            try {
                Node source = (Node) e.getSource();
                Scene scene = source.getScene();
                if (scene != null) {
                    Window window = scene.getWindow();
                    if (window instanceof Stage) {
                        Stage stage = (Stage) window;
                        Parent root = FXMLLoader.load(getClass().getResource("ManagerDashboard.fxml"));
                        stage.setScene(new Scene(root));
                        stage.show();

                    }
                }
            }catch (IOException ignored) {

            }

        }else {
            for (int i = 0; i < BusManagement.passengers.size(); i++) {
                if (BusManagement.passengers.get(i).getAccount().getEmailAddress().equals(Username.getText()) && !BusManagement.passengers.get(i).getAccount().getEmailAddress().isEmpty() && !BusManagement.passengers.get(i).getAccount().getPassword().isEmpty() && BusManagement.passengers.get(i).getAccount().getPassword().equals(Password.getText())) {
                    BooktickectController.passengeremail=Username.getText();
                    System.out.println(BooktickectController.passengeremail);
                    Displaymessage.setText("Login Successful");
                    PessengerMenuController.pname=BusManagement.passengers.get(i).getName();
                    BooktickectController.passengername=BusManagement.passengers.get(i).getName();
                    BooktickectController.passengerid=BusManagement.passengers.get(i).getId();


                    try {
                        Node source = (Node) e.getSource();
                        Scene scene = source.getScene();
                        if (scene != null) {
                            Window window = scene.getWindow();
                            if (window instanceof Stage) {
                                Stage stage = (Stage) window;
                                Parent root = FXMLLoader.load(getClass().getResource("PassengerDashboard.fxml"));
                                stage.setScene(new Scene(root));
                                stage.show();
                            }
                        }
                    }catch (IOException ignored) {

                    }
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