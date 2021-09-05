package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class SignUpController {
    @FXML
    private Button Back,Sign_up;
    @FXML
    private TextField txtFName,txtLName,txtEmai,txtPhoneNo,SetPassword,cpassword;

    @FXML
    private PasswordField PasswordField;


    public void signuponaction(javafx.event.ActionEvent event)
    {
        if(event.getSource()==Sign_up)
        {
            LoginController a = new LoginController();
            a.setVisible(true);
            this.setVisible(false);
        }
        else if(event.getSource()==Back)
        {
            LoginController a = new LoginController();
            a.setVisible(true);
            this.setVisible(false);
        }

    }

    void setVisible(boolean b) {
    }
}

