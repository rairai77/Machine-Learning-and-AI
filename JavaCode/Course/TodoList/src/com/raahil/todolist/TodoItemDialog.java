package com.raahil.todolist;

import com.raahil.todolist.datamodel.TodoData;
import com.raahil.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class TodoItemDialog {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private DatePicker deadlinePicker;
    @FXML
    private TextArea detailsArea;

    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();
        TodoItem newItem = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }


}
