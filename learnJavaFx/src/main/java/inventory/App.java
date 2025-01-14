package inventory;

import inventory.components.ProductDisplay;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class App extends Application {
    public static void run(String[] args) {
        launch(args);
    }


    /**
     * Stage is the main window to which all scenes are displayed upon
     * 
     * A Scene needs a root node that holds all the components required to build the given scene on the stage.
     * 
     * So what are root nodes?
     * 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Text text = new Text("Hello world"); // leaf node
        // StackPane root=new StackPane();  // root node 
        // root.getChildren().add(text);  // set a child node to the root node
        // Scene scene = new Scene(root, 600, 600, Color.WHITESMOKE);     // attach the root and therefore all its chldren to the given scene
        primaryStage.setScene(playGround());  // set the new scene for the stage
        primaryStage.setTitle("First JavaFX Application");  
        primaryStage.show();  
    }

    public Scene playGround() {
        Pane parent = new Pane();
        Button node = new Button("Click me");
        
        EventHandler<ActionEvent> eventHandler = (Event event) -> {
            System.out.println("Hello world");
        };

        node.setOnAction(eventHandler);

        parent.getChildren().add(node);
        return new Scene(parent, 600, 600);
    }

}
