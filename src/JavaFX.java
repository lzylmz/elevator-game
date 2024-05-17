
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class JavaFX extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        //create Scene Graph
        Button button = new Button("Press me!");
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 250);
        //Create Window
        primaryStage.setTitle("Button Example App");
        primaryStage.setScene(scene);
        primaryStage.show();
        //Define Button Action
        Label label = new Label("Pressed!");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().setAll(label);
            }
        });
    }
}