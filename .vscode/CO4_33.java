
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class CO4_33 extends Application {

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox(15);
        vbox.setStyle("-fx-alignment: center;");

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            Color randomColor = Color.color(
                    rand.nextDouble(),
                    rand.nextDouble(),
                    rand.nextDouble()
            );

            double opacity = 0.3 + (rand.nextDouble() * 0.7);

            text.setFill(randomColor);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        stage.setTitle("Random Text Styling");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
