package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Button hi;
    @FXML
    private Button bye;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;


    @FXML
    public void initialize(){
        hi.setDisable(true);
        bye.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        if (e.getSource().equals(hi)) {
            System.out.println("Hi, " + textField.getText());
        }else if(e.getSource().equals(bye)){
            System.out.println("Bye, " + textField.getText());
        }
        //Is a runnable task
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    //Puts thread to sleep causing a freeze for the application
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            ourLabel.setText("We did something!");
                        }
                    });


                }catch(InterruptedException event){
                    //We don't really care about this....
                }
            }
        };
        //Makes new thread to process above Runnable task
        new Thread(task).start();

        if(ourCheckBox.isSelected()){
            textField.clear();
            hi.setDisable(true);
            bye.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased(){
        String text = textField.getText();
        boolean disableButtons = text.isEmpty() | text.trim().isEmpty();
        hi.setDisable(disableButtons);
        bye.setDisable(disableButtons);
    }

    public void handleChange(){
        System.out.println("Checkbox is" + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
