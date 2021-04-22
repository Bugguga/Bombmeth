package main;

import gui.StartPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		// TODO
		StartPane startPane=new StartPane();
		Scene startScene=new Scene(startPane);
		primaryStage.setScene(startScene);
		primaryStage.setTitle("BOMB IT");
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.show();
	}

	public static void main(String[] args) {
		
	}

}
