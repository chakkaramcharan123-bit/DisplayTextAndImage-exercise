
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Text and Image Display");

        // Create a label
        Label label = new Label("Hello, JavaFX!");

        // Load image from file
        Image image = new Image("file:imagepath.jpg.jpeg");
        ImageView imageView = new ImageView(image);

        // Set image size
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        // Create VBox layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, imageView);

        // Create scene
        Scene scene = new Scene(vbox, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
