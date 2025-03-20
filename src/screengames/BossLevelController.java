/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package screengames;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author mldm
 */
public class BossLevelController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handlePowerChoice(ActionEvent event){
        Button clickedButton = (Button) event.getSource();

    if (clickedButton.getId().equals("powerButton1")) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Power chosen");
        alert.setHeaderText("Power 1 is chosen");
        alert.setContentText("Press ok when finished reading.");
        alert.showAndWait();
    } else if (clickedButton.getId().equals("powerButton2")) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Power chosen");
        alert.setHeaderText("Power 2 is chosen");
        alert.setContentText("Press ok when finished reading.");
        alert.showAndWait();
    } else if (clickedButton.getId().equals("powerButton3")) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Power chosen");
        alert.setHeaderText("Power 3 is chosen");
        alert.setContentText("Press ok when finished reading.");
        alert.showAndWait();
    }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
