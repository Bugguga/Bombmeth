package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class startButton extends Button{
	
	
	startButton() {
	this.setPadding(new Insets(5));
	ImageView iv1 = new ImageView();
	iv1.setImage(new Image("startcir.png"));
	iv1.setFitWidth(100);
    iv1.setFitHeight(100);
    this.setGraphic(iv1);
    this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
   
	
	
	}

}
