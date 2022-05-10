module Proyecto.PedroProyecto {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;
	requires java.xml.bind;
	requires javafx.graphics;
	requires javafx.base;

    opens Proyecto.PedroProyecto to javafx.fxml;
    exports Proyecto.PedroProyecto;
}
