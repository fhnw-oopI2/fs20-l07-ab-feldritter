package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

// Alternativ eignet sich auch das FlowPane, ist dann aber nicht so schön sortiert.
public class ApplicationUI extends GridPane {
    private Button button;
    private int labelCounter = 1;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        button = new Button("Action");
        setMargin(button, new Insets(5));
        button.setOnAction(l -> addLabel());
    }

    private void layoutControls() {
        add(button, 0, 0);
    }

    private void addLabel() {
        Label label = new Label("Label " + labelCounter);
        label.setPadding(new Insets(5));
        add(label, (labelCounter) % 6, labelCounter / 6);
        labelCounter ++;
    }
}
