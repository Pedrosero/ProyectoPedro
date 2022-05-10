package Proyecto.PedroProyecto;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Modelo.Cancion;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BibliotecaController {

	/*
	 * Cambia a la escena login al pulsar un botón
	 */
    @FXML
    private void bl() throws IOException {
        App.setRoot("Login");
    }
    
    /*
	 * Cambia a la escena de canciones favoritas al pulsar un botón
	 */
    @FXML
    private void GoFav() throws IOException {
        App.setRoot("Favoritas");
    }
    
    @FXML private Button anadeCancion;
    
    @FXML private TextField NombreCan;
	@FXML private TextField NombreGen;
	@FXML private TextField TCancion;
	@FXML private TextField NombreArtista;
	
	@FXML private TableView<Cancion> tablaCancion;
	@FXML private TableColumn colNombre;
	@FXML private TableColumn colGenero;
	@FXML private TableColumn colDuracion;
	@FXML private TableColumn colArtista;
	private ObservableList<Cancion> canciones;
	
	
	public void initialize(URL url, ResourceBundle rb) {
		canciones = FXCollections.observableArrayList();
		
		this.colNombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
		this.colGenero.setCellValueFactory(new PropertyValueFactory("Genero"));
		this.colDuracion.setCellValueFactory(new PropertyValueFactory("Duracion"));
		this.colArtista.setCellValueFactory(new PropertyValueFactory("Artista"));

	}
	
	@FXML
	private void anadirCan(ActionEvent event) {
		try {
			String Nombre = this.NombreCan.getText();
			String Genero = this.NombreGen.getText();
			String Duracion = this.TCancion.getText();
			String Artista = this.NombreArtista.getText();
			
			Cancion c = new Cancion(Nombre, Genero, Duracion, Artista, null, 0);
			
			if (!this.canciones.contains(c)) {
				this.canciones.add(c);
				this.tablaCancion.setItems(canciones);
			}else {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("Formato incorrecto");
				alert.showAndWait();
			}
		}catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto");
			alert.showAndWait();
		}
		

	}
	
	
	    
}