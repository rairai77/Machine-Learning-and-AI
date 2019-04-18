package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class Controller {
    private static final ContactData contactData = new ContactData();

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn notesCol;
    @FXML
    private TableColumn firstNameCol;
    @FXML
    private TableColumn lastNameCol;
    @FXML
    private TableColumn phoneNumberCol;

    public void initialize(){
        tableView.setItems(contactData.getContacts());
        notesCol.setCellFactory(new Callback<TableColumn, TableCell>() {
            @Override
            public TableCell call(TableColumn param) {

            }
        });
    }
}
