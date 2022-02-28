package sandboxfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SandboxFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // A Pane is where we draw our objects placing them at specific locations
        Pane root = new Pane();
        
        // Let's build an array with the vertices of a triangle
        double[] points = {400, 100, 300, 250, 500, 250};

        // Build a triangle by instantiating a Polygon object in JavaFX
        Polygon triangle = new Polygon(points);
        triangle.setFill(Color.GREENYELLOW);
        
        root.getChildren().add(triangle);
        
        Scene scene = new Scene(root, 800, 800);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
