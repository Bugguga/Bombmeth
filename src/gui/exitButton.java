package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class exitButton extends Button{
	exitButton() {
		this.setPadding(new Insets(5));
		ImageView iv1 = new ImageView();
		iv1.setImage(new Image("exit.png"));
		iv1.setFitWidth(100);
	    iv1.setFitHeight(100);
	    this.setGraphic(iv1);
	    
		
		
		}

}
