import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Loan extends Application{
	//creating textfields areas to input the values for various crops 
	private TextField maizeSize = new TextField();
	private TextField soyaSize = new TextField();
	private TextField groundnutsSize = new TextField();
	private TextField saltSize = new TextField();
	private TextField calculate = new TextField();
	//creating a button that will calculate 
	private Button btcalculate = new Button("Calculate");


	@Override
	public void start(Stage primaryStage){
		

		GridPane gridPane = new GridPane();
		gridPane.setVgap(10);
		gridPane.setHgap(4);

		//Creating a Text object 
		Text instruction = new Text("Enter ingredient amounts in Kilograms (kg)");
		HBox topBox = new HBox(instruction);
		topBox.setPadding(new Insets(0,0,0,0));
		topBox.setAlignment(Pos.CENTER);

		Label maizeLabel = new Label("Maize");
		maizeLabel.setPrefWidth(120);
		TextField maizeTextField = new TextField();
		maizeLabel.setTextAlignment(TextAlignment.RIGHT);
		maizeTextField.setPrefColumnCount(10);
		maizeTextField.setPrefWidth(40);
		HBox maizeBox = new HBox(maizeLabel, maizeTextField);
      	

      	//gridPane.add(text,7,0);
		

		gridPane.add(new Label("Maize"),7,2);
		//gridPane.add(maizeSize,4,0);

		//gridPane.add(new Label("Soya:"),2,1);
 		//gridPane.add(soyaSize,4,1);

 		//gridPane.add(new Label("Groundnuts:"),0,3);
		//gridPane.add(soyaSize,2,3);


		//gridPane.add(new Label("Salt"),0,4);
		//gridPane.add(saltSize,3,4);


		
 	  
		//BorderPane bpane = new BorderPane();
		//bpane.setCenter(gridPane);
		//bpane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        VBox vBox = new VBox(topBox, maizeBox);
		Scene scene = new Scene(vBox,500,500);
		primaryStage.setTitle("Feed Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


	}

}

class CustomePane {
	 public void CustomPane(String text) {
	 	System.out.println("hie");
		 //getChildren().add(new Label(text)); 
		 //setPadding(new Insets(11.5,12.5,13.5,14.5));
	}
}
