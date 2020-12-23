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
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;



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

		Label soyaLabel = new Label("soya");
		soyaLabel.setPrefWidth(120);
		TextField soyaTextField = new TextField();
		soyaTextField.setPrefColumnCount(10);
		soyaTextField.setPrefWidth(40);
		HBox soyaBox = new HBox(soyaLabel, soyaTextField);

		Label gnutsLabel = new Label("Groundnuts:");
		gnutsLabel.setPrefWidth(120);
		TextField gnutsTextField = new TextField();
		gnutsTextField.setPrefColumnCount(8);

		HBox gnutsBox = new HBox(gnutsLabel, gnutsTextField);
		maizeTextField.setPrefWidth(40);
		Label saltLabel = new Label("Salt:");
		saltLabel.setPrefWidth(120);
		gnutsTextField.setPrefWidth(40);

		TextField saltTextField = new TextField();
		saltTextField.setPrefColumnCount(8);
		HBox saltBox = new HBox(saltLabel, saltTextField);
		//saltBox.setAlignment(Pos.CENTER);
		saltTextField.setPrefWidth(40);

		Button caButton = new Button("Calculate");
		HBox buttonBox = new HBox(caButton);
		buttonBox.setPadding(new Insets(20,0,0,0));
		buttonBox.setAlignment(Pos.CENTER);

		Line line1 = new Line(0,0,40,40);
		HBox lineBox = new HBox(line1);
		
		line1.setStrokeWidth(10);
		line1.setStroke(Color.BLACK);
      	

        VBox vBox = new VBox(topBox, maizeBox, soyaBox, gnutsBox, saltBox, buttonBox, lineBox);
		Scene scene = new Scene(vBox,500,500);
		vBox.setSpacing(10);
		vBox.setPadding(new Insets(10, 20, 10, 20));
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
