package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
    private TextField textField;
    private Slider slider;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        textField = new TextField();
        slider = new Slider();
        textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
        slider.setMin(0);
        slider.setMax(10);
        slider.setValue(5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(1);
        slider.setBlockIncrement(1);
        slider.valueProperty().addListener((ov, oldValue, newValue) -> textField.setText(String.format("%.2f", newValue)));
    }

    private void layoutControls() {
        setAlignment(Pos.CENTER);
        getChildren().add(textField);
        getChildren().add(slider);
        setMargin(textField, new Insets(10));
        setMargin(slider, new Insets(10));
    }
}
