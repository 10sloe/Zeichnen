import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Skizze
{
    // Attribute
    GraphicsContext gc;
    

    //Konstruktor
    Skizze(GraphicsContext gc_)
    {
        gc = gc_;
        zeichnen();
    }

    //Methoden
    void zeichnen()
    {
        gc.setStroke(Color.PURPLE);
        gc.strokeOval(200,200,100,100);
        
    }

}
