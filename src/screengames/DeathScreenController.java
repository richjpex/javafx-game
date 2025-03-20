/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package screengames;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

/**
 *
 * @author mldm
 */
public class DeathScreenController implements Initializable {
    
    @FXML
    private Label label;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event){
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
    
    @FXML
    private void switchToMainMenuScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("main_menu_screen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML 
    private void exitButtonAction(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
}
