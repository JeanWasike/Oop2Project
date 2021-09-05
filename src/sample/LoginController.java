package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class LoginController {
    @FXML
    private Button LoginButton;
    @FXML
    private TextField UsernameTextField;
    @FXML
    private PasswordField PasswordField;


    public void loginonaction(javafx.event.ActionEvent event)
    {
        if(event.getSource()==LoginButton)
        {
           SignUpController a = new SignUpController();
           a.setVisible(true);
           this.setVisible(false);
        }

    }

    void setVisible(boolean b) {
    }
}
