package vista;

import javax.swing.*;
import java.awt.*;

public class VistaPasajero extends JInternalFrame {

    private JTextField txtNombre = new JTextField(10);
    private JTextField txtAPaterno = new JTextField(10);
    private JTextField txtAMaterno = new JTextField(10);
    private JTextField txtNoCuenta = new JTextField(10);
    private JTextField txtFechaNac = new JTextField(10);
    private JTextField txtNombreEscuela = new JTextField(10);
    private static String[] carrera = {"Contaduria", "Administracion", "Informatica",
            "Negocios Internacionales"};
    private JList<String> lstCarrera = new JList<>(carrera);
    private static String[] semestre = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private JList<String> lstSemestre = new JList<>(semestre);
    private static String[] turno = {"Matutino", "Vespertino", "Mixto"};
    private JList<String> lstTurno = new JList<>(turno);
    private JTextField txtInstagram = new JTextField(10);
    private JTextField txtTelefono = new JTextField(10);
    private JTextField txtEmail = new JTextField(10);
    private JTextField txtRutaElegida = new JTextField(10);
    private JTextField txtPuntoOrigen = new JTextField(10);
    private JTextField txtPuntoDestino = new JTextField(10);


    public VistaPasajero() {

        super("Alta de pasajero", false, true, false, true);

        setSize(590, 700);

        add(crearPanelPrincipal());

        setVisible(true);

    }

    private JPanel crearPanelEdicion() {

        var pnlEdicion = new JPanel();

        var lblNombre = new JLabel("Nombre: ");
        var lblAPaterno = new JLabel("Apellido Paterno: ");
        var lblAMaterno = new JLabel("Apellido Materno: ");
        var lblNoCuenta = new JLabel("Numero de Cuenta: ");
        var lblFechaNac = new JLabel("Fecha Nacimiento: ");
        var lblNombreEscuela = new JLabel("Nombre Escuela: ");
        var lblCarrera = new JLabel("Carrera: ");
        var lblSemestre = new JLabel("Semestre: ");
        var lblTurno = new JLabel("Turno: ");
        var lblInstagram = new JLabel("Instagram: ");
        var lblTelefono = new JLabel("Telefono: ");
        var lblEmail = new JLabel("Email: ");
        var lblRutaEle = new JLabel("Ruta elegida: ");
        var lblPuntoOrigen = new JLabel("Punto Origen: ");
        var lblPuntoDestino = new JLabel("Punto Destino: ");

        pnlEdicion.setLayout(new GridLayout(15, 2, 3, 3));

        pnlEdicion.setBorder(BorderFactory.createTitledBorder("INGRESE LOS DATOS DEL PASAJERO"));

        pnlEdicion.add(lblNombre);
        pnlEdicion.add(txtNombre);

        pnlEdicion.add(lblAPaterno);
        pnlEdicion.add(txtAPaterno);

        pnlEdicion.add(lblAMaterno);
        pnlEdicion.add(txtAMaterno);

        pnlEdicion.add(lblNoCuenta);
        pnlEdicion.add(txtNoCuenta);

        pnlEdicion.add(lblFechaNac);
        pnlEdicion.add(txtFechaNac);

        pnlEdicion.add(lblNombreEscuela);
        pnlEdicion.add(txtNombreEscuela);

        lstCarrera.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        var jsListCarrera = new JScrollPane(lstCarrera);

        jsListCarrera.setPreferredSize(new Dimension(120, 90));

        pnlEdicion.add(lblCarrera);
        pnlEdicion.add(jsListCarrera);

        lstSemestre.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        var jsListSemestre = new JScrollPane(lstSemestre);

        jsListSemestre.setPreferredSize(new Dimension(120, 90));

        pnlEdicion.add(lblSemestre);
        pnlEdicion.add(jsListSemestre);

        lstTurno.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        var jsListTurnno = new JScrollPane(lstTurno);
        jsListTurnno.setPreferredSize(new Dimension(120, 90));

        pnlEdicion.add(lblTurno);
        pnlEdicion.add(jsListTurnno);

        pnlEdicion.add(lblInstagram);
        pnlEdicion.add(txtInstagram);

        pnlEdicion.add(lblTelefono);
        pnlEdicion.add(txtTelefono);

        pnlEdicion.add(lblEmail);
        pnlEdicion.add(txtEmail);

        pnlEdicion.add(lblRutaEle);
        pnlEdicion.add(txtRutaElegida);

        pnlEdicion.add(lblPuntoOrigen);
        pnlEdicion.add(txtPuntoOrigen);

        pnlEdicion.add(lblPuntoDestino);
        pnlEdicion.add(txtPuntoDestino);

        return pnlEdicion;

    }

    private JPanel crearPanelControl() {

        var pnlControl = new JPanel();

        pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

        pnlControl.setBorder(BorderFactory.createTitledBorder("OPCIONES DE CONTROL"));

        var btnAlta = new JButton("Alta Pasajero");
        var btnCancelar = new JButton("Cancelar");

        pnlControl.add(Box.createHorizontalStrut(100));

        pnlControl.add(btnAlta);

        pnlControl.add(Box.createHorizontalStrut(20));

        pnlControl.add(btnCancelar);

        return pnlControl;

    }

    private JPanel crearPanelPrincipal() {

        var pnlPrincipal = new JPanel();

        pnlPrincipal.setLayout(new BorderLayout());

        pnlPrincipal.add(crearPanelEdicion(), BorderLayout.CENTER);

        pnlPrincipal.add(crearPanelControl(), BorderLayout.SOUTH);

        return pnlPrincipal;

    }



}