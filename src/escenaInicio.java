

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class escenaInicio implements Initializable {

    @FXML
    private Button btnCaptura;

    @FXML
    private void capturarInicio(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/captura.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        //stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
