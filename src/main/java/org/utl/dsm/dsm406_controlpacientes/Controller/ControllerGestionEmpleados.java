package org.utl.dsm.dsm406_controlpacientes.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.utl.dsm.dsm406_controlpacientes.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGestionEmpleados implements Initializable {
    @FXML private Button btnBarraClientes;
    @FXML private Button btnBarraEmpleados;
    @FXML private Button btnBarraInicio;
    @FXML private Button btnBarraCompras;
    @FXML private Button btnBarraProductos;
    @FXML private Button btnBarraVentas;
    @FXML private MenuButton menuOpciones;
    @FXML private MenuItem btnCerrarSesion;

    @FXML private Button btnEliminar;
    @FXML private Button btnLimpiar;
    @FXML private Button btnModificar;
    @FXML private Button btnRegistrar;

    @FXML private TableView<?> tblRegistros;
    @FXML private TableColumn<?, ?> tcolApellidoM;
    @FXML private TableColumn<?, ?> tcolApellidoP;
    @FXML private TableColumn<?, ?> tcolEstatus;
    @FXML private TableColumn<?, ?> tcolNombre;

    @FXML private TextField txtApellidoM;
    @FXML private TextField txtApellidoP;
    @FXML private TextField txtBuscar;
    @FXML private TextField txtCiudad;
    @FXML private TextField txtCodigoPostal;
    @FXML private TextField txtColonia;
    @FXML private TextField txtCorreo;
    @FXML private TextField txtCurp;
    @FXML private TextField txtDomicilio;
    @FXML private TextField txtEstado;
    @FXML private DatePicker txtFechaNac;
    @FXML private TextField txtFoto;
    @FXML private TextField txtGenero;
    @FXML private TextField txtID;
    @FXML private TextField txtNombre;
    @FXML private TextField txtRfc;
    @FXML private TextField txtTelefono;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnBarraInicio.setOnAction(event -> {
            try {
                abrirInicio();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        btnBarraClientes.setOnAction(event -> {
            try {
                abrirModuloClientes();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        btnBarraEmpleados.setOnAction(event -> {
            try {
                abrirModuloEmpleados();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        btnBarraProductos.setOnAction(event -> {
            try {
                abrirModuloBuscarProductos();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        btnBarraCompras.setOnAction(event -> {
            try {
                abrirModuloCompras();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        btnBarraVentas.setOnAction(event -> {
            try {
                abrirModuloVentas();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        btnCerrarSesion.setOnAction(event -> {
            try {
                cerrarSesion();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }



    private void abrirInicio() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load (Main.class.getResource("view_inicioSucursal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) btnBarraInicio.getScene().getWindow();
        ventanaLogin.close();
    }


    private void abrirModuloEmpleados() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("view_gestionEmpleados.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) btnBarraEmpleados.getScene().getWindow();
        ventanaLogin.close();
    }

    private void abrirModuloClientes() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("view_gestionClientes.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) btnBarraClientes.getScene().getWindow();
        ventanaLogin.close();
    }

    private void abrirModuloBuscarProductos() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("view_busquedaProductos.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) btnBarraProductos.getScene().getWindow();
        ventanaLogin.close();
    }

    private void abrirModuloCompras() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("view_gestionCompras.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) btnBarraCompras.getScene().getWindow();
        ventanaLogin.close();
    }

    private void abrirModuloVentas() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("view_gestionVentas.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) btnBarraVentas.getScene().getWindow();
        ventanaLogin.close();
    }

    private void cerrarSesion() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load (Main.class.getResource("view_principal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Medicamos tu vida");
        stage.show();
        // Para cerrar la ventana Login:
        Stage ventanaLogin = (Stage) menuOpciones.getScene().getWindow();
        ventanaLogin.close();
    }
}
