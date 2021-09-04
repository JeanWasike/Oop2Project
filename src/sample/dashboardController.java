package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class dashboardController<View_clients> {
    @FXML
    private Button View_clients,View_Listings,Create_listings,View_profile,Back;
    public void signuponaction(javafx.event.ActionEvent event) {
        if (event.getSource() == View_clients) {
            ViewClientsController a = new ViewClientsController();
            a.setVisible(true);
            this.setVisible(false);
        } else if (event.getSource() == Back) {
            LoginController a = new LoginController();
            a.setVisible(true);
            this.setVisible(false);
        }
        else if (event.getSource() == View_Listings)
        {
            ViewListingsController a = new ViewListingsController();
            a.setVisible(true);
            this.setVisible(false);
        }
    }

    public void setVisible(boolean b) {
    }
}
