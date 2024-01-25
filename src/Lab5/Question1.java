package Lab5;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Question1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Layout Example");

        // FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setVgap(5);
        flowPane.setHgap(5);
        flowPane.getChildren().addAll(new Button("Button 1"), new Button("Button 2"), new Button("Button 3"));

        // BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Button("Top"));
        borderPane.setRight(new Button("Right"));
        borderPane.setBottom(new Button("Bottom"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setCenter(new Button("Center"));

        // HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.getChildren().addAll(new Button("Button A"), new Button("Button B"), new Button("Button C"));

        // VBox
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.getChildren().addAll(new Button("Button X"), new Button("Button Y"), new Button("Button Z"));

        // GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.add(new Button("1,1"), 1, 1);
        gridPane.add(new Button("2,1"), 2, 1);
        gridPane.add(new Button("1,2"), 1, 2);
        gridPane.add(new Button("2,2"), 2, 2);

        // Create a scene with the layouts
        Scene scene = new Scene(new VBox(flowPane, borderPane, hBox, vBox, gridPane), 500, 400);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
