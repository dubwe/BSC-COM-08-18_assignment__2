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




public class Loan extends Application{
	//creating textfields areas to input the values for various crops 
	private TextField saltResultTextField = new TextField();
    private  TextField maizeTextField = new TextField();
    private  TextField soyaTextField = new TextField();
    private TextField gnutsTextField = new TextField();
    private TextField saltTextField = new TextField();
    private  TextField maizeResultTextField = new TextField();
    private  TextField soyaResultTextField = new TextField();
    private TextField gnutsResultTextField = new TextField();
    GridPane pane = new GridPane();


	@Override
	public void start(Stage primaryStage){
		

		//Creating a Text object 
		Text instruction = new Text("Enter ingredient amounts in Kilograms (kg)");
		HBox topBox = new HBox(instruction);
		topBox.setPadding(new Insets(0,0,0,0));
		topBox.setAlignment(Pos.CENTER);

		Label maizeLabel = new Label("Maize");
		maizeLabel.setPrefWidth(120);		
		maizeLabel.setTextAlignment(TextAlignment.RIGHT);
		maizeTextField.setPrefColumnCount(10);
		maizeTextField.setPrefWidth(40);
		HBox maizeBox = new HBox(maizeLabel, maizeTextField);

		Label soyaLabel = new Label("soya");
		soyaLabel.setPrefWidth(120);		
		soyaTextField.setPrefColumnCount(10);
		soyaTextField.setPrefWidth(40);
		HBox soyaBox = new HBox(soyaLabel, soyaTextField);

		Label gnutsLabel = new Label("Groundnuts:");
		gnutsLabel.setPrefWidth(120);
		gnutsTextField.setPrefColumnCount(8);
		gnutsTextField.setPrefWidth(40);
		HBox gnutsBox = new HBox(gnutsLabel, gnutsTextField);
		

		
		saltTextField.setPrefColumnCount(8);
		Label saltLabel = new Label("Salt:");
		saltLabel.setPrefWidth(120);
		saltTextField.setPrefWidth(40);
		HBox saltBox = new HBox(saltLabel, saltTextField);
		

		Button caButton = new Button("Calculate");
		HBox buttonBox = new HBox(caButton);
		buttonBox.setPadding(new Insets(20,0,0,0));
		buttonBox.setAlignment(Pos.CENTER);

		//creating a button that will calculate 
		caButton.setOnAction( e ->  buttonCalc());

		//create a line dividing the inputs from the result
		Line line1 = new Line(70,0,480,0);
		HBox lineBox = new HBox(line1);
		

		Text intro = new Text("you will use (kg)");
		HBox introBox = new HBox(intro);

		//creating elements for the result of maize calculations
		Label maizeResultLabel = new Label("Maize");
		maizeResultLabel.setPrefWidth(120);
		maizeResultLabel.setTextAlignment(TextAlignment.RIGHT);
		maizeResultTextField.setPrefColumnCount(10);
		maizeResultTextField.setPrefWidth(40);
		HBox maizeResultBox = new HBox(maizeResultLabel, maizeResultTextField);

		//creating elements for the result of soya calculations
		Label soyaResultLabel = new Label("soya");
		soyaResultLabel.setPrefWidth(120);
		soyaResultTextField.setPrefColumnCount(10);
		soyaResultTextField.setPrefWidth(40);
		HBox soyaResultBox = new HBox(soyaResultLabel, soyaResultTextField);
		
		//creating elements for the result of groundnuts calculations
		Label gnutsResultLabel = new Label("Groundnuts:");
		gnutsResultLabel.setPrefWidth(120);
		gnutsTextField.setPrefColumnCount(8);
		HBox gnutsResultBox = new HBox(gnutsResultLabel, gnutsResultTextField);
		
		//creating elements for the result of salt calculations
		Label saltResultLabel = new Label("Salt:");
		saltResultLabel.setPrefWidth(120);
		saltResultTextField.setPrefWidth(40);
		saltResultTextField.setPrefColumnCount(8);
		HBox saltResultBox = new HBox(saltResultLabel, saltResultTextField);
		
		HBox saltResultsBox = new HBox(pane);


		//Creating a pane Vbox that will accomodate every instances created
        VBox vBox = new VBox(topBox, maizeBox, soyaBox, gnutsBox, saltBox, buttonBox, lineBox,introBox, maizeResultBox, soyaResultBox, gnutsResultBox,saltResultBox,saltResultsBox);
		Scene scene = new Scene(vBox,500,500);
		vBox.setSpacing(10);
		vBox.setPadding(new Insets(10, 20, 10, 20));
		primaryStage.setTitle("Feed Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


	}


	public void buttonCalc(){	
		//changing the values inputted by the user into values for declared variables
		double amountMaize = Double.parseDouble(maizeTextField.getText());
		double amountSoya = Double.parseDouble(soyaTextField.getText());
		double amountGnuts = Double.parseDouble(gnutsTextField.getText());
		double amountSalt = Double.parseDouble(saltTextField.getText());

		//calculations of different crop
		double maize = ((6.0/10)*amountMaize);
		double soya = ((2.0/10)*amountSoya);
		double gnuts = ((1.5/10)*amountGnuts);
		double salt = ((0.5/10)*amountSalt);

		maizeResultTextField.setText(String.format("%.2f", maize));
		soyaResultTextField.setText(String.format("%.2f", soya));
		gnutsResultTextField.setText(String.format("%.2f", gnuts));
		saltResultTextField.setText(String.format("%.2f", salt));
		// adding the result from all
		double result = maize+soya+gnuts+salt;
		Text results = new Text("You will make "+result+"kg of feed");
		pane.add(results,3,10);
		

		}










}

