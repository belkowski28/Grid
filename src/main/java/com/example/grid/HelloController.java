package com.example.grid;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private GridPane grid;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        int col = 0;
        int row = 0;


        try {
            for( int i = 0 ;i< 10 ; i++) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("pane.fxml"));
                Pane pane = loader.load();
                PaneController paneController = loader.getController();
                if(col == 2) {
                    col = 0;
                    ++row;
                }

            grid.add(pane,col++,row);
            GridPane.setMargin(pane,new Insets(10));

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}