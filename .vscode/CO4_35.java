
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CO4_35 extends Application {

    @Override
    public void start(Stage stage) {

        // Scale factor for height (so bars are visible)
        int scale = 5;

        // Create bars
        VBox projectBar = createBar("Projects — 20%", 20 * scale, Color.RED);
        VBox quizBar = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);
        VBox midBar = createBar("Midterm — 30%", 30 * scale, Color.GREEN);
        VBox finalBar = createBar("Final — 40%", 40 * scale, Color.ORANGE);

        // Arrange horizontally
        HBox root = new HBox(30, projectBar, quizBar, midBar, finalBar);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    // Method to create one bar + label
    private VBox createBar(String labelText, double height, Color color) {

        Rectangle bar = new Rectangle(40, height);
        bar.setFill(color);

        Text label = new Text(labelText);

        VBox box = new VBox(5, bar, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
