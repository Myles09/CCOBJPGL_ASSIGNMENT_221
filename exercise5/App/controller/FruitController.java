package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FruitController {


    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Kevin kevin = new Kevin();
    Carrie carrie = new Carrie();
    Arjay arjay = new Arjay();
    Carlo carlo = new Carlo();
    Joshua joshua = new Joshua();


    public void initialize() {

        kevin.setgender("Man");
        kevin.setscent("Eros");

        carrie.setgender("Woman");
        carrie.setscent("Vanilla");

        arjay.setgender("Man");
        arjay.setscent("Vanilla");

        carlo.setgender("Man");
        carlo.setscent("Eros");

        joshua.setgender("Man");
        joshua.setscent("Eros");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Kevin is " + kevin.getgender() + " and " + kevin.getscent());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Carrie is " + carrie.getgender() + " and " + carrie.getscent());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Arjay is " + arjay.getgender() + " and " + arjay.getscent());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Carlo is " + carlo.getgender() + " and " + carlo.getscent());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Joshua is " + joshua.getgender() + " and " + joshua.getscent());
            }
        
    
        alert.showAndWait();
    }
} 
