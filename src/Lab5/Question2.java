package Lab5;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Question2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX UI Controls Example");

        // Label
        Label label = new Label("Enter your name:");

        // TextField
        TextField textField = new TextField();

        // Button
        Button button = new Button("Submit");
        button.setOnAction(e -> handleButtonClick(textField.getText()));

        // RadioButton
        RadioButton radioButton1 = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        // CheckBox
        CheckBox checkBox = new CheckBox("Accept Terms and Conditions");

        // Hyperlink
        Hyperlink hyperlink = new Hyperlink("Visit OpenAI");
        hyperlink.setOnAction(e -> openAIWebsite());

        // Menu
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Open");
        menuItem.setOnAction(e -> openFile(primaryStage));
        menu.getItems().add(menuItem);

        // Tooltip
        Tooltip tooltip = new Tooltip("Click to open a file");
        menuItem.setTooltip(tooltip);

        // VBox for layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, textField, button, radioButton1, radioButton2, checkBox, hyperlink, menu);

        // Create a scene with the VBox
        Scene scene = new Scene(vbox, 300, 300);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private void handleButtonClick(String name) {
        System.out.println("Button clicked! Entered name: " + name);
    }

    private void openAIWebsite() {
        System.out.println("Opening OpenAI website...");
    }

    private void openFile(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);

        if (selectedFile != null) {
            System.out.println("Selected File: " + selectedFile.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
