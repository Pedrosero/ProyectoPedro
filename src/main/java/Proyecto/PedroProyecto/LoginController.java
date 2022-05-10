package Proyecto.PedroProyecto;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    
	
	
	@FXML
    void switchToNusuario() throws IOException {
        App.setRoot("Nusuario");
    
    }
	
	@FXML
	private TextField NombreUsu;
	
	@FXML
	private PasswordField ContraUsuario;
	
	@FXML
	public void botonAcceso() throws IOException{
		checkLogin();
		}
	 private void checkLogin() throws IOException {
	        App a = new App();
	        if(NombreUsu.getText().toString().equals("Admin") && ContraUsuario.getText().toString().equals("123")) {

	            App.setRoot("Biblioteca");
	       
	    }
	}
	
   
}
