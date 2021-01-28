package com.xyz.mytipcalc20210127;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class TipCalcController {
    @FXML
    private Label lblTipPerc;

    @FXML
    private Slider slider1;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtTip;

    @FXML
    private TextField txtTotal;

    @FXML
    void handleBtn(ActionEvent event) {
        println("Calculate button is pressed!");
        double amount = Double.parseDouble(txtAmount.getText());
        double tip = ((int)slider1.getValue())*amount/100;
        double total = amount + tip;
        
        // Now I need to update the view
        txtTip.setText(String.format("%.2f", tip));
        txtTotal.setText(String.format("%.2f", total));
    }
        
    
    @FXML
    void handleMouseDrag(MouseEvent event) {
//        println("Handle mouse drag event fired!");
        String info = String.format("%% %d", (int)slider1.getValue());
        lblTipPerc.setText(info);
    }
    
    public void initialize() {
        int initialPercentage = 15;
        slider1.setValue(initialPercentage);
        println("Our controller is being initialized!");
    }
    
    
    static void println(String msg) {
        System.out.println(msg);
    }
    
}
