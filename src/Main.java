
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 *
 * @author Ricardo Andrés Calvo
 */
public class Main extends Application{ 
    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
        Canvas canvas = new Canvas(416,384);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,416,384,Color.WHITESMOKE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        LoopJuego loop = new LoopJuego(gc);
        loop.start();
        stage.setTitle("Casa");
        stage.setScene(scene);
        stage.show();
    }    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
