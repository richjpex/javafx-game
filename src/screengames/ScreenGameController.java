/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package screengames;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author mldm
 */
public class ScreenGameController implements Initializable {
    
    private Stage stage;
    
    public void setStage(Stage stage){
        this.stage = stage;
    }
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void switchToHelpScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("HelpScreen.fxml"))));
    stage.show();
}
    
    @FXML
    private void switchToDeathScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("DeathScreen.fxml"))));
    stage.show();
}
    
    @FXML
    private void switchToBossScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("BossLevel.fxml"))));
    stage.show();
}
    @FXML
    private void switchToArtifactScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ArtifactScreen.fxml"))));
    stage.show();
}
    
    @FXML
    private void switchToHardGateScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("HardGateScreen.fxml"))));
    stage.show();
}
    
    @FXML
    private void switchToImpossibleGateScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ImpossibleGateScreen.fxml"))));
    stage.show();
}
    
    @FXML
    public void switchToPowerUpScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("FXMLPowerUps.fxml"))));
    stage.show();
}
    
    @FXML
    public void switchToAboutScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("FXMLAboutScreen.fxml"))));
    stage.show();
}
    
    
    @FXML
    public void switchToBattleScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("FXMLBattleScreen.fxml"))));
    stage.show();
}
    
    @FXML
    public void switchToVictoryScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("FXMLVictoryScreen.fxml"))));
    stage.show();
}
    
    @FXML
    public void switchToTutorialScreen(ActionEvent event) throws Exception {
    Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("FXMLTutorialScreen.fxml"))));
    stage.show();
}
    
    @FXML
    private void switchToMainScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("ScreenGame.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void switchToDialogueScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("dialogue_screen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void switchToInventoryScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("inventory_screen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void switchToMainMenuScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("main_menu_screen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void switchToMonsterInfoScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("monster_info_screen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void switchToSettingsScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("settings_screen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    public void powerup1(ActionEvent e){
        System.out.println("powerup1");
    }
    
    public void powerup2(ActionEvent e){
        System.out.println("powerup2");
    }
    
    public void powerup3(ActionEvent e){
        System.out.println("powerup3");
    }
    
    public void powerup4(ActionEvent e){
        System.out.println("powerup4");
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
