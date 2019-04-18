package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Use the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Code if you don't use fxml file
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setHgap(10);
//        root.setVgap(10);
        //Necessary code
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 300, 275));
//        More code not using the FXML file
//        Label greeting = new Label("Welcome to JavaFX");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
