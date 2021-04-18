package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class StartPane extends VBox{
	public StartPane() {
		this.setPrefHeight(632);
		this.setPrefWidth(808);
		Button button=new Button("START");
		this.setAlignment(Pos.CENTER);
		this.getChildren().add(button);
		ImageView imageView = new ImageView(new Image("Start.png"));
		BackgroundImage bg= new BackgroundImage(new Image("Start.png",808,632,false,true),
		        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		this.setBackground(new Background(bg));
	}

}
