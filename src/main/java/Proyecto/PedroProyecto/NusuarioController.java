package Proyecto.PedroProyecto;

import java.io.IOException;

import javafx.fxml.FXML;

public class NusuarioController {
	/*
	 * Cambia a la escena login al pulsar un botón
	 */
	@FXML
    private void switchToLoginBack() throws IOException {
        App.setRoot("Login");
    }
}
