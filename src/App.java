

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Pokemon;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
        String url = "jdbc:mysql://localhost:3306/pokemondam";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");
            


            try {
				connection.close();
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
    public void start(Stage primaryStage) {
       try {
              Parent root = FXMLLoader.load(getClass().getResource("inicio.fxml"));
              Scene scene = new Scene(root);

              primaryStage.setScene(scene);
              primaryStage.show();
    } catch (IOException e) {
            e.printStackTrace();

    }  
    
}
}
