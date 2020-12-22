import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


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
		gridPane.setHgap(4);
		gridPane.setHgap(4);

		gridPane.add(new Label("Maize"),1,0);
		gridPane.add(maizeSize,4,0);

		gridPane.add(new Label("Soya:"),2,1);
 		gridPane.add(soyaSize,4,1);

 		gridPane.add(new Label("Groundnuts:"),0,3);
		//gridPane.add(soyaSize,2,3);


		//gridPane.add(new Label("Salt"),0,4);
		//gridPane.add(saltSize,3,4);

		Scene scene = new Scene(gridPane,500,500);
		primaryStage.setTitle("Feed Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


	}





}