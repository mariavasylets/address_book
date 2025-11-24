package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloController {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnSearch;

    @FXML
    private TableColumn<?, ?> columPIB;

    @FXML
    private TableColumn<?, ?> columPhone;

    @FXML
    private Label labelCount;

    @FXML
    private VBox scenePane;

    @FXML
    private TableView<?> tableAddressBook;

    @FXML
    private TextField txtSearch;

    @FXML
    private Label label;


    @FXML
    public void openNewWindow() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("editWindow.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 400, 150);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Edit");
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnAdd.getScene().getWindow());
        stage.show();

    }

    @FXML
    void new_Alert(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Видалення");
        alert.setContentText("Ви впевненні, що хочете видалити запис? ");

        Optional<ButtonType> result = alert.showAndWait();

        if (!result.isPresent()) {
            labelCount.setText("No selection!");
        } else if (result.get() == ButtonType.OK) {
            labelCount.setText("Запис видалено!");
        } else if (result.get() == ButtonType.CANCEL) {
            labelCount.setText("Відмінено!");
        } else {
            labelCount.setText("-");
        }


    }




}
