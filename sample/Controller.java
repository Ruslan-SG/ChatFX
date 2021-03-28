package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    @FXML
    void sendText() {
        textArea.appendText(" " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
