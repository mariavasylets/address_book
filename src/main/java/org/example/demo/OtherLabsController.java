package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OtherLabsController {

    @FXML
    private Button choose;

    @FXML
    private ImageView imageView;

    @FXML
    private Label text;

    Image image = new Image(getClass().getResourceAsStream("nature2.jpg"));

    @FXML
    void changeLabel(ActionEvent event) {

        imageView.setImage(image);
        text.setText("Ви успішно змінили картинку!");
        choose.setDisable(true);
    }

}
