import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hello JavaFX");
        btn.setOnAction(e -> System.out.println("Hello from JavaFX!"));

        Scene scene = new Scene(btn, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.show();
    }
}
