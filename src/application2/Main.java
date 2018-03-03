package application2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

//webview
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		WebView navigator = new WebView();
		
		WebEngine we = navigator.getEngine();
		we.load("https://www.google.com");
		//we.executeScript(script) //script JS
		
		StackPane root = new StackPane();
		root.getChildren().add(navigator);
		Scene scene = new Scene(root,400,400);
		primaryStage.setTitle("hello!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
