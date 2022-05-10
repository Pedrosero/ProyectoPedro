package Proyecto.PedroProyecto;

import java.io.IOException;

import javafx.fxml.FXML;

public class NusuarioController {
	@FXML
    private void switchToLoginBack() throws IOException {
        App.setRoot("Login");
    }
}
