
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
    @FXML
    RadioButton pria;
    @FXML
    RadioButton wanita;
    @FXML
    ToggleGroup jenisKelamin;

    private String title;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtNama.setOnKeyReleased(this::onTxtNamaTyping);
        pria.setOnAction(this::onJenisKelaminChanged);
        wanita.setOnAction(this::onJenisKelaminChanged);
        
    
    }

    @FXML
    public void onBtnHelloClick(ActionEvent event) {
        lblHello.setText("Hello " + this.title + txtNama.getText());
        txtNama.setText("");
        lblNotification.setText("Good Day Mate :)");
        lblSeen.setText("");
    }

    @FXML
    public void onTxtNamaTyping(KeyEvent event) {
        //This title di label tidak auto change
        lblHello.setText("");
        lblSeen.setText("Hello "+ this.title + " " + txtNama.getText());
        lblNotification.setText("");
    }

    @FXML
    public void onJenisKelaminChanged(ActionEvent event) {
        if (jenisKelamin.getSelectedToggle().equals(pria)) {
            this.title = "Mr. ";
        } else if (jenisKelamin.getSelectedToggle().equals(wanita)) {
            this.title = "Mrs. ";
        }

    }

}
