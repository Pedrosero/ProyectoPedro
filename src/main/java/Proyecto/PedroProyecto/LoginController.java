package Proyecto.PedroProyecto;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    
	/*
	 * Cambia a la escena Nuevo usuario al pulsar un botón
	 */
	
	@FXML
    void switchToNusuario() throws IOException {
        App.setRoot("Nusuario");
    
    }
	
	/*
	 * Agrego un usuario a mano para probar las vistas 
	 * Al final se accede con los usuarios que estén registrados en 
	 * la base de datos
	 */
	@FXML
	private TextField NombreUsu;
	
	@FXML
	private PasswordField ContraUsuario;
	
	@FXML
	public void botonAcceso() throws IOException{
		checkLogin();
		}
	/*
	 * Verifica que los datos introducidos son esos
	 */
	 private void checkLogin() throws IOException {
	        App a = new App();
	        if(NombreUsu.getText().toString().equals("Admin") && ContraUsuario.getText().toString().equals("123")) {

	            App.setRoot("Biblioteca");
	       
	    }
	}
	
   
}
