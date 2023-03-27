package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.MainModel;

public class MainController {
    @FXML
    TextField baseField;
    @FXML
    TextField heightField;
    @FXML
    TextField areaField;

    MainModel mainModel;

    public MainController() {
        this.mainModel = new MainModel();
    }
    
    @FXML
    protected void onClickCalcButton(ActionEvent e) {
        this.startCalculation();
    }
    private void startCalculation() {
        String baseStr = this.baseField.getText();
        String heightStr = this.heightField.getText();
        double base = Double.parseDouble(baseStr);
        double height = Double.parseDouble(heightStr);
        Double area = this.mainModel.calcTriangleArea(base, height);
        this.areaField.setText(area.toString());
    }

}
