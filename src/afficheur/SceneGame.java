package afficheur;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import controle.ControlerKeyBoard;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class SceneGame extends Scene  {

	public SceneGame(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing) {
		super(root, width, height, depthBuffer, antiAliasing);
		// TODO Auto-generated constructor stub
	}

	public SceneGame(Parent root, double width, double height, boolean depthBuffer) {
		super(root, width, height, depthBuffer);
		// TODO Auto-generated constructor stub
	}

	public SceneGame(Parent root, double width, double height, Paint fill,ControlerKeyBoard ckb) {
		super(root, width, height, fill);
		this.setOnKeyPressed(keyEvent -> ckb.reactionClavier(keyEvent.getCode())); 
        
		// TODO Auto-generated constructor stub
	}

	public SceneGame(Parent root, double width, double height) {
		super(root, width, height);
		// TODO Auto-generated constructor stub
	}

	public SceneGame(Parent root, Paint fill) {
		super(root, fill);
		// TODO Auto-generated constructor stub
	}

	public SceneGame(Parent root) {
		super(root);
		// TODO Auto-generated constructor stub
	}


	

}
