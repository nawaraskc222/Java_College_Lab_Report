package Lab5;

import javafx.*;
import javafx.application.Application;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane; 

public class Demo  extends Application{

	

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		 Button btn1=new Button("Say, Hello World");  
	        StackPane root=new StackPane();  
	        root.getChildren().add(btn1);  

		
	}

}
