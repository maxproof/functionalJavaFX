package application;
	
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

//encapsulation Swing into JavaFX
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		final SwingNode btn = new SwingNode();
		
		createContent(btn);
		
		//BorderPane root = new BorderPane();
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root,400,400);
		primaryStage.setTitle("hello!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void createContent(SwingNode btn) {
		SwingUtilities.invokeLater( () -> {
			btn.setContent(new JButton("click me"));
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
