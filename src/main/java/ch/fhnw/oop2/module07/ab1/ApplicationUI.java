package ch.fhnw.oop2.module07.ab1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class ApplicationUI extends GridPane {
    private Button button;
    private List<Label> labels = new ArrayList<>();
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
