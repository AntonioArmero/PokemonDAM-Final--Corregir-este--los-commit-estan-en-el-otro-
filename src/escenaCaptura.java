import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


import modelo.Pokemon;

public class escenaCaptura implements Initializable{

    @FXML
    private Button capturaBtn;


    Pokemon p = new Pokemon();
    


@FXML
    private void capturar(ActionEvent event)throws IOException{

        Connection con;
        String url = "jdbc:mysql://localhost:3306/pokemondam";
        String login = "root";
        String password = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, login, password);

            System.out.println("Conexión establecida");

            p.probCapturar(con);

            try {
                con.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 

    }


@Override
public void initialize(URL arg0, ResourceBundle arg1) {
    
    
    }

    @FXML
        private void pokemonRandom(ActionEvent event)throws IOException{

        Connection con;
        String url = "jdbc:mysql://localhost:3306/pokemondam";
        String login = "root";
        String password = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, login, password);

            System.out.println("Conexión establecida");

            p.mostrarPokemon(con);

            try {
                con.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();


        } catch (SQLException sqle) {
            sqle.printStackTrace();

        }
    }

}
