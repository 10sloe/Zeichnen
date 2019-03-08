import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.*;
import javafx.scene.control.*;

import javafx.geometry.Insets;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Pos;


/**
 * Hauptanwendung
 */

public class App extends Application {

    public void start(Stage stage)
    {
        Canvas canvas = new Canvas(800, 600);         // Zeichenfläche
        GraphicsContext gc = canvas.getGraphicsContext2D(); // Graphikkontext der Zeichenfläche

        Skizze skizze = new Skizze(gc);     //Meine Zeichnung!

        // Oberfläche zusammenbauen
        Pane root = new Pane();  

        root.getChildren().addAll(canvas);
       
        
        // Fenster
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Meine Skizze");
        stage.show();

        // Anwendung starten
        // skizze.setup(gc);  // Setup der Skizze aufrufen

    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
