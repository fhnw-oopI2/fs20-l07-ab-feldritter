package ch.fhnw.oop2.module07.ab2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private Label label;
    private Slider slider;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        label = new Label("5");
        slider = new Slider();
        slider.setMin(0);
        slider.setMax(10);
        slider.setValue(5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(1);
        slider.setBlockIncrement(1);
        slider.valueProperty().addListener((ov, oldValue, newValue) -> label.setText(String.format("%.2f", newValue)));
    }

    private void layoutControls() {
        setAlignment(Pos.CENTER);
        getChildren().add(label);
        getChildren().add(slider);
        setMargin(slider, new Insets(10));
    }
}
