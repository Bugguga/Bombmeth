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
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setPadding(new Insets(10));
		hbox.setAlignment(Pos.CENTER);
		StartPane startPane=new StartPane();
		hbox.getChildren().add(startPane);
		Scene scene=new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BOMB IT");
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.show();
	}

	public static void main(String[] args) {
		
	}

}
