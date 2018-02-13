import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.input.KeyEvent;

public class ContohGuiController implements Initializable {
    @FXML
    TextField txtNama;
    @FXML
    Button btnHello;
    @FXML
    Label lblHello;
    @FXML
    Label lblSeen;
    @FXML
    Label lblNotification;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtNama.setOnKeyTyped(this::onTxtNamaType);
    }

    @FXML
    public void onBtnHelloClick(ActionEvent event) {
        lblHello.setText("Hello " + txtNama.getText());
        txtNama.setText("");
        lblNotification.setText("Good Day Mate :)");
        lblSeen.setText("");
    }
    
    @FXML
    public void onTxtNamaType(KeyEvent event) {
        lblHello.setText("");
        lblSeen.setText("Someone is Typing . . .");
        lblNotification.setText("");
    }
    
}
